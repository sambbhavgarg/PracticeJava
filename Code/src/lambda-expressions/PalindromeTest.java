package bin.lambdaexpressions;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.List;

interface StrPredicate{
  boolean test(String str);
}

public class PalindromeTest{
  public static void main(String[] args) {
    List<String> words = new ArrayList<>();
    words.add("Otto");
    words.add("ADA");
    words.add("Alyla");
    words.add("Bob");
    words.add("HannaH");
    words.add("Java");
    System.out.println("List of words: "+words);

    StrPredicate predicate1 = (String str)->
            str.equals(new StringBuilder(str).reverse().toString());
    List<String> cspalindromes = filterString(words, predicate1);
    System.out.println("Case Sensitive Palindromes: " + cspalindromes);

    StrPredicate predicate2 = (String str)->
            str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    List<String> cispalindromes = filterString(words, predicate2);
    System.out.println("Case Sensitive Palindromes: " + cispalindromes);
  }
  /**
  * Filters a list of strings according to criteria of predicate
  * @param strList List of Strings to filter
  * @param predicate Provides criteria for filtering the string
  * @return List of strings that match the criteria
  */
  public static List<String> filterString(List<String> strList, StrPredicate predicate){
    List<String> result = new ArrayList<>();
    for(String str: strList)
      if(predicate.test(str))
        result.add(str);
    return result;
  }
}
