public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String a = "ABCDE";
    // Find the length of the string
    a.length();
    // Concatenate (add) two strings together and reassign the result
    String b = "FGHIJ";
    String c = a + b;
    // Find the value of the character at index 3
    c.charAt(3);
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    c.contains("BCD");
    // Iterate over the characters of the string, printing each one on a separate line
    for(int i = 0; i < c.length(); i++){
      System.out.println(c.charAt(i));
    }
    // Create an ArrayList of Strings and assign it to a variable
    String[] myArray = new String[4];
    // Add multiple strings to the List (OK to do one-by-one)
    myArray[0] = "A";
    myArray[1] = "B";
    myArray[2] = "C";
    myArray[3] = "D";
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String combined = String.join(", ", myArray);
    // Check whether two strings are equal
    String d = "ABCDE";
    if(a.equals(d)){
      System.out.println("strings match up.");
    }
    else{
      System.out.println("strings don't match up.");
    }
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
