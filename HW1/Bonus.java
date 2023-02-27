package HW1;

public class Bonus {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }
        int n = Integer.parseInt(args[0]); // number of vertices in the cycle graph

        // create the adjacency matrix of the cycle graph
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            A[i][(i + 1) % n] = 1; // connect ith vertex to (i+1)th vertex
            A[(i + 1) % n][i] = 1; // connect (i+1)th vertex to ith vertex
        }

        // compute powers of the adjacency matrix
        int[][] Ap = A;
        for (int i = 2; i <= n; i++) {
            Ap = matrixMultiplication(Ap, A);
            System.out.println("A^" + i + " = ");
            printMatrix(Ap);
        }
    }

    // helper method for matrix multiplication
    public static int[][] matrixMultiplication(int[][] A, int[][] B) {
        int m = A.length;
        int n = B[0].length;
        int[][] C = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    // helper method for printing a matrix
    public static void printMatrix(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
