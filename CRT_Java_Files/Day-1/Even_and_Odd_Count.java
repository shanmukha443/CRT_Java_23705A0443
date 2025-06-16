public class Even_and_Odd_Count {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,1};
        int evecount=0;
        int oddcount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evecount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("Even Count: " + evecount);
        System.out.println("Odd Count: " + oddcount);
    }

}