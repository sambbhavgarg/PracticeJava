/*
import java.util.stream.IntStream;
import java.util.Random;

class Test{
  public static void main(String[] args) {
    double graph[][];
    graph = Test.random(26);
    System.out.println(graph.length);
  }
  public static double[][] random(int n) {
      Random random = new Random();
      double[][] randomMatrix = new double[n][n];
      IntStream.range(0, n)
          .forEach(i -> IntStream.range(0, n)
              .forEach(j -> randomMatrix[i][j] = Math.abs(random.nextInt(100) + 1)));
      return randomMatrix;
  }
}


import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.List;

class Test{
  public static void main(String[] args) {
    List<Ant> list = new ArrayList<>();
    IntStream.range(0, 21)
      .forEach(i -> list.add(new Ant(21)));
    for(int i=0;i<list.size();i++){
      System.out.println(list.get(trailsize));
    }
  }
}

*/
