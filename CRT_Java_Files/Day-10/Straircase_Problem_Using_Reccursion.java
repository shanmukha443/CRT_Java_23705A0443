public class Straircase_Problem_Using_Reccursion{
    public static void main(String[] args) {
        int n=5;
        System.out.println(NumberOfWays(n));
    }

static int NumberOfWays(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int val=NumberOfWays(n-1)+NumberOfWays(n-2);
        return val;
    

    }
}
