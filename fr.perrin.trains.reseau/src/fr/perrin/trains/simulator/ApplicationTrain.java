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
		Color color = new Color(125,150,255);
		for(Node node : nodes) drawPoint(g, node);
		for(GraphSegment segment : segments) {
			drawSegment(g, segment, color);
		}
		for(GraphSegment segment : segments) {
			for(Edge path : segment.getEdges()) {
				for(int i = 0; i < path.nodes.size() - 1; i++) {
					drawDirection(g,xToPixel(path.nodes.get(i)), yToPixel(path.nodes.get(i)), xToPixel(path.nodes.get(i+1)), yToPixel(path.nodes.get(i+1)), color);
				}
			}
			Complex c = segment.getBarycenter();
			g.setColor(color);//new Color(30,50,150));
			g.drawString(segment.getName(), xToPixel(c)-10, yToPixel(c)-5);
		}
	}

	double largSegment = 2;

	private void drawSegment(Graphics g, GraphSegment segment, Color color) {
		for(Edge edge : segment.getEdges()) {
			for(int i = 0; i < edge.nodes.size() - 1; i++) {
				drawEdgePart(g,xToPixel(edge.nodes.get(i)), yToPixel(edge.nodes.get(i)), xToPixel(edge.nodes.get(i+1)), yToPixel(edge.nodes.get(i+1)), color);
			}
			drawNode(g,edge.start, color);
			drawNode(g,edge.end, color);
		}
	}

	private void drawEdgePart(Graphics g, int x1, int y1, int x2, int y2, Color c) {
		double angle = Math.atan2(x2 - x1, y2 - y1);
		double sin = Math.sin(angle);
		double cos = Math.cos(angle);
		int largPt = (int)(largSegment);
		int x [] = {(int)(x1 + largSegment*cos), (int)(x1 - largSegment*cos), (int)(x2 - largSegment*cos), (int)(x2 + largSegment*cos)};
		int y [] = {(int)(y1 - largSegment*sin), (int)(y1 + largSegment*sin), (int)(y2 + largSegment*sin), (int)(y2 - largSegment*sin)};
		g.setColor(c);
		g.fillPolygon(x,y,4);
		g.setColor(Color.BLACK);
		g.drawLine(x[0],y[0],x[3],y[3]);
		g.drawLine(x[1],y[1],x[2],y[2]);
		g.setColor(c);
		g.fillOval(x1-largPt-1, y1-largPt, 2*largPt, 2*largPt);
		g.fillOval(x2-largPt, y2-largPt, 2*largPt, 2*largPt);
		g.setColor(Color.BLACK);
		g.drawOval(x1-largPt, y1-largPt, 2*largPt, 2*largPt);
		g.drawOval(x2-largPt, y2-largPt, 2*largPt, 2*largPt);
	}
	
	private void drawDirection(Graphics g, int x1, int y1, int x2, int y2, Color c) {
		double angle = Math.atan2(y2 - y1, x2 - x1);
		double angle2 = 0.4;
		double long2 = 15;
		int xC = (x1 + 3*x2)/4;
		int yC = (y1 + 3*y2)/4;
		int x [] = {xC, (int)(xC - long2*Math.cos(angle+angle2)), (int)(xC - long2*Math.cos(angle-angle2))};
		int y [] = {yC, (int)(yC - long2*Math.sin(angle+angle2)), (int)(yC - long2*Math.sin(angle-angle2))};
		g.setColor(c);
		g.fillPolygon(x,y,3);
		g.setColor(Color.BLACK);
		g.drawPolygon(x,y,3);
	}

	private void drawNode(Graphics g, Node node, Color color) {
		int x = xToPixel(node.position);
		int y = yToPixel(node.position);
		int lg = 5;
		g.setColor(color);
		g.fillOval(x-lg, y-lg, 2*lg, 2*lg);
		g.setColor(Color.BLACK);
		g.drawOval(x-lg, y-lg, 2*lg, 2*lg);
		g.drawString(node.name, x+4, y-4);
	}

	private void drawPoint(Graphics g, Node node) {
		int x = xToPixel(node.position);
		int y = yToPixel(node.position);
		if(node.edgesIn.isEmpty() && node.edgesOut.isEmpty()) {
			int lg = 4;
			g.setColor(new Color(150,150,150));
			g.drawLine(x-lg,y-lg,x+lg,y+lg);
			g.drawLine(x-lg,y+lg,x+lg,y-lg);
			g.drawString(node.name, x+4, y-4);
		}
		/*
		g.fillOval(x-8, y-8, 16, 16);
		g.setColor(Color.BLACK);
		g.drawOval(x-8, y-8, 16, 16);
		*/
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