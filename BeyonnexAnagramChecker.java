import java.util.*;

public class BeyonnexAnagramChecker {

  public static List<String> inputs = new ArrayList<>();

  public static boolean f1(String a, String b) {
    return getCanonicalForm(a).equals(getCanonicalForm(b));
  }

  public static List<String> f2(String target) {
    List<String> anagrams = new ArrayList<>();
    for (String input : inputs) {
      if (!input.equals(target) && f1(input, target)) {
        anagrams.add(input);
      }
    }
    return anagrams;
  }

  public static String getCanonicalForm(String s) {
    char[] charArray = s.toLowerCase().replaceAll("\\s+", "").toCharArray();
    Arrays.sort(charArray);
    return new String(charArray);
  }

}