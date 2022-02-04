package tsp_stuff;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Node> nodes = new ArrayList<Node>();
		ArrayList<Node> nodesCopy = new ArrayList<Node>();
		/*File_Reader file_reader = new File_Reader();
		nodes = file_reader.getNodes();*/
		
		
		Generate_Nodes randomNodes = new Generate_Nodes(100,100,10);
		nodes = randomNodes.getNodes();
		
		nodesCopy = (ArrayList<Node>) nodes.clone();
		System.out.print("Exhaustive \n");
		Exhaustive_Algorithm exhaustive = new Exhaustive_Algorithm();
		exhaustive.setNodes(nodesCopy);
		Path shortest_Exhaustive = exhaustive.run();
		shortest_Exhaustive.printDistance();
		shortest_Exhaustive.printPath();
		
		nodesCopy = (ArrayList<Node>) nodes.clone();
		System.out.print("\n Greedy \n");
		Greedy_Heuristic greedy = new Greedy_Heuristic();
		greedy.setNodes(nodesCopy);
		Path shortest_Greedy = greedy.run();
		shortest_Greedy.printDistance();
		shortest_Greedy.printPath();
	}

	
	
}
