package corejava.Array;
import java.util.Scanner;

// matrix operations
class MatrixOperations {
    long[][] matrixA;
    long[][] matrixB;
    long[][] resultMatrix;
    int rows, cols;

    Scanner sc = new Scanner(System.in);
    void createMatrices() {
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        cols = sc.nextInt();

        matrixA = new long[rows][cols];
        matrixB = new long[rows][cols];
        resultMatrix = new long[rows][cols];

        System.out.println("Matrices A and B created successfully.");
        System.out.println("--------------------------------------");
    }


    void collectData() {
        System.out.println("Enter elements for Matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            	matrixA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements for Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            	matrixB[i][j] = sc.nextInt();
            }
        }

        System.out.println("Data collected for both matrices.");
    }

    // matrix addition
    void addMatrices() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        System.out.println("Matrix addition completed.");
    }

    // result matrix
    void displayResult() {
        System.out.println("\nResultant Matrix (A + B):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(resultMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

// Main class
public class Array09_matrix {
    public static void main(String[] args) {
        MatrixOperations an = new MatrixOperations();

        an.createMatrices();
        an.collectData();
        an.addMatrices();
        an.displayResult();
    }
}

