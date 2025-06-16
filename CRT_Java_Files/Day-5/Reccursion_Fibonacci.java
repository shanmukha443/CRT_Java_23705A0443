public class Reccursion_Fibonacci {
    public static void main(String[] args) {
        int upto=5;
       for(int i=0;i<=upto;i++){
       System.out.println(fibi(i)+" ");
    }
    }
    static int fibi(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int val=fibi(n-1)+fibi(n-2);
        return val;
    

    }
}