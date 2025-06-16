public class Dynamic_Recurrsion_Using_Tabulation_and_NapSack {
    public static void main(String[] args) {

        long[] memo=new long[100];
        memo[0]=0;
        memo[1]=1;
        fibiTab(10, new long[100]);

    }
    public static long fibiTab(int n,long[] memo){
        if(memo.length>=n){
            for(int i=2;i<=n;i++){
                long val=memo[i-1]+memo[i-2];
                memo[i]=val;
            }
            return memo[n];
        }
            System.out.println("invalid");
            return -1;

    }
    public static int napSack(int bagweight,int selectedEle,int[]weights,int[]profits){
        if(selectedEle>=weights.length||bagweight==0){
            return 0;
        }
        int pick=0;
        if(bagweight>=weights[selectedEle]){
            pick=profits[selectedEle]+napSack(bagweight-weights[selectedEle],selectedEle+1,weights,profits);
        }
        int notpick=napSack(bagweight,selectedEle+1,weights,profits);
        return Math.max(pick,notpick);

    }
    
}