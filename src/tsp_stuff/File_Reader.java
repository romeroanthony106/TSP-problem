package tsp_stuff;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class File_Reader {
	private ArrayList<Node> nodes = new ArrayList<Node>();
	
	 // Main driver method
    public static void main(String[] args) throws Exception
    {
    	
        
    }

	public File_Reader() throws FileNotFoundException {
		super();
		File file = new File("C:\\Users\\romer\\Documents\\GitHub\\TSP problem\\nodes.txt");
        int n = 0;
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
        	n++;
            String i = sc.nextLine();
            String[] split = i.split(" ");
            if(split.length>1) {
            	Node curr_Node = new Node();
            	curr_Node.setN(n);
            	curr_Node.setX(Integer.valueOf(split[0]));
            	curr_Node.setY(Integer.valueOf(split[1]));
            	this.nodes.add(curr_Node);
            }
        }
        Node firstNode = this.nodes.get(0);
        System.out.print(firstNode.getX());
	}

	public ArrayList<Node> getNodes() {
		return nodes;
	}
	
	
    
	 
}
