package tsp_stuff;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
	private static ArrayList<Node> nodes = new ArrayList<Node>();
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//System.out.print("test");
		File_Reader file_reader = new File_Reader();
		nodes = file_reader.getNodes();
		
		Exhaustive_Algorithm exhaustive = new Exhaustive_Algorithm();
		exhaustive.setNodes(nodes);
		Path shortest_Exhaustive = exhaustive.run();
		shortest_Exhaustive.printDistance();
		shortest_Exhaustive.printPath();
	}

	
	
}
