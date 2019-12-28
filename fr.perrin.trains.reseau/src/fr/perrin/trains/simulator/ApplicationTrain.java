package fr.perrin.trains.simulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public abstract class ApplicationTrain extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private Timer timer = new Timer(50, this);
	private JFrame frame = new JFrame();

	private List<GraphSegment> segments = new ArrayList<GraphSegment>();
	private List<Node> nodes = new ArrayList<Node>();

	private int height;
	private int width;
	private int padding = 100;
	private double xmin = Double.MAX_VALUE;
	private double xmax = Double.MIN_VALUE;
	private double ymin = Double.MAX_VALUE;
	private double ymax = Double.MIN_VALUE;
		
	public abstract void initialize();
	public abstract String getName();

	
	public Node addNode(Complex c, String name) {
		if(c.x < xmin) xmin = c.x;
		if(c.x > xmax) xmax = c.x;
		if(c.y < ymin) ymin = c.y;
		if(c.y > ymax) ymax = c.y;
		for(Node n : nodes) {
			if(n.position.equals(c)) {
				return n;
			}
		}
		Node n = new Node(c, name);
		nodes.add(n);
		return n;
	}
	
	public List<Node> getNodes() {
		return nodes;
	}

	
	public void addSegment(GraphSegment segment) {
		segments.add(segment);
		for(Edge path : segment.getEdges()) {
			path.start = addNode(path.nodes.get(0), "");
			path.end = addNode(path.nodes.get(path.nodes.size()-1), "");
			path.start.edgesOut.add(path);
			path.end.edgesIn.add(path);
			path.segment = segment;
			for(Complex c : path.nodes) {
				if(c.x < xmin) xmin = c.x;
				if(c.x > xmax) xmax = c.x;
				if(c.y < ymin) ymin = c.y;
				if(c.y > ymax) ymax = c.y;
			}
		}
	}
	
	public void start() {
		initialize();
		frame.setContentPane(this);
		frame.setTitle(getName());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		timer.start();
		frame.setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		height = getHeight();
		width = getWidth();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, width, height);
		g.setColor(Color.BLACK);
		for(GraphSegment segment : segments) {
			Color color;
			color = new Color(125,150,255);
			for(Edge path : segment.getEdges()) {
				for(int i = 0; i < path.nodes.size() - 1; i++) {
					g.setColor(color);
					drawSegment(g,xToPixel(path.nodes.get(i)), yToPixel(path.nodes.get(i)), xToPixel(path.nodes.get(i+1)), yToPixel(path.nodes.get(i+1)));
				}
			}
		}
		for(GraphSegment segment : segments) {
			for(Edge path : segment.getEdges()) {
				for(int i = 0; i < path.nodes.size() - 1; i++) {
					drawDirection(g,xToPixel(path.nodes.get(i)), yToPixel(path.nodes.get(i)), xToPixel(path.nodes.get(i+1)), yToPixel(path.nodes.get(i+1)));
				}
			}
		}
		for(Node node : nodes) {
			drawNode(g, node, xToPixel(node.position), yToPixel(node.position));
		}
	}

	private void drawSegment(Graphics g, int x1, int y1, int x2, int y2) {
		double angle = Math.atan2(x2 - x1, y2 - y1);
		double sin = Math.sin(angle);
		double cos = Math.cos(angle);
		double larg = 3;
		int x [] = {(int)(x1 + larg*cos), (int)(x1 - larg*cos), (int)(x2 - larg*cos), (int)(x2 + larg*cos)};
		int y [] = {(int)(y1 - larg*sin), (int)(y1 + larg*sin), (int)(y2 + larg*sin), (int)(y2 - larg*sin)};
		g.fillPolygon(x,y,4);
		g.setColor(Color.BLACK);
		g.drawLine(x[0],y[0],x[3],y[3]);
		g.drawLine(x[1],y[1],x[2],y[2]);
		g.setColor(new Color(200,200,200));
		g.fillOval(x1-6, y1-6, 12, 12);
		g.fillOval(x2-6, y2-6, 12, 12);
		g.setColor(Color.BLACK);
		g.drawOval(x1-6, y1-6, 12, 12);
		g.drawOval(x2-6, y2-6, 12, 12);
	}
	
	private void drawDirection(Graphics g, int x1, int y1, int x2, int y2) {
		double angle = Math.atan2(x2 - x1, y2 - y1);
		int xC = (x1 + 2*x2)/3;
		int yC = (y1 + 2*y2)/3;
		int x [] = {xC, (int)(xC - 8*Math.sin(angle + 0.5)), (int)(xC - 8*Math.sin(angle - 0.5))};
		int y [] = {yC, (int)(yC - 8*Math.cos(angle + 0.5)), (int)(yC - 8*Math.cos(angle - 0.5))};
		g.setColor(Color.BLACK);
		g.fillPolygon(x,y,3);
	}

	private void drawNode(Graphics g, Node node, int x, int y) {
		g.setColor(new Color(200,200,200));
		g.fillOval(x-8, y-8, 16, 16);
		g.setColor(Color.BLACK);
		g.drawOval(x-8, y-8, 16, 16);
		g.drawString(node.name, x, y);
	}

	private int xToPixel(Complex c) {
		return (int)(padding + (c.x - xmin) * (width - 2*padding) / (xmax - xmin));
	}
	private int yToPixel(Complex c) {
		return (int)(padding + (c.y - ymax) * (height - 2*padding) / (ymin - ymax));
	}
	
	public void actionPerformed(ActionEvent ev){
		if(ev.getSource()==timer){
			repaint();
		}
	}	
}