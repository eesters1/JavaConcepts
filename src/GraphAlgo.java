import java.util.Scanner;
public class GraphAlgo {
    public static void graphMenu() {
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("What graph algorithm would you like to see?");
        System.out.println("1. Kruskal's");
        //System.out.println("2. Dijkstra's");
        //System.out.println("3. Bellman Ford");
        //System.out.println("4. Floyd Warshall");
        //System.out.println("5. Topological Sort");
        //System.out.println("6. Flood Fill");
        //System.out.println("7. Lee\n");

        choice = sc.nextInt(); //Store selected menu choice

        //Direct user to proper page or submenu
        if (choice == 1) {
            GraphAlgo.kruskalsText();
        } else {
            System.out.println("Please choose a valid option!");
            GraphAlgo.graphMenu();
        }

        Algorithms.repeat();
    }
    public static void kruskalsText() {
        String[] args={};
        System.out.println("*** Brief Explanation ***\n" +
                "Kruskal's algorithm is a greedy algorithm for finding the Minimum Spanning Tree (MST)." +
                "The MST is the edge of the least possible weight that connects any two trees in the forest." +
                "*** Pseudocode ***" +
                "Sort the edges in ascending order of weights.\n" +
                "Pick the edge with the least weight. Check if including this edge in spanning tree will form a cycle is Yes then ignore it if No then add it to spanning tree.\n" +
                "Repeat the step 2 till spanning tree has V-1 (V – no of vertices in Graph).\n" +
                "Spanning tree with least weight will be formed, called Minimum Spanning Tree" +
                "*** Quick Sort Output ***");
        KruskalsAlgo.main(args);//execute linear search
        System.out.println("*** Reference ***" +
                "https://algorithms.tutorialhorizon.com/kruskals-algorithm-minimum-spanning-tree-mst-complete-java-implementation/");
    }
}
