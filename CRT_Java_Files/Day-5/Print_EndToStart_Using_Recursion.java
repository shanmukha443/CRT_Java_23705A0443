public class Print_EndToStart_Using_Recursion{
    public static void main(String[] args) {
        printRange(1,7);
    }
    static void printRange(int start,int end){
        if(start>end){
            return;
        }
        printRange(start+1,end);
        System.out.println(start);
    }

}