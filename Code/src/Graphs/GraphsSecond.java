import java.util.Scanner;

public class GraphsSecond{
  public final int vertices;
  public int adj_matrix[][];

  public GraphsSecond(int vertices){
    this.vertices = vertices;
    adj_matrix = new int[vertices+1][vertices+1];
  }
  public void makeEdge(int to, int from, int edge){
    try{
      adj_matrix[to][from] = edge;
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Vertice doesn't exist.");
    }
  }

  public int getEdge(int to, int from){
    try{
      return adj_matrix[to][from];
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Vertice doesn't exist.");
    }
    return -1;
  }
  public static void main(String[] args) {
    int v, e, count = 1, to = 0, from = 0;
    Scanner sc = new Scanner(System.in);
    try{
      System.out.println("Enter number of vertices: ");
      v = sc.nextInt();
      System.out.println("Enter number of edges: ");
      e = sc.nextInt();
      GraphsSecond graph = new GraphsSecond(v);
      System.out.println("Enter edges: <to><from>");
      while(count<=e){
        to = sc.nextInt();
        from = sc.nextInt();
        graph.makeEdge(to, from, 1);
        count++;
      }
      System.out.println("Adjacency Matrix");
      System.out.print(" ");
      for (int i=1; i<=v; i++)
        System.out.print(i+" ");
      System.out.println();

      for (int i=1; i<=v; i++) {
        System.out.print(i+" ");

        for (int j=0; j<=v; j++)
          System.out.print(graph.getEdge(i,j)+" ");

        System.out.println();
      }
    }
    catch(Exception E){
      System.out.println("Something went wrong");
    }
    sc.close();
  }
}
