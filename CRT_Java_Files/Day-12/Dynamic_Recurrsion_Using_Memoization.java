import java.util.Arrays;

public class Dynamic_Recurrsion_Using_Memoization {
    public static void main(String[] args) {
        long[] memo=new long[100];
        System.out.println(fibimem(30,memo));
        System.out.println(Arrays.toString(memo));
    }
    public static int fibi(int n){
        if(n==0||n==1)return n;
        return fibi(n-1)+fibi(n-2);
    }

    public static long fibimem(long n,long[] mem){
        if(n==0||n==1)
        return n;
        if(mem[(int)n]!=0)
        return mem[(int)n];
        long val=fibimem(n-1, mem) +fibimem(n-2, mem);
        mem[(int)n]=val;
        return mem[(int)n];

    }
}