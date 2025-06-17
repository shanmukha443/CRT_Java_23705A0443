import java.util.ArrayList;

public class Subset{
    public static void main(String[] args) {
        generateCombinations("abc", 0, "");
        generateCombinations(new int[]{1, 2, 3}, 0, new ArrayList<>());
        }
    
        public static void generateCombinations(String str,int index,String result){

            if(index==str.length()){
                System.out.println(result);

                return;
            }
            generateCombinations(str, index+1, result+str.charAt(index));
            generateCombinations(str, index+1, result);

        }
        public static void generateCombinations(int[] nums, int index, ArrayList<Integer> result) {
            if (index == nums.length) {
                System.out.println(result);
                return;
            }
            result.add(nums[index]);
            generateCombinations(nums, index + 1, result);
            result.remove(result.size() - 1);
            generateCombinations(nums, index + 1, result);
        }
    
}