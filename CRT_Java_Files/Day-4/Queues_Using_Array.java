public class Queues_Using_Array {
    public static void main(String[] args) {
        QArr q=new QArr(4);
        q.enqueue(30);
        q.enqueue(20);  
        q.enqueue(10);
        q.enqueue(40);
        q.print();
        q.dequeue();
        q.print();
    }

}
class QArr{
    int rear;
    int[] arr;
    int size;
    int front;
    QArr(int size){
        this.rear=-1;
        this.arr = new int[size];
        this.size=size;
        this.front=0;
    }
    boolean isEmpty(){
        if(rear==-1){
            System.out.println("queue is empty");
            return true;
        }
        else{
            return false;
        }
    }
    boolean isFull(){
        if(rear==size - 1){
            System.out.println("que is full");
            return true;
        }
        else{
            return false;
        }
    }
    void enqueue(int data){
        if(isFull()){
            System.err.println("Queue is full");
            return;
        }
        rear = rear +1;
        arr[rear] = data;
    }

    void print(){
        System.out.println("=======Queue=======");
        for(int i = 0;i<=rear;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println("===================");
    }
    int dequeue(){
        var temp=arr[front];
        for(int i=1;i<=rear;i++){
            arr[i-1]=arr[i];
        }
        return temp;

    }
}




    //is Empty:rear=-1
    //is Full:lenght-1
    //Enque:isfull,rear++,queue[rear]=data
    //Dequeue:front++,queue[front]=data,rear--
