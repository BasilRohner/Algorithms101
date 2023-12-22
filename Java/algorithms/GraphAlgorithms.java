package algorithms;

import java.util.*;

public class GraphAlgorithms {

    public static void main(String[] args) {

        // Sample Graph 1
        List<Integer> vertex1 = List.of(1,2,3);
        List<Integer> vertex2 = List.of(1,0,3,4);
        List<Integer> vertex3 = List.of(2,0,3);
        List<Integer> vertex4 = List.of(3,0,1,2,4);
        List<Integer> vertex5 = List.of(4,1,3);
        List<List<Integer>> graph = List.of(vertex1, vertex2, vertex3, vertex4, vertex5);

        // DFS and BFS ordering algorithms
        System.out.println("Example Pre-Order: "+Arrays.toString(preOrder(graph, 0)));
        System.out.println("Example Post-Order: "+Arrays.toString(postOrder(graph, 0)));
        System.out.println("Example Enter-Order: "+Arrays.toString(enterOrder(graph, 0)));
        System.out.println("Example Leave-Order: "+Arrays.toString(leaveOrder(graph, 0)));

    }

    public static int[] preOrder(List<List<Integer>> graph, int root) {

        int[] preorder = new int[graph.size()];
        boolean[] flag = new boolean[graph.size()];

        Stack<Integer> stack = new Stack<>();
        stack.push(root); int counter = 1;
        preorder[0] = root;
        flag[root] = true;

        // A classic DFS routine
        while (!stack.isEmpty()) {
            // Remove the top vertex from the stack
            int vertex = stack.pop();
            List<Integer> adj = graph.get(vertex);
            // Push the adjacent vertices to the stack
            inner: for (int neighbour : adj) {
                if (!flag[neighbour]) {
                    stack.push(neighbour);
                    flag[neighbour] = true;
                    preorder[counter++] = neighbour;
                    break inner;
                }
            }
        }

        // Return the array containing the pre-ordering
        return preorder;
    }

    public static int[] postOrder(List<List<Integer>> graph, int root) {

        int[] postorder = new int[graph.size()];
        boolean[] flag = new boolean[graph.size()];

        Stack<Integer> stack = new Stack<>();
        stack.push(root); int counter = 0;
        flag[root] = true;

        // A classic DFS routine
        while (!stack.isEmpty()) {
            // Remove the top vertex from the stack
            int vertex = stack.pop();
            List<Integer> adj = graph.get(vertex);
            postorder[counter++] = vertex;
            // Push the adjacent vertices to the stack
            inner: for (int neighbour : adj) {
                if (!flag[neighbour]) {
                    stack.push(neighbour);
                    flag[neighbour] = true;
                    break inner;
                }
            }
        }

        // The map now contains the post-ordering
        return postorder;

    }

    public static int[] enterOrder(List<List<Integer>> graph, int root) {

        int[] enterorder = new int[graph.size()];
        boolean[] flag = new boolean[graph.size()];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(root); int counter = 1;
        enterorder[0] = root;
        flag[root] = true;

        // A classic BFS routine
        while (!queue.isEmpty()) {
            // Remove vertex from rear of the queue
            int vertex = queue.poll();
            List<Integer> adj = graph.get(vertex);
            // Iterate and add all neighbours
            for (int neighbour : adj) {
                if (!flag[neighbour]) {
                    queue.add(neighbour);
                    flag[neighbour] = true;
                    enterorder[counter++] = neighbour;
                }
            }
        }

        // Return array in enter-order
        return enterorder;

    }

    public static int[] leaveOrder(List<List<Integer>> graph, int root) {

        int[] leaveorder = new int[graph.size()];
        boolean[] flag = new boolean[graph.size()];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(root); int counter = 0;
        flag[root] = true;

        // A classic BFS routine
        while (!queue.isEmpty()) {
            // Remove vertex from rear of the queue
            int vertex = queue.poll();
            leaveorder[counter++] = vertex;
            List<Integer> adj = graph.get(vertex);
            // Iterate and add all neighbours
            for (int neighbour : adj) {
                if (!flag[neighbour]) {
                    flag[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }

        // Return array in leave-order
        return leaveorder;

    }

    public static boolean hasTopologicalSort(List<List<Integer>> graph) {
        return true;
    }

    public static int[] Dijkstra(List<List<Integer>> graph, int root) {
        return new int[1];
    }

    public static int[] BellmanFord(List<List<Integer>> graph, int root) {
        return new int[1];
    }

    public static int[][] FloydWarshall(List<List<Integer>> graph) {
        return new int[1][1];
    }

    public static int[][] Johnson(List<List<Integer>> graph) {
        return new int[1][1];
    }

    public static List<List<Integer>> prim(List<List<Integer>> graph) {
        return graph;
    }

    public static List<List<Integer>> kruskal(List<List<Integer>> graph) {
        return graph;
    }

    public static List<List<Integer>> boruvska(List<List<Integer>> graph) {
        return graph;
    }

}
