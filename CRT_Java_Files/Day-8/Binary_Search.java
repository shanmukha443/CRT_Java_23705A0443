public class Binary_Search{
    public static void main(String[] args) {
        Search(new int[]{1,2,3,4,5,8}, 5);
        
    }
    public static void Search(int[]arr,int target){
    int left=0;
    int right=arr.length-1;
    int index=-1;
    while(left<=right){
        int mid=(left+right)/2;
        if(target==arr[mid]){
        }
        else if(target>arr[mid]){
            left=mid+1;
        }
        else if(target<arr[mid]){
            right=mid-1;
        }
        else{
            index=mid;
            break;
        }
        }
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("Target found:"+index);
        }
    
}
}