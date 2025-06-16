public class Pattern3 {
    // This program prints a hollow right-angled triangle pattern with stars
    public static void main(String[] args) {
        int rows = 6; // You can change the number of rows

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for isometric effect
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars and spaces for hollow effect
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

