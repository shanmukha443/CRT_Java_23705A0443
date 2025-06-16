public class Reverse_of_a_number {
    public static void main(String[] args) {
        int x=1311;
        int rev=0;
        int digit;
        while(x>0){
            digit=x%10;
            rev=(rev*10)+digit;
            x=x/10;
        }
        System.out.println(rev);
        
    }
}