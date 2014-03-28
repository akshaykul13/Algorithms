package Graph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class GraphClient {
	
	private static int numberOfVertices;

	public static void main(String[] args) {			
		String current;
		try {
			current = new java.io.File( "." ).getCanonicalPath();
			current = current + "\\src\\Graph\\Input.txt";
		    System.out.println(current);	
		} catch (IOException e) {				
			e.printStackTrace();
		}											
	}
	
	public static GraphAPI prepareGraph(String inputFile){
		BufferedReader br = null;
		GraphAPI graph = null;
		try {			 
			String sCurrentLine;						
			br = new BufferedReader(new FileReader(inputFile.toString()));
			sCurrentLine = br.readLine();
			numberOfVertices = Integer.valueOf(sCurrentLine);
			graph = new GraphAPI(numberOfVertices);
			sCurrentLine = br.readLine();
			graph.setE(Integer.valueOf(sCurrentLine));
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
				String[] vertexArray = sCurrentLine.split(" ");
				graph.addEdge(Integer.valueOf(vertexArray[0]), Integer.valueOf(vertexArray[1]));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}			
		return graph;
	}
}
