package fr.perrin.trains.simulator;

import java.util.ArrayList;
import java.util.List;

public class Node {
	final Complex position;
	final String name;
	final List<Edge> edgesIn = new ArrayList<Edge>();
	final List<Edge> edgesOut = new ArrayList<Edge>();
	public Node(Complex position, String name) {
		this.position = position;
		this.name = name;
	}

}
