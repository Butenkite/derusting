import java.util.*;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> mapsPractice = new HashMap<>();
    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    mapsPractice.put("hello", 0);
    mapsPractice.put("neutral", 1);
    mapsPractice.put("goodbye", 2);
    // Get the value associated with a given key in the Map
    mapsPractice.get("hello");
    // Find the size (number of key/value pairs) of the Map
    mapsPractice.size();
    // Replace the value associated with a given key (the size of the Map shoukld not change)
    mapsPractice.replace("hello", 3);
    // Check whether the Map contains a given key
    mapsPractice.containsKey("goodbye");
    // Check whether the Map contains a given value
    mapsPractice.containsValue(5);
    // Iterate over the keys of the Map, printing each key
    for(String entry : mapsPractice.keySet()){ 
      System.out.println(entry);
    }
    // Iterate over the values of the map, printing each value
    for(int entry : mapsPractice.values()){ 
      System.out.println(entry);
    }
    // Iterate over the entries in the map, printing each key and value
    for(String entry : mapsPractice.keySet()){ 
      System.out.println("Key: " + entry + ". Value: " + mapsPractice.get(entry));
    }
    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
