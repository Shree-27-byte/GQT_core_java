package corejava.Array;
import java.util.Scanner;


class  matrixmultiplication {
    long[][] matrixA;
    long[][] matrixB;
    long[][] resultMatrix;
    int rowsA, colsA, rowsB, colsB;

    Scanner sc = new Scanner(System.in);

    void createMatrices() {
        System.out.print("Enter number of rows for Matrix A: ");
        rowsA = sc.nextInt();
        System.out.print("Enter number of columns for Matrix A: ");
        colsA = sc.nextInt();

        System.out.print("Enter number of rows for Matrix B: ");
        rowsB = sc.nextInt();
        System.out.print("Enter number of columns for Matrix B: ");
        colsB = sc.nextInt();

        // Matrix multiplication is only possible if colsA == rowsB
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication not possible! Columns of A must equal rows of B.");
            System.exit(0);
        }

        matrixA = new long[rowsA][colsA];
        matrixB = new long[rowsB][colsB];
        resultMatrix = new long[rowsA][colsB];

        System.out.println("Matrices created successfully.");
        System.out.println("------------------------------");
    }
    void collectData() {
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }
        System.out.println("Data collection complete.");
    }

    // matrix multiplication
    void multiplyMatrices() {
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                resultMatrix[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        System.out.println("Matrix multiplication done.");
    }

    void displayResult() {
        System.out.println("\nResultant Matrix (A × B):");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(resultMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
public class Array10_matrix {
    public static void main(String[] args) {
    	 matrixmultiplication am= new  matrixmultiplication();

        am.createMatrices();
        am.collectData();
        am.multiplyMatrices();
        am.displayResult();
    }
}
