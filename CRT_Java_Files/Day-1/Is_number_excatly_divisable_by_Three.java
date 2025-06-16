public class Is_number_excatly_divisable_by_Three {
    public static void main(String[] args) {
        int n=4;
        int count=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==3){
            System.out.println("exactly divisible by 3");
        }
        else{
            System.out.println("exactly  not divisible by 3");//

        }
        
    }
}