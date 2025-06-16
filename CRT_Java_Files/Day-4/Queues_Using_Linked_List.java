    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
}
public class Queues_Using_Linked_List {
    Node head;
    Node rear;
    Queues_Using_Linked_List(){
        this.head=null;
        this.rear=null;
    }
    boolean isEmpty(){
        if(head==null){
            System.err.println("no elements");
            return true;
        }
        else{
            return false;
        }
    }
    void enqueue(int val){
        Node newNode=new Node(val);
        if(isEmpty()){
            this.head=newNode;
            this.rear=newNode;
        }
        rear.next=newNode;
        rear=rear.next;
    }
    int dequeue(){
        if(isEmpty()){
            System.out.println("que is empty:");
            return -1;
        }
        else{
            int val=head.data;
            head=head.next;
            return val;
        }
    }
    void print(){
        var temp=head;
        System.out.println("=========");
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println("=========");
    }
    int length(){
        var temp=head;
        int lenght_=0;
        while(temp!=null){
            temp=temp.next;
            lenght_++;
        }
        return lenght_;
    }
    int getHead(){
        return head.data;
    }
}