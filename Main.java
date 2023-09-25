import java.util.*;

public class Main {

 

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        while (true) {
            System.out.println( "Welcome to Beyonnex Anagram Checker#");
            System.out.println( "Please select a feature:");
            System.out.println("1: Check if two texts are anagrams");
            System.out.println("2: Get anagrams for a given string");
            System.out.println("3: Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter first text:");
                    String text1 = scanner.nextLine();
                    BeyonnexAnagramChecker.inputs.add(text1);

                    System.out.println("Enter second text:");
                    String text2 = scanner.nextLine();
                    BeyonnexAnagramChecker.inputs.add(text2);

                    if (BeyonnexAnagramChecker.f1(text1, text2)) {
                        System.out.println(text1 + " and " + text2 + " are anagrams.");
                    } else {
                        System.out.println(text1 + " and " + text2 + " are not anagrams.");
                    }
                    break;
                case 2:
                    System.out.println("Enter a string:");
                    String target = scanner.nextLine();
                    List<String> anagrams = BeyonnexAnagramChecker.f2(target);

                    if (anagrams.isEmpty()) {
                        System.out.println("No anagrams found for " + target);
                    } else {
                        System.out.println("Anagrams for " + target + ": " + anagrams);
                    }
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

}
