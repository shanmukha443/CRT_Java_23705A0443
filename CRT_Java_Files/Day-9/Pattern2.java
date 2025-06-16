public class Pattern2 {
    // This program prints a right-angled triangle pattern with stars
    public static void main(String[]args){
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i>=j){
                System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        /*for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();}*/
        
    }
}