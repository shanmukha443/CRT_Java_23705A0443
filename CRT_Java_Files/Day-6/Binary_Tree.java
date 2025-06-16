public class Binary_Tree{
    public static void main(String[] args) {
        BTree bt=new BTree();

        
    }
    
}
class Node{
    int data;
    Node right;
    Node left;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;

    }
}
class BTree{
    Node root;

    BTree(){
        this.root=null;

}
public static Node insertNode(Node root,int data){
    if(root==null)return new Node(data);
    if(data >root.data){
        root.right=insertNode(root.right, data);
    }
    else if (data<root.data) {
        root.left=insertNode(root.left, data);
        
    }
    return root;
}
void inOder(){
     Node temp=this.root;
            inOrderHelper(temp);

        }
    private void inOrderHelper(Node temp){
            if(temp==null) return;
            inOrderHelper(temp.left);
            System.err.print(temp.data+" ");
            inOrderHelper(temp.right);

        }
        void preOrder(){
            Node temp=this.root;
            preOrderHelper(temp);
        }
           public void  preOrderHelper(Node temp){if(temp==null) return;
            System.err.print(temp.data+" ");
            inOrderHelper(temp.left);
            inOrderHelper(temp.right);
            }
        void postOrder(){
            
            Node temp=this.root;
            postOrderHelper(temp);
        }
        public void postOrderHelper(Node temp){
            if(temp==null) return;
            inOrderHelper(temp.left);
            inOrderHelper(temp.right);
            System.err.print(temp.data+" ");
            

        }
}