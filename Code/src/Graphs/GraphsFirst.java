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
    int V = 5;
    Graph graph = new Graph(V);
    addEdge(graph, 0, 1);
    addEdge(graph, 0, 4);
    addEdge(graph, 1, 3);
    addEdge(graph, 2, 4);
    addEdge(graph, 4, 3);
    addEdge(graph, 4, 1);
    printGraph(graph);
    System.out.print("Breadth-First Search starting from 0: ");
    BFS(graph, 0);
  }
}
