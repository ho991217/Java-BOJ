import java.util.Scanner;

class Adjacency_Matrix {
    private boolean[][] adjMatrix;
    private int vertex;

    public Adjacency_Matrix(int vertex) {
        adjMatrix = new boolean[vertex][vertex];
    }

    void addEdge(int i, int j) {
        adjMatrix[i - 1][j - 1] = true;
        adjMatrix[j - 1][i - 1] = true;
    }

    void removeEdge(int i, int j) {
        adjMatrix[i - 1][j - 1] = false;
        adjMatrix[j - 1][i - 1] = false;
    }

    void printMatrix() {
        for (boolean[] i: adjMatrix) {
            for (boolean j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}

public class Main {

    int bfs(boolean[][] graph, int rootIndex){

        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N, M;

        N = sc.nextInt();
        M = sc.nextInt();
        Adjacency_Matrix aMatrix = new Adjacency_Matrix(N);

        for (int i = 0; i < M; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            aMatrix.addEdge(u, v);
        }
        aMatrix.printMatrix();
    }
}
