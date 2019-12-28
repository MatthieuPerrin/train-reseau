package fr.perrin.trains.simulator;

import java.util.ArrayList;
import java.util.List;

public class GraphSegment {

	private List<Edge> edges = new ArrayList<Edge>();
	private final String name;

	public GraphSegment(String name) {
		this.name = name;
	}
	
	public void addEdge(Edge e) {
		edges.add(e);
	}
	
	public List<Edge> getEdges() {
		return edges;
	}
	
	public String getName() {
		return name;
	}
	
	public Complex getBarycenter() {
		Complex sum = new Complex(0,0);
		int count = 0;
		for(Edge edge : edges) {
			for (Complex c : edge.nodes) {
				sum = Complex.sum(sum, c);
				count ++;
			}
		}
		return new Complex(sum.x/count, sum.y/count);
	}
	
}
