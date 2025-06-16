public class Insertion_Sort{
    public static void main(String[] args) {
        int[] arr=new int[]{10,2,8,7,3,1,9};
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
            arr[j+1]=arr[j];
            j--;
            }
            arr[j+1]=key;
        }
        for(int i:arr){
            System.out.println(i+" ");

        }
    }
    
}