import java.util.ArrayList;
public class Graph_Matrix{
    public static void main(String[] args) {
        
        Graph g=new Graph(4,false);
        g.addEdge(0,1,10);
        g.addEdge(0,2,10);
        g.addEdge(0,3,10);
        g.addEdge(1,2,10);
        g.addEdge(2,0,30);
        g.printGraph();
        System.out.println(g.isHavingEdge(0,1));
        System.out.println(g.isHavingEdge(2,0));
        System.out.println( g.neibours(0,10));
            
        }  
    }

    class Graph{
        int vertices;
        int [] [] graph;
        boolean isDirected;
        Graph(int vertices,boolean isDirected){
            this.vertices=vertices;
            this.graph=new int[vertices][vertices];
            this.isDirected=isDirected;
        }
    boolean isValid(int src,int dst){
            if(src>=0 & dst>=0 && src<vertices && dst<vertices && src!=dst){
                return true;
        }
        else{
        return false;
        }
    }
     void addEdge(int src,int dst,int weight){
            if(isValid(src, dst)){
                graph[src][dst]=weight;
                if(!isDirected){
                    graph[dst][src]=weight;
                }
            }
            else{
                System.out.println("Invalid source and destination");
            }}
        
    void removeEdge(int src,int dst){
            if(isValid(src, dst)){
                graph[src][dst]=0;
                if(!isDirected){
                graph[dst][src]=0;}
            }
            else{
                System.out.println("Invalid source and destination");
            }
        }
     boolean isHavingEdge(int src,int dst){
            if(isValid(src, dst)){
                if(graph[src][dst]>0){
                    return true;
                }
            }
            return false;
        }
        
    void printGraph(){
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                System.err.print(graph[i][j]+" ");
                }
                System.out.println(" ");
            }
        }
        public ArrayList<Integer> neibours(int node,int weight){
            ArrayList<Integer>n=new ArrayList<Integer>();
            for(int i=0;i<vertices;i++){
                if(graph[node][i]==weight){
                    n.add(i);
                }
            }
            return n;

        }
}    
    

