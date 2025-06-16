public class Stack_Using_Array{
    int[] stack;
    int size;
    int top;
    Stack_Using_Array(int size){
        this.size=size;
        this.stack=new int[size];
        this.top=-1;
    }
    boolean isEmpty(){
        if(top==-1){
            System.out.println("stack is empty");
        return true;}
        else{
            return false;
        }

    }
    boolean ifFull(){
        if(top==size-1){
            System.out.println("stack is full");
        
        return true;}else{
            return false;
        }
    }
    void push(int data){
        top++;
        stack[top]=data;   
        }
    int pop(){
        if(isEmpty()){
            return -1;}
            int Removed=stack[top];
            top--;
            return Removed;
        }
    int peak(){
            if(isEmpty()){
                return -1;
            }
            return stack[top];
        }
    void print(){
        System.out.println("___S T A C K___");
            for(int i=0;i<=top;i++){
                System.out.print(stack[i]+" ");
            }
            System.out.println("__________________");
        }
    }
