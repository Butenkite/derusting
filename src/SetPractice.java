import java.util.*;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    Set<String> hashSetPractice = new HashSet<String>();
    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
    hashSetPractice.add("good morning");
    hashSetPractice.add("good afternoon");
    hashSetPractice.add("good night");
    // Check whether the Set contains a given String
    hashSetPractice.contains("good morning");
    // Remove an element from the Set
    hashSetPractice.remove("good night");
    // Get the size of the Set
    hashSetPractice.size();
    // Iterate over the elements of the Set, printing each one on a separate line
    for(String saying : hashSetPractice){
      System.out.println(saying);
    }
    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
