public class Sorted_Array_Or_Not{
    public static void main(String[] args) {
        int[] arr = {35, 2, 3, 4, 5};
        int temp=arr[0];
        int flaga=1;
        int flagb=1;
        for(int i=1;i<arr.length-1;i++){
            if(temp<arr[i]){
                flaga=1;
            }
            else{
                flaga=0;
                
            }
            if(temp>arr[i]){
                flaga=1;
            }
            else{
                flaga=0;
                break;
            }
        }
        if(flaga==1){
            System.out.println("The array is sorted in ascending order.");
        }
        else if(flagb==1){
            System.out.println("The array is sorted in descending order.");
        }
        else{
            System.out.println("The array is not sorted.");
        }
    }
}