package corejava.Array;
import java.util.Scanner;

class GlobalQuest {
    String arr[][][];
    long medical_fee;
    long engineering_fee;
    long degree_fee;
    String[] collegeTypes;
    Scanner sc = new Scanner(System.in);

    void createArray() {
        System.out.print("Enter number of College count in GQ Trust: ");
        int clg = sc.nextInt();

        arr = new String[clg][][];
        collegeTypes = new String[clg];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter type of College " + (i + 1) + ": ");
            collegeTypes[i] = sc.next();

            System.out.print("Enter the number of Classes in College " + (i + 1) + ": ");
            arr[i] = new String[sc.nextInt()][];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Inside college no " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter the number of Students in Class " + (j + 1) + ": ");
                arr[i][j] = new String[sc.nextInt()];
            }
        }

        System.out.println("------------------");
    }

    void collectData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Inside the College no " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Inside the Class " + (j + 1));
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print("Enter the student name " + (k + 1) + ": ");
                    arr[i][j][k] = sc.next();
                }
            }
        }

        System.out.println("\n------------------");

        System.out.print("Medical College Fee = ");
        medical_fee = sc.nextLong();
        System.out.print("Engineering College Fee = ");
        engineering_fee = sc.nextLong();
        System.out.print("Degree College Fee = ");
        degree_fee = sc.nextLong();

        System.out.println("\n---------------------");
    }

    void displayData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The GQ Trust College " + (i + 1));
            int studentCount = 0;

            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("  In Class " + (j + 1));
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("    Student Name " + (k + 1) + ": " + arr[i][j][k]);
                    studentCount++;
                }
            }

            long total = 0;

            if (collegeTypes[i].equals("medical")) {
                total = studentCount * medical_fee;
                System.out.println("   Total fee for College " + (i + 1) + " (Medical): ₹" + total+"Cr");
            } else if (collegeTypes[i].equals("engineering")) {
                total = studentCount * engineering_fee;
                System.out.println("  Total fee for College " + (i + 1) + " (Engineering): ₹" + total+"Cr");
            } else if (collegeTypes[i].equals("degree")) {
                total = studentCount * degree_fee;
                System.out.println("  Total fee for College " + (i + 1) + " (Degree): ₹" + total+"Cr");
            }

            System.out.println("------------------");
        }
    }
}

public class Array08Q {
    public static void main(String[] args) {
        GlobalQuest g = new GlobalQuest();
        g.createArray();
        g.collectData();
        g.displayData();
    }
}
