public class Min_Element_In_Array{
    public static void main(String[] args) {
        int[] arr={1,3,4,2,1};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<max){
                max=arr[i];
            }
        }
        System.out.println("The minimum value in the array is: " + max);
    }

}