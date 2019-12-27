package fr.perrin.trains.simulator;

import java.util.ArrayList;
import java.util.List;

public class Edge {
	List<Complex> nodes = new ArrayList<Complex>();
	String name;
	Node start;
	Node end;
	GraphSegment segment;
	public void addNode(Complex node) { nodes.add(node); }
}
