package tsp_stuff;

import java.util.ArrayList;

public class Distance_Test {
	private ArrayList<Path> paths = new ArrayList<Path>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node();
		a.setN(0);
		a.setX(0);
		a.setY(0);
		
		Node b = new Node();
		b.setN(1);
		b.setX(2);
		b.setY(2);
		
		Node c = new Node();
		c.setN(2);
		c.setX(6);
		c.setY(5);
		
		Path curr = new Path();
		curr.addNode(a);
		curr.addNode(b);
		curr.addNode(c);
		//System.out.print(curr.getDistance());
		curr.printPath();
		

	}

}
