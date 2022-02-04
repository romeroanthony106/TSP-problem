package tsp_stuff;

import java.util.ArrayList;
import java.util.List;

public class Path {
	private ArrayList<Node> path = new ArrayList<Node>();
	private double distance = 0;
	
	public void addNode(Node node) {
		this.path.add(node);
	}
	
	public void printPath() {
		int i = 0;
		while(i < this.path.size()) {
			System.out.print(this.path.get(i).getN());
			System.out.print("\t");
			i++;
		}
		System.out.print("\n");
	}
	
	public void setFromArray(List<Node> nodes) {
		int i = 0;
		while(i < nodes.size()) {
			this.path.add(nodes.get(i));
			i++;
		}
	}
	
	private void calculateDistance() {
		int i = 0;
		this.distance = 0;
		while(i < (this.path.size())- 1) {
			Node curr = this.path.get(i);
			Node nextNode = this.path.get(i+1);
			double distance_x = Math.abs(nextNode.getX()-curr.getX());
			double distance_y = Math.abs(nextNode.getY()-curr.getY());
			double curr_distance = Math.sqrt((Math.pow(distance_x, 2)) + (Math.pow(distance_y, 2)));
			this.distance += curr_distance;
			i ++;
		}
	}

	public double getDistance() {
		calculateDistance();
		return distance;
	}
	
	public void printDistance() {
		calculateDistance();
		System.out.print(this.distance);
		System.out.print("\n");
	}


}
