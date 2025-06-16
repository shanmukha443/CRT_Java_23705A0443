public class Factorial_Using_Recursion {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    static int fact(int n){
        if(n==1){
            return 1;
        }
        int val=n*fact(n-1);
        return val;

    }
    
}