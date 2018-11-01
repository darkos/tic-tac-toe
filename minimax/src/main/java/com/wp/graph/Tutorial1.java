package com.wp.graph;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

public class Tutorial1 {
	
	public static void main(String args[]) {
		Graph graph = new SingleGraph("Tutorial 1");
//		graph.addNode("A" );
//		graph.addNode("B" );
//		graph.addNode("C" );
//		graph.addEdge("AB", "A", "B");
//		graph.addEdge("BC", "B", "C");
//		graph.addEdge("CA", "C", "A");
		
		graph.setStrict(false);
		graph.setAutoCreate( true );
		graph.addEdge( "AB", "A", "B" );
		graph.addEdge( "BC", "B", "C" );
		graph.addEdge( "CD", "C", "D" );
		graph.addEdge( "DA", "D", "A" );
		
		graph.display();
	}

}
