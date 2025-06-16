public class Linked_List{
    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head;
    void insertB(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void printList(){
        Node temp=head;
        while(temp!= null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    System.out.println("null");
    }
    void insertE(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        else{
            var temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;

        }
    }
    int length(){
        int length=0;
        var temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;

        }
        return length;
    }
    void insertA(int data,int index){
        var temp=head;
        Node newNode=new Node(data); 
        if(index>=0&&index<=length()){
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    
    else{
        System.out.println("Index out of bounds");
    }

}
int delB(){
    if(head==null){
        System.out.println("no elements");
        return -1;
    }
    int removedEle=head.data;
    head=head.next;
    return removedEle;
}
int delE(){
    var temp=head;
    if(length()==0){
        System.out.println("no elements");
        return -1;
    }
    if (length()==1) {
        int removedEle=head.data;
        head=null;
        return removedEle;
    }
    for(int i=1;i<length()-1;i++){
        temp=temp.next;
    }
    int removedEle=temp.next.data;
    temp.next=null;
    return removedEle;
}
int delA(int index){
    if(index<0||index>=length()){
        System.out.println("Index out of bounds");
        return -1;
    }
    if(index==0){
        return delB();
    }
    var temp=head;
    for(int i=0;i<index-1;i++){
        temp=temp.next;
    }
    int removedEle=temp.next.data;
    temp.next=temp.next.next;
    return removedEle;
}
static Linked_List ArrayToList(int[] arr){
    Linked_List list=new Linked_List();
    for(int i=0;i<arr.length;i++){
        list.insertE(arr[i]);
    }
    return list;
}
int[] ListToArray(){
    int[]arr=new int[length()];
    var temp=head;
    for(int i=0;i<arr.length;i++){
        arr[i]=temp.data;
        temp=temp.next;
    }
    return arr;
}
}

