//the basic idea is that if we are to add a node to the sorted array, first its parent must be added. So, first check for all its parents.
//If there are no parents or all the parents are already in the list for an element, add it to the sorted array. Break this loop, if all the nodes are already added to the sorted order.
//Since, there is a possibility of forest, we need to iterate the loop, for every node
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] Args) {
		// TAKING THE FILE INPUT
		Scanner in = new Scanner(System.in);
		int nodes = in.nextInt();
		int edges = in.nextInt();
		Graph a = new Graph(nodes, edges);
		for (int i = 0; i < edges; i++) {
			int p = in.nextInt();
			int c = in.nextInt();
			a.list.get(p).children.add(c);
			a.list.get(c).parents.add(p);
		}

		ArrayList<Integer> order = new ArrayList<Integer>();
		TopoSort(a, order);
		System.out.println(order);
	}

	private static void TopoSort(Graph a, ArrayList<Integer> order) {
		for (int i = 0; i < a.list.size(); i++) {
			sort(i, a, order);
			if(order.size()==a.list.size()){
				break;
			}
		}
	}

	private static void sort(int n, Graph a, ArrayList<Integer> order) {
		for (int i = 0; i < a.list.get(n).parents.size(); i++) {
			if (!order.contains(a.list.get(n).parents.get(i))) {
				sort(a.list.get(n).parents.get(i), a, order);
			}
		}
		order.add(n);
	}
}
