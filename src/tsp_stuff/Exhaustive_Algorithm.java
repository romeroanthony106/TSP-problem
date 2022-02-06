package tsp_stuff;

import java.util.ArrayList;
import java.util.List;

public class Exhaustive_Algorithm {
	private ArrayList<Node> nodes = new ArrayList<Node>();
	private static ArrayList<Path> paths = new ArrayList<Path>();
	private Path shortest = new Path();
	private static Node first;

	public void setNodes(ArrayList<Node> nodes) {
		this.nodes = nodes;
		this.paths.clear();
		this.first = null;
		this.shortest = null;
	}
	
	
	private void generatePaths() {
		first = nodes.get(0);
		nodes.remove(0);
		permute(this.nodes,0);
		//System.out.print("Permutated");
	}
	
	private static void permute(java.util.List<Node> arr, int k){
	        for(int i = k; i < arr.size(); i++){
	            java.util.Collections.swap(arr, i, k);
	            permute(arr, k+1);
	            java.util.Collections.swap(arr, k, i);
	        }
	        if (k == arr.size() -1){
	        	Path curr_Path = new Path();
	        	curr_Path.addNode(first);
	        	curr_Path.setFromArray(arr);
	        	curr_Path.addNode(first);
	        	paths.add(curr_Path);
	        	//curr_Path.printPath();
	            
	           
	        }
	        
	}
	
	private void findShortest() {
		int i = 0;
		this.shortest = this.paths.get(i);
		while(i < this.paths.size()) {
			if(this.paths.get(i).getDistance() < this.shortest.getDistance()) {
				this.shortest = this.paths.get(i);
			}
			i++;
		}
	}
	public Path run() {
		this.paths.clear();
		generatePaths();
		findShortest();
		return this.shortest;
		
	}
}

