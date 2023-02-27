package HW1;

public class HomeWork {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }
        int n = 0;

        n = Integer.parseInt(args[0]);
        if (n < 0) {
            System.out.println("Input is not a pozitive int , try again:");
        }
        // Creating the matrix
        long startTime = System.nanoTime();
        int mat[][] = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                mat[i][j] = (i + j) % n + 1;
            }
        }
        long endTime = System.nanoTime();
        long runningTime = endTime - startTime;
        System.out.println("The running time is " + runningTime);
        // Printing the matrix
        System.out.println("The n x n Latin Square as a matrix: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        // String objects representing the concatenation of the symbols for each row
        System.out.println("The concatenation of the symbols for each row: ");
        for (int i = 1; i <= n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j <= n; j++) {
                row.append(mat[i][j]);
            }
            System.out.println(row.toString());
        }
        // String objects representing the concatenation of the symbols for each column
        System.out.println("The concatenation of the symbols for each column: ");
        for (int j = 1; j <= n; j++) {
            StringBuilder col = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                col.append(mat[i][j]);
            }
            System.out.println(col.toString());
        }
    }

}
