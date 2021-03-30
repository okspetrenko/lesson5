package lesson5;

public class Main {
        public static void main(String[] args) {
            int n = 10;
            int[][] mat = new int[n][n];
            int i, j;
            for (i = 0; i < n; ++i)
                for (j = 0; j < n; ++j)
                    mat[i][j] = i * 11 + j + 11;
            System.out.println("Матрица:");
            for (i = 0; i < n; ++i, System.out.println())
                for (j = 0; j < n; ++j)
                    System.out.print(mat[i][j] + " ");

            int mass1;
            for (i = 1; i < n; ++i)
                for (j = 0; j < i; ++j) {
                    mass1 = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = mass1;
                }
            System.out.println("\nОбратная:");
            for (i = 0; i < n; ++i, System.out.println())
                for (j = 0; j < n; ++j)
                    System.out.print(mat[i][j] + " ");
        }
    }

