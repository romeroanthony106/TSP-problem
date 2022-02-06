package tsp_stuff;

import java.util.ArrayList;

public class Greedy_Heuristic {
	private ArrayList<Node> nodes = new ArrayList<>();
	private ArrayList<Node> visited = new ArrayList<>();
	private ArrayList<Node> nextPossible = new ArrayList<>();
	private Node first = new Node();
	private Path finalPath = new Path();

	public void setNodes(ArrayList<Node> nodes) {
		this.nodes = nodes;
		this.visited.clear();
		this.first = null;
		
	}
	
	public Path run() {
		this.visited.clear();
		this.first = this.nodes.get(0);
		this.visited.add(first);
		Node Next = null;
		Node current = first;
		while(this.visited.size() < this.nodes.size()) {
			Next = generateNext(current);
			this.visited.add(Next);
			current = Next;
		}
		
		
		this.finalPath.setFromArray(visited);
		this.finalPath.addNode(first);
		return this.finalPath;
		
	}
	
	private Node generateNext(Node current) {
		this.nextPossible.clear();
		int i = 0;
		while(i < this.nodes.size()) {
			if(this.visited.contains(this.nodes.get(i)) == false ) {
				this.nextPossible.add(this.nodes.get(i));
			}
			i++;
		}
		i = 1;
		Node next = null;
		double shortestDistance = getDistance(current, this.nextPossible.get(0));
		Node nextNode = this.nextPossible.get(0);
		while(i < this.nextPossible.size()) {
			if(getDistance(current, this.nextPossible.get(i)) < shortestDistance) {
				nextNode = this.nextPossible.get(i);
			}
			i++;
		}
		return nextNode;
		
	}
	
	private double getDistance(Node a, Node b) {
		double distance_x = Math.abs(b.getX()-a.getX());
		double distance_y = Math.abs(b.getY()-a.getY());
		double curr_distance = Math.sqrt((Math.pow(distance_x, 2)) + (Math.pow(distance_y, 2)));
		return curr_distance;
	}
	
	
	
}
