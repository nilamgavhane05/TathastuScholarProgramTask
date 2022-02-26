import java.util.Scanner;

public class Transpose {
    public static void main(String args[]) {
        int i, j;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int row = sc.nextInt();

        System.out.println("Enter the number of columns : ");
        int column = sc.nextInt();

        int array[][] = new int[row][column];
        System.out.println("Enter the elements in the matrix:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix before Transpose : ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The matrix after Transpose : ");
        for (i = 0; i < column; i++) {
            for (j = 0; j < row; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}