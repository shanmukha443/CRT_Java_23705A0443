public class Linear_Search{
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{1,2,3,4,5}, 6));
        
    }
    public static int linearSearch(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                System.out.println("the target is found:");
                return i;
            }
        }
        System.out.println("target not found");
        return -1;
    }
}
