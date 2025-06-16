import java.util.Arrays;
import java.util.Scanner;
public class TestCase_Input_To_Array {
    // This program takes input for an array of integers from the user. 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}