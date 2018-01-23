import java.util.*;

public class GraphAdjList extends Graph {
	private Map<Integer, ArrayList<Integer>> adjListsMap;
	
	public void implementAddVertex() {
		int v = getNumVertices();
		ArrayList<Integer> neighbors = new ArrayList<Integer>();
		adjListsMap.put(v, neighbors);
	}
	
	public void implementAddEdge(int v, int w) {
		(adjListsMap.get(v)).add(w);
	}

	@Override
	public List<Integer> getNeighbors(int v) {
		// should return a copy of the list, not the list itself
		// return new ArrayList<Integer>(adjListsMap.get(v));
		return null;
	}
	
	public List<Integer> getDistance2 (int v) {
		List<Integer> twoHop = new ArrayList<Integer>();
		List<Integer> oneHop = adjListsMap.get(v);
		// Loop thru oneHop and get the neighbors of each
		
		return twoHop;
	}
}
