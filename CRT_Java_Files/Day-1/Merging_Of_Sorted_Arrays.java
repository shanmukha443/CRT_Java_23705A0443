public class Merging_Of_Sorted_Arrays {
    public static void main(String[] args) {
        int[] arr1={2,9,18,21,22};
        int[] arr2={1,3,6,19,27,30};
        int lenght_=arr1.length+arr2.length-1;
        int[] arr3=new int [lenght_];
        int j=0;
        int i=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
    for(int i1=0;i1<lenght_-1;i1++){
    System.out.print(arr3[i1]+" ");
}
}
}