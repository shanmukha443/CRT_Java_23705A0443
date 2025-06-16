public class Sum_of_Even_Digits_in_Range{
    public static void main(String[] args) {
        int range=12;// Define the range up to which we want to count numbers with even digit sums
        int count=0;// Count for two-digit numbers with even digit sum
        int combined=0;// Variable to store the sum of digits of two-digit numbers
        int singlecou=0;// Count for single digit even numbers
        if(range<=99){// Check if the range is within two-digit numbers
            for(int i=1;i<=range;i++){
                
                if(i<=9){// Check if the number is a single digit
                    if (i%2==0){
                        singlecou++;// Increment count for single digit even numbers
                    } 
                    
                }
                else{// If the number is two digits
                    int x=i;
                    while(x!=0){//
                        int digit=x%10;// Extract the last digit
                        combined=combined+digit;// Add the last digit to combined
                        x=x/10;
                    }
                    if (combined%2==0){// Check if the sum of digits is even
                        count++;
                    }
                    
                }
            }
        }
    int fina=count+singlecou;// Total count of even digit numbers in the range
    System.out.println(fina);// Print the final count
    }
}