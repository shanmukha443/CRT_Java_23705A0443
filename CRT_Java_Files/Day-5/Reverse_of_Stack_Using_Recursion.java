import java.util.Stack;
public class Reverse_of_Stack_Using_Recursion {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(10);
        s.push(30);
        System.out.println(s);
        reverseStack(s);
        System.out.println(s);
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        insertAtBottom(s, top);
    }

    public static void insertAtBottom(Stack<Integer> s, int value) {
        if (s.isEmpty()) {
            s.push(value);
            return;
        }
        int top = s.pop();
        insertAtBottom(s, value);
        s.push(top);
    }
}