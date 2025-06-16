import java.util.ArrayList;
public class Graph_List{
    public static void main(String[] args) {
        GraphAL g= new GraphAL(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);

        g.addEdge(1,0);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,1);
        g.addEdge(3,0);
        g.addEdge(3,2);
        g.printGraph();
        
    }
}
class GraphAL{
    ArrayList<ArrayList<Integer>> graph;
    int vertices;

    GraphAL(int vertices) {
        this.vertices=vertices;
        this.graph=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<vertices;i++){
            graph.add(new ArrayList<Integer>());
        }
    }

    void addEdge(int src,int dest){
        if(isValid(src,dest)){
            graph.get(src).add(dest);
            graph.get(dest).add(src);
        }
        else{
            System.err.println("Invalid source or destination");
        }
    }

    void removeEdge(int src,int dest){
        if(isValid(src,dest)){
            graph.get(src).remove(dest);
            graph.get(dest).remove(src);
        }
        else{
            System.err.println("Invalid source or destination");
        }
    }

    public ArrayList<Integer> neibours(int node){
        return graph.get(node);
    }
    boolean isHavingEdge(int src,int dest){
        if(isValid(src,dest)){
            var arr=graph.get(src);
            for(int i=0;i<arr.size();i++){
                if(arr.get(i)==dest){
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    boolean isValid(int src,int dest){
        return src>=0&dest>=0 && src<vertices && dest<vertices && src!=dest;
    }
    void printGraph(){
        for(int i=0;i<vertices;i++){
            System.out.println(i+":"+graph.get(i));
        }

    }
}
    

