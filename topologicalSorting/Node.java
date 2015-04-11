import java.util.LinkedList;


public class Node {

	LinkedList<Integer> parents;
	LinkedList<Integer> children;
	boolean visited;
	
	public Node(){
		parents= new LinkedList<Integer>();
		children= new LinkedList<Integer>();
		visited= false;
	}
}
