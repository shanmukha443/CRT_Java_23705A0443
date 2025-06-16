public class Good_or_Bad_Number {
    public static void main(String[] args) {
        int x=123400;
        if(x%10==0){ // Check if the last digit is 0
            // If the last digit is 0, it's a bad number
            System.out.println(x+" "+"is bad number");
        }
        // If the last digit is not 0, it's a good number
        else{
            System.out.println(x+" "+"is good number");
        }
    }
}