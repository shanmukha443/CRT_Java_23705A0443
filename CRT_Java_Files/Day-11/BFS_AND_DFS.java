import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
public class BFS_AND_DFS {
    public static void main(String[] args) {
        
    }

}
class Graph{
    ArrayList<HashSet<Integer>> graph;
    int vertices;
    boolean isDirected;
    Graph(int vertices,boolean isDirected){
        this.vertices=vertices;
        this.isDirected=isDirected;
        this.graph=new ArrayList<HashSet<Integer>>();
        for(int i=0;i<vertices;i++){
            graph.add(new HashSet<>());
        }
    }
    public void addEdge(int src,int dest){
        if(isValid(src,dest)){
            this.graph.get(src).add(dest);
            if(!this.isDirected){
                this.graph.get(dest).add(src);
            }
        }else{
            System.err.println("invalid");
            for(int i=0;i<this.vertices;i++){
                System.out.println(i+" ");
            }
        }
    }
    public void removeEdge(int src,int dest){
        if(isValid(src,dest)){
            this.graph.get(src).remove(dest);
            if(!this.isDirected)
            this.graph.get(dest).remove(src);
        }else{
            System.out.println("invalid");
            for(int i=0;i<this.vertices;i++){
                System.out.println(i+" ");
            }
        }
    }
    boolean isHavingEdge(int src,int dest){
        return this.graph.get(src).contains(dest);
    }
    HashSet<Integer> getNeighbours(int src) throws 
    IndexOutOfBoundsException{
        if(src>=0&&src<vertices)
        return this.graph.get(src);
        throw new IndexOutOfBoundsException("invalid");
    }
    boolean isValid(int src,int dest){
        return src>=0&& dest>=0&&src<this.vertices &&dest<this.vertices&&src!=dest;
    }
    void printGraph(){
        System.out.println(graph);
    }
    void dfs(int start,boolean[] visited){
        visited[start]=true;
        System.out.println(start+" ");
        var neibhours=getNeighbours(start);
        for(int neibhour:neibhours){
            if(!visited[neibhour]){
                dfs(neibhour,visited);
            }
        }
    }
    void bfs(){
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        boolean[] visited=new boolean[vertices];
        while(!q.isEmpty()){
            int current=q.remove();
            if(!visited[current]){
                visited[current]=true;
                System.out.println(current+" ");
                var neibhours=getNeighbours(current);
                for(Integer neibhour:neibhours){
                    q.add(neibhour);
                }
            }
        }

    }

}
