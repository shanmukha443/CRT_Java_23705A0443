public class Sum_of_Even_Digits_in_Range{
    public static void main(String[] args) {
        int range=12;
        int count=0;
        int combined=0;
        int singlecou=0;
        if(range<=99){
            for(int i=1;i<=range;i++){
                
                if(i<=9){
                    if (i%2==0){
                        singlecou++;
                    } 
                    
                }
                else{
                    int x=i;
                    while(x!=0){
                        int digit=x%10;
                        combined=combined+digit;
                        x=x/10;
                    }
                    if (combined%2==0){
                        count++;
                    }
                    
                }
            }
        }
    int fina=count+singlecou;
    System.out.println(fina);
    }
}