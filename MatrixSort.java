import java.util.*;

class MatrixSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int matrix[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        printMatrix(matrix);
        System.out.println("After Sorting");
        printMatrix(sortMatrix2(matrix));

    }

    // sort whole matrix
    public static int[][] sortMatrix1(int[][] matrix) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                al.add(matrix[i][j]);
            }
        }
        al.sort(null);
        System.out.println(al);
        int[][] ans = new int[matrix.length][matrix.length];

        for (int i = 0, k = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++, k++) {
                ans[i][j] = al.get(k);
            }
        }
        return ans;
    }

    // row wise sort and transpose method
    public static int[][] sortMatrix2(int[][] matrix) {
        // sort matrix row wise
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
        }
        // get transpose
        transposeMatrix(matrix);
        // sort matrix row wise
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
        }
        // get transpose
        transposeMatrix(matrix);
        return matrix;
    }

    public static void transposeMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
    }

    public static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}