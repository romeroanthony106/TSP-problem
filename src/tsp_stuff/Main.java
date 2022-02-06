package tsp_stuff;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Node> nodes = new ArrayList<Node>();
		ArrayList<Node> nodesCopy = new ArrayList<Node>();
		/*File_Reader file_reader = new File_Reader();
		nodes = file_reader.getNodes();*/
		
		
		Generate_Nodes randomNodes = new Generate_Nodes(100,100,1000);
		nodes = randomNodes.getNodes();
		
		/*nodesCopy = (ArrayList<Node>) nodes.clone();
		System.out.print("Exhaustive \n");
		Exhaustive_Algorithm exhaustive = new Exhaustive_Algorithm();
		exhaustive.setNodes(nodesCopy);
		Path shortest_Exhaustive = exhaustive.run();
		shortest_Exhaustive.printDistance();
		shortest_Exhaustive.printPath();*/
		
		nodesCopy = (ArrayList<Node>) nodes.clone();
		System.out.print("\n Greedy \n");
		Greedy_Heuristic greedy = new Greedy_Heuristic();
		greedy.setNodes(nodesCopy);
		Path shortest_Greedy = greedy.run();
		shortest_Greedy.printDistance();
		shortest_Greedy.printPath();
		
		//testing();
		
	}

	
	private static void testing() throws FileNotFoundException {
		ArrayList<Node> nodes = new ArrayList<Node>();
		ArrayList<Node> nodesCopy = new ArrayList<Node>();
		int numN = 1010;
		int numTrials = 5;
		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		long timeDurration = System.nanoTime();
		String output = null;
		PrintStream out = new PrintStream(new FileOutputStream("filename.txt"));
		Exhaustive_Algorithm exhaustive = new Exhaustive_Algorithm();
		Greedy_Heuristic greedy = new Greedy_Heuristic();
		for(int i = 1000; i < numN; i++) {
			for(int j = 0; j < numTrials; j++) {
				nodes.clear();
				Generate_Nodes randomNodes = new Generate_Nodes(100,100,i);
				nodes = randomNodes.getNodes();
				output = "";
				output += i;
				output += ",";
				
				
				/*nodesCopy = (ArrayList<Node>) nodes.clone();
				startTime = System.nanoTime();
				exhaustive.setNodes(nodesCopy);
				Path shortest_Exhaustive = exhaustive.run();
				endTime = System.nanoTime();
				timeDurration = (endTime - startTime)/1000;
				output += timeDurration;
				//System.out.print("1");
				output += ",";*/
				
				nodesCopy = (ArrayList<Node>) nodes.clone();
				startTime = System.nanoTime();
				greedy.setNodes(nodesCopy);
				Path shortest_Greedy = greedy.run();
				endTime = System.nanoTime();
				timeDurration = (endTime - startTime)/1000;
				output += timeDurration;
				output += "\n";
				System.out.print(output);
				
				out.print(output);
				
				
			}
		}
		
		
	}
	
	
}
