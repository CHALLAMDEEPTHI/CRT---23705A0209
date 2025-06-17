import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
public class App{
    public static void main(String[] args){
        Graph graph = new Graph(5,false);
        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(1,3);
        graph.addEdge(3,4);
        graph.addEdge(2,3);
        graph.printGraph();
        graph.dfs(0,new boolean[5]);
        System.out.println();
        graph.bfs();
        
    }
}
class Graph{
    ArrayList<HashSet<Integer>>graph;
    int vertices;
    boolean isDirected;
    Graph(int vertices,boolean isDirected){
        this.vertices = vertices;
        this.isDirected = isDirected;
        this.graph = new ArrayList<HashSet<Integer>>();
        for(int i = 0;i< vertices;i++){
            graph.add(new HashSet<>());
        }
    }
    public void addEdge(int src,int dest){
        if(isValid(src,dest)){
            this.graph.get(src).add(dest);
            if(!this.isDirected)
              this.graph.get(dest).add(src);
        }else{
            System.out.println("Invalid source and Destination \n Available vertices are: ");
            for(int i =0;i<this.vertices;i++){
                System.out.print(i + " ");
            }
        }
    }
    public void removeEdge(int src,int dest){
        if(isValid(src,dest)){
            this.graph.get(src).remove(dest);
            if(!this.isDirected)
              this.graph.get(dest).remove(src);
        }else{
            System.out.println("Invalid Source and Destinations \n Available vertices are:");
            for(int i = 0;i<this.vertices;i++){
                System.out.print(i  + " ");
            }
        }
    }
    boolean isHavingEdge(int src,int dest){
        return this.graph.get(src).contains(dest);
    }
    HashSet<Integer> getNeighbours(int src) throws IndexOutOfBoundsException {
        if(src >=0 && src < vertices)
          return this.graph.get(src);
        throw new IndexOutOfBoundsException("Invalid Source and Destinations ");
    }
    boolean isValid(int src,int dest){
        return src >= 0 && dest >=0 && src < this.vertices && dest < this.vertices && src != dest;
    }
    void printGraph(){
        System.out.println(graph);
    }
    void dfs(int start,boolean[] visited){
        visited[start] = true;
        System.out.print(start + " ");
        var neibhours = getNeighbours(start);
        for(int neibhour : neibhours){
            if(!visited[neibhour]){
                dfs(neibhour,visited);
            }
        }
    }
    void bfs(){
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        boolean[] visited = new boolean[vertices];
        while(!q.isEmpty()){
            int current =q.remove();
            if(!visited[current]){
                visited[current] = true;
                System.out.print(current + " ");
                var neibhours = getNeighbours(current);
                for(Integer neibhour : neibhours){
                    q.add(neibhour);
                }
            }
        }
    }
    
}