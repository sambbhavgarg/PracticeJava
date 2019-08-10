import java.util.LinkedList;
import java.util.Iterator;

public class GraphsFirst{
  static class Graph{
    int V;
    LinkedList<Integer> adjListArray[];
    Graph(int V){
      this.V = V;
      adjListArray = new LinkedList[V];
      for (int i=0; i<V ; i++) {
        adjListArray[i] = new LinkedList<>();
      }
    }
  }
  static void addEdge(Graph graph, int src, int dest){
    graph.adjListArray[src].add(dest);
    graph.adjListArray[dest].add(src);
  }

  static void BFS(Graph graph, int src){
    boolean visited[] = new boolean[graph.V];
    LinkedList<Integer> queue = new LinkedList<Integer>();
    visited[src] = true;
    queue.add(src);
    while(queue.size()!=0){
      src = queue.poll();
      System.out.print(src+" ");
      Iterator<Integer> i = graph.adjListArray[src].listIterator();
      while(i.hasNext()){
        int n = i.next();
        if(!visited[n]){
          visited[n] = true;
          queue.add(n);
        }
      }
    }
  }

  static void DFSUtil(Graph graph, int v, boolean visited[]){
    visited[v] = true;
    System.out.print(v+" ");
    Iterator<Integer> i = graph.adjListArray[v].listIterator();
    while(i.hasNext()){
      int n = i.next();
      if(!visited[n]){
        DFSUtil(graph, n, visited);
      }
    }
  }

  static void DFS(Graph graph, int v){
    boolean visited[] = new boolean[graph.V];
    DFSUtil(graph, v, visited);
  }
  static void printGraph(Graph graph){
    for (int v=0; v<graph.V; v++ ) {
      System.out.print("Adjacency List of "+v);
      // System.out.print("head: ");
      for(Integer gCrawl: graph.adjListArray[v]){
        System.out.print("->" + gCrawl);
      }
      System.out.println("\n");
    }
  }
  public static void main(String[] args) {
    int V = 4;
    Graph graph = new Graph(V);
    // GraphsFirst.addEdge(graph, 0, 1);
    addEdge(graph, 0, 1);
    addEdge(graph, 0, 2);
    addEdge(graph, 1, 2);
    addEdge(graph, 2, 0);
    addEdge(graph, 2, 3);
    addEdge(graph, 3, 3);
    // printGraph(graph);

    System.out.print("Breadth-First Search starting from 2: ");
    BFS(graph, 2);

    System.out.println();

    System.out.print("Depth-First Search starting from 2: ");
    DFS(graph, 2);

    System.out.println();

  }
}
