package bin.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class CompareTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
      Iterator<Integer> ai = a.iterator();
      Iterator<Integer> bi = b.iterator();
      Integer [] values = new Integer[]{0,0};
      System.out.println(a.size());
      for(int i=0; i<a.size(); i++){
        int test = ai.next() > bi.next() ? values[0]++ : values[1]++;
        if(ai.next() == bi.next())
          --values[1];
      }
      // for(int i=0; i<values.length; i++){
      //   System.out.println(values[i]);
      // }
      List<Integer> r = Arrays.asList(values);
      return r;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        // List<Integer> a = new ArrayList<Integer>();
        // List<Integer> b = new ArrayList<Integer>();
        // a.add(1);
        // b.add(34);
        // a.add(32);
        // b.add(44);
        // a.add(65);
        // b.add(34);
        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
