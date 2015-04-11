import java.util.ArrayList;
import java.util.Scanner;

public class Graph {
	ArrayList<Node> list;
	int nodes;
	int edges;

	public Graph(int n, int e) {
		this.nodes = n;
		this.edges = e;
		list = new ArrayList<Node>();
		for (int i = 0; i < nodes; i++) {
			list.add(new Node());
		}
	}

//	public void addEdges() {
//		Scanner in = new Scanner(System.in);
//		in.close();
//		return;
//	}

}
