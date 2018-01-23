import java.util.ArrayList;
import java.util.List;

public class GraphAdjMatrix extends Graph {

	private int[][] adjMatrix;
	
	public void implementAddEdge(int v, int w) {
		adjMatrix[v][w] = 1;
	}
	
	public void implementAddVertex() {
		int v = getNumVertices();
		if (v >= adjMatrix.length) {
			int[][] newAdjMatrix = new int[v*2][v*2];
			for (int i=0; i<adjMatrix.length; i++) {
				for (int j=0; j<adjMatrix.length; j++) {
					newAdjMatrix[i][j] = adjMatrix[i][j];
				}
			}
			adjMatrix = newAdjMatrix;
		}
		for (int i=0; i<adjMatrix[v].length; i++) {
			adjMatrix[v][i] = 0;
		}
	}

	@Override
	public List<Integer> getNeighbors(int v) {
		// 1. create a return list: List<Integer> neighbors = ArrayList<Integer>();
		// for (int i=0; i<getNumVertices(); i++) {
		// 		if (adjMatrix[v][i] != 0) {
		//			neighbors.add(i);
		List<Integer> neighbors = new ArrayList<Integer>();
		for (int i=0; i<getNumVertices(); i++) {
			for (int j=0; j<adjMatrix[v][i]; j++) { // take care multiple edges between a pair of vertices
				neighbors.add(i);
			}
		}
		return neighbors;
	}
	
	public List<Integer> getDistance2 (int v) {
		List<Integer> twoHop = new ArrayList<Integer>();
		for (int i=0; i<getNumVertices(); i++) {
			for (int j=0; j<adjMatrix[v][i]; j++) {
				// instead of adding i directly, add the neighbors of i
				// adjMatrix * adjMatrix has the two-hop matrix in it
			}
		}
		
		return twoHop;
	}
}
