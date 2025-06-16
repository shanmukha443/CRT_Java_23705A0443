public class Removeing_Duplicates_In_Array {
    public static void main(String[] args) {
        int[]arr={1,2,3,3,4,5,5,5};
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
                arr[i]=arr[j];
            }
        }
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]+" ");
        }
    }

}