import java.util.HashSet;
public class Edge_List{
    public static void main(String[] args) {
        Graph g=new Graph(3,false);
        g.addEdge(0,3,1);
        g.addEdge(1,2,1);
        g.print();
        
    }
}
 
class Edge{
    int src;
    int dest;
    int weight;
    Edge(int src,int dest,int weight){
        this.src=src;
        this.dest=dest;
        this.weight=1;
    }
}
    class Graph{
        HashSet<Edge> graph;
        int vertices;
        boolean isDirected;
        Graph(int vertices,boolean isDirected){
            this.vertices=vertices;
            this.isDirected=isDirected;
            graph= new HashSet<Edge>();

        }
        public void addEdge(int src,int dest){
            if(isValid(src,dest)){
                Edge e= new Edge(src,dest,1);
                graph.add(e);
                if(!isDirected){
                    Edge e2=new Edge(dest,src,1);
                }
            }else{
                System.err.println("invalid src and dest");
            }
        }
        public void addEdge(int src,int dest,int weight){
            if(isValid(src,dest)){
                Edge e= new Edge(src,dest,weight);
                graph.add(e);
                if(!isDirected){
                    var e2=new Edge(dest,src,weight);
                    graph.add(e2);
                }
            }else{
                System.err.println("invalid src and dest");
            }
        }
        public boolean isValid(int src,int dest){
            return src!=dest&&src<=vertices&&dest<=vertices&&src>=0&&dest>=0;
        }
       void print(){
            System.out.println(graph);
        }
        
    }