public class Reverse_of_a_number {
    public static void main(String[] args) {
        int x=1311;
        int rev=0;
        int digit;
        while(x>0){
            digit=x%10;// Extract the last digit
            rev=(rev*10)+digit;// Build the reversed number
            x=x/10;// Remove the last digit from the original number
        }
        System.out.println(rev);// Print the reversed number
        
    }
}