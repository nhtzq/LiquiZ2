package org.adastraeducation.visualcs;

import org.adastraeducation.visualcs.graph.Graph;
import org.adastraeducation.visualcs.graph.PGraphicsGraphDisplayer;

import processing.pdf.PGraphicsPDF;
import processing.core.PApplet;
import processing.core.PGraphics;
import processing.core.PImage;

import java.io.*;

public class GenerateProblemSets {
	public static void BellmanFord(int n) {
		new ProblemSet("BellmanFord", n) {
			public void construct() throws java.io.IOException {
				Graph graph = new Graph(answerFile, 7, 10, 0.1, 3.0, 1);
				d = new PGraphicsGraphDisplayer(null, null, graph);
			}
			public void algorithm() {
				((Graph)answerStore).BellmanFord(0, 6);
			}
		};
	}

	public static void Prim(int n) {
		new ProblemSet("Prim", n) {
			public void construct() throws java.io.IOException {
				Graph graph = new Graph(answerFile, 7, 10, 0.1, 3.0, 1);
				d = new PGraphicsGraphDisplayer(null, null, graph);
			}
			public void algorithm() {
				Graph graph = (Graph)answerStore;
				int[] edges = new int[graph.getV()];
				graph.Prim(edges);
			}
		};		
	}

	public static void main(String[] args) throws IOException {
//		ProblemSet.setDefaultSizes(2000,2000,1000,1000);
		for (int i = 0; i < 10; i++) {
			BellmanFord(i);
		}
		for (int i = 0; i < 10; i++) {
			Prim(i);
		}
		/*
		 for (int i = 0; i < 10; i++)
		   Quicksort(i);
		 */
	}
}
