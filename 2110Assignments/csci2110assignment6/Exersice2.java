import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exersice2{

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("graph.txt");
        Scanner in= new Scanner(file);


        String[] vertices = in.nextLine().split("\\s+");
        int n = vertices.length;
        int[][] adj = new int[n][n];


        for (int i = 0; i < n; i++) {
            String[] row = in.nextLine().split("\\s+");
            for (int j = 1; j <= n; j++) {
                adj[i][j - 1] = Integer.parseInt(row[j]);
            }
        }


        int[] indegree = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                indegree[i] += adj[j][i];
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        String[] sortedVertices = new String[n];
        int index = 0;

        while (!queue.isEmpty()) {
            int i = queue.poll();
            sortedVertices[index++] = vertices[i];

            for (int j = 0; j < n; j++) {
                if (adj[i][j] == 1) {
                    indegree[j]--;
                    if (indegree[j] == 0) {
                        queue.add(j);
                    }
                }
            }
        }


        System.out.print("topnum:\t");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();

        System.out.print("\t");
        System.out.print("\t");
        for (String vertex : sortedVertices) {
            System.out.print(vertex + "\t");
        }

    }
}
