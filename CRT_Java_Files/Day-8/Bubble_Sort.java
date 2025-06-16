public class Bubble_Sort{
    public static void main(String[] args) {
        int[]arr={19,21,3,8,10,12};
        for(int j=0;j<arr.length-1;j++){
            boolean isSwaped= false;
        for(int i=0;i<arr.length-j-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                isSwaped=true;
            }
            }
            if(!isSwaped) break;
        }
        for(int val:arr){
            System.out.println(val);
        }
    }
    
}