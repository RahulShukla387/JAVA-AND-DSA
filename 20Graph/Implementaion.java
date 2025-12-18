import java.util.*;
public class Implementaion {
    class Edge {
        int src; 
        int dest;
        int wt;

        Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    public void Graph(){

    
    int v = 5;
    ArrayList<Edge>[] graph = new ArrayList[v]; // null value are stored at each point 
    for(int i =0; i< v; i++) graph[i] = new ArrayList<>();

  //graph
//       5
//   0 -----1
//          /\
//      1  /   \  3
//        /      \
//        2------- 3
//        |    1
//        | 2
//        |
//        4

    // 0 vertex 
   graph[0].add(new Edge(0, 1, 5));
   //for 1 vertex
   graph[1].add(new Edge(1, 0, 5));
   graph[1].add(new Edge(1, 3, 3));
   graph[1].add(new Edge(1, 2, 1));
   //for 2 vertex
   graph[2].add(new Edge(2, 1, 1));
   graph[2].add(new Edge(2, 3, 1));
   graph[2].add(new Edge(2, 4, 2));
   // for 3 vertex
   graph[3].add(new Edge(3, 1, 3));
   graph[3].add(new Edge(3, 2, 1));

//     for(int i = 0; i < graph[1].size(); i++ ){
//      Edge e = graph[1].get(i);
//      System.out.println(e.dest);
//  }
  // BFS(graph);
  // DFS(graph, 0, new boolean[v] );
  Prims(graph);
     
}

//todo BFS travesal 

 public void BFS(ArrayList<Edge>[] graph ){
  Queue<Integer> q = new LinkedList<>();
  boolean [] visited = new boolean[graph.length];
  q.add(0);
  while(!q.isEmpty()){
      int curr = q.remove();
    if(visited[curr] == false ){
        System.out.println(curr + " ");
        visited[curr] = true;
        for(int i =0; i< graph[curr].size(); i++){
            q.add(graph[curr].get(i).dest);
        }
    }
  }
 }
 //todo DFS travarsal 
 public void DFS(ArrayList<Edge>[] graph, int curr, boolean[] vis ){
  // curr visted is true
     vis[curr] = true;
     System.out.println(curr);
     for(int i = 0; i< graph[curr].size(); i++ ){
        Edge e = graph[curr].get(i);
       if(!vis[e.dest]){
        DFS(graph, e.dest, vis);
       }
     }
 }
   class pair implements Comparable<pair> {
    int v; //vertex
    int c;  //cost
    pair(int v, int c){
      this.v = v;
      this.c = c;
    }
  
    public int compareTo(pair p){
      return this.c - p.c; // compare on the basis of cost and in ascending order min cost -> max cost 
    }

   }

  //todo Prims Algorithm 
   public void Prims(ArrayList<Edge>[] graph){
    boolean[] vis = new boolean[graph.length];
      PriorityQueue<pair> pq = new PriorityQueue<>();
      int mincost = 0;
      pq.add(new pair(0, 0));
     while (!pq.isEmpty()) {
      pair curr = pq.remove();
        if(!vis[curr.v]){
          vis[curr.v] = true;
          mincost += curr.c;
          for(int i =0; i< graph[curr.v].size(); i++){
            Edge e = graph[curr.v].get(i);
            pq.add(new pair(e.dest, e.wt));
          }
        }
     }
     System.out.println("Min cost of tree is: " + mincost );
   }

    public static void main(String[] args) {
       Implementaion i = new Implementaion();
       i.Graph();
        
    }
}
