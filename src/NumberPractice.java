public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float i = -0.1f;
    // Create an int with a positive value and assign it to a variable
    int k = 4;
    // Use the modulo % operator to find the remainder when the int is divided by 3
    int l = k%3;
    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.
    if(k % 2 == 1){
      System.out.println("Odd");
    }
    else{
      System.out.println("Even");
    }

    // Divide the number by another number using integer division
    int a = 4;
    int b = 2;
    int c = a / b;
    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
