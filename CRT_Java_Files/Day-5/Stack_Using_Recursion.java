import java.util.Stack;
public class Stack_Using_Recursion {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        s.push(10);
        s.push(30);
        System.out.println(s);
        pushBottom(s,2);
        System.out.println(s);

    
    }
    
    public static void pushBottom(Stack<Integer>stack,int ele){
        if(stack.isEmpty()){
            stack.push(ele);
            return;
        }
        int val=stack.pop();
        pushBottom(stack,ele);
        stack.push(val);

    }
}
    
    
