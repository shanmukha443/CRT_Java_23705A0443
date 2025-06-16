public class Palindrome{
    public static void main(String[]args){
        int x=1311;
        int rev=0;
        int ref=x;
        int digit;
        while(x>0){
            digit=x%10;
            rev=(rev*10)+digit;
            x=x/10;
        }
        if(ref==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
    }
}}