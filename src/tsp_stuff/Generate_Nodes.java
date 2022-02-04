package tsp_stuff;

import java.util.ArrayList;
import java.util.Random;

public class Generate_Nodes {
	private int max_x;
	private int max_y;
	private int size;
	private ArrayList<Node> nodes = new ArrayList<>();
	public Generate_Nodes(int max_x, int max_y, int size) {
		super();
		this.max_x = max_x;
		this.max_y = max_y;
		this.size = size;
		
		generatePoints();
		
	}
	
	private void generatePoints() {
		int i = 0;
		Random rand = new Random();
		while(i < this.size) {
			Node current = new Node();
			current.setN(i);
			current.setX(rand.nextInt(this.max_x));
			current.setY(rand.nextInt(this.max_y));
			this.nodes.add(current);
			i++;
		}
	}



	public ArrayList<Node> getNodes() {
		return this.nodes;
	}
	
	
	
}
