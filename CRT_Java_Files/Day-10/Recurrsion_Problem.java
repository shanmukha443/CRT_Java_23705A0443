public class Recurrsion_Problem{
    public static void main(String[] args) {
        int n = 6; // Example input
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n==0||n==1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}