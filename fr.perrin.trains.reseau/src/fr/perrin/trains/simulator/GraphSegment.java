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
	
}
