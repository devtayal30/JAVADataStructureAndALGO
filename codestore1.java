package company.pattern;

import java.util.Scanner;

public codestore1 Pattern {
    public static void main(String[] args) {
        // Taking user input for the size of the pattern
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Loop to iterate through rows
        for (int i = 0; i < n; i++) {
            // Loop to iterate through columns
            for (int j = 0; j < n; j++) {
                // Check conditions to print '*' or ' '
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
