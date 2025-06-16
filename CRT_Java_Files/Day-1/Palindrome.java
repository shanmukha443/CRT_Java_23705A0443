public class Palindrome{
    public static void main(String[]args){
        int x=1311;
        int rev=0;
        int ref=x;
        int digit;
        while(x>0){
            digit=x%10;// Extract the last digit
            rev=(rev*10)+digit;// Build the reversed number
            x=x/10;// Remove the last digit from the original number
        }
        if(ref==rev){
            System.out.println("palindrome");// Check if the original number is equal to the reversed number
        }
        else{
            System.out.println("not a palindrome");
    }
}}