package corejava;
import java.util.Scanner;

public class Pattern29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {
            int row = i <= n ? i : 2 * n - i;

            System.out.print("  ".repeat(n - row));

            System.out.print(row + " ");
            if (row > 1) {
                System.out.print("  ".repeat(2 * row - 3));
                System.out.print(row);
            }

            System.out.println();
        }

        sc.close();
    }
}
