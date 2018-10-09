import java.util.Scanner;

public class FindMaxValueMatrix {
    public static void main(String[] args) {
        int[][] matrix;
        int max;
        int row;
        int column;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers row");
        row = scanner.nextInt();
        System.out.println("Enter numbers column");
        column = scanner.nextInt();
        matrix = new int[row][column];
        System.out.println("Enter element of matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if ( max<matrix[i][j])
                max = matrix[i][j];
            }
        }
        System.out.println("MAX value of matrix is " + max);
    }
}
