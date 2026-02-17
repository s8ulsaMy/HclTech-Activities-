public class MatrixSum {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] mat2 = {{7, 8, 9}, {1, 2, 3}};
        int[][] sum = new int[2][3];

        System.out.println("Sum of Matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}