public class X_Power_N_Using_Recursion {
    public static void main(String[] args) {
        System.out.println(xpowerN(2,8));
    }
    static int xpowerN(int x,int n){
        if(n==1){
            return x;
        }
        int val=x*xpowerN(x,n-1);
        return val;


    }
    
}