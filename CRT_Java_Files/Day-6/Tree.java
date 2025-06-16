public class Tree{//main method or class
    public static void main(String[] args) {
           Tre t= new Tre(new int[]{1,2,-1,-1,3,-1,-1});
           t.preOrder();
           System.out.println();
           t.inOrder();
           System.out.println();
           t.postOrder();
    }
}

    class Node{//node method or class
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    
    class Tre{//tree method or tree 
        Node root;
        int index =-1;

        Tre(int[]nodes){
            this.root=buildTreeUsingArray(nodes);
            System.out.println(index);
        }
        public Node buildTreeUsingArray(int []nodes){
            index++;
            if(index>=nodes.length-1){
                return null;
            }
            if(nodes[index]==-1){
                return null;
            }
            Node newNode=new Node(nodes[index]);
            newNode.left=buildTreeUsingArray(nodes);
            newNode.right=buildTreeUsingArray(nodes);
            return newNode;

        }
        public void preOrder(){
            Node temp=this.root;
            preOrderHelper(temp);
            
        }
        private void preOrderHelper(Node temp){
            if(temp==null){
                return;
            }
            System.err.print(temp.data+" ");
            preOrderHelper(temp.left);
            preOrderHelper(temp.right);

        }
        public void inOrder(){
            Node temp=this.root;
            inOrderHelper(temp);

        }
        private void inOrderHelper(Node temp){
            if(temp==null) return;
            inOrderHelper(temp.left);
            System.err.print(temp.data+" ");
            inOrderHelper(temp.right);

        }
        public void postOrder(){
            Node temp=root;
            postOrderHelper(temp);
        }
        private void postOrderHelper(Node temp){
            if(temp == null) return;
            postOrderHelper(temp.left);
            postOrderHelper(temp.right);
            System.out.print(temp.data+" ");
        }
    }