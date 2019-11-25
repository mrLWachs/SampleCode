
/** required package class namespace */
package cs30ssamplecode.withclasses;

 
/**
 * Numbers.java - description
 *
 * @author Mr. Wachs
 * @since Nov. 21, 2019, 3:49:35 p.m.
 */
public class Numbers 
{

    /**
     * Default constructor, set class properties
     */
    public Numbers() {
        
    }
    
    /**
     * Checks the value to see if it contains numerical characters or a "-" 
     * or a "."
     * 
     * @param value the string of characters to check
     * @return is a number (true) or not (false)
     */
    public static boolean isDouble(String value) {
        char[] characters = value.toCharArray();
        for (int i = 0; i < characters.length; i++) {            
            if (Character.isDigit(characters[i]) == false) {
                if (characters[i] != '.' && 
                    characters[i] != '-') {
                    return false;
                }
            }
        }
        return true;
    }
    
    /**
     * Checks the value to see if it contains numerical characters or a "-"
     * 
     * @param value the string of characters to check
     * @return is a number (true) or not (false)
     */
    public static boolean isInteger(String value) {
        char[] characters = value.toCharArray();
        for (int i = 0; i < characters.length; i++) {            
            if (Character.isDigit(characters[i]) == false) {
                if (characters[i] != '-') {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Determines if a number if odd or even
     * 
     * @param number the number to check
     * @return true (if even), false (if odd)
     */
    public static boolean isEven(int number) {
        if (number % 2 == 0) return true;
        else                 return false;
    }
    
    /**
     * Checks to make sure the number is in the range
     * 
     * @param number the number to check
     * @param low lowest in the range
     * @param high highest in the range
     * @return in range (true) or not (false)
     */
    public static boolean inRange(int number, int low, int high) {
        if (number >= low && number <= high) return true;
        return false;
    }
 
    /**
     * Generates an array of random integers in the range between low and high
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @param size the size to make the array
     * @return an array of random integers
     */
    public static int[] random(int low, int high, int size) {
        int[] numbers = new int[size];      // create empty array of passed size
        for (int i = 0; i < size; i++) {    // traverse array size
            numbers[i] = random(low,high);  // assign random value to each index
        }
        return numbers;                     // return completed array
    }
    
    /**
     * Generates an array of random doubles in the range between low and high
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @param size the size to make the array
     * @return an array of random doubles
     */
    public static double[] random(double low, double high, int size) {
        double[] numbers = new double[size]; // create empty array 
        for (int i = 0; i < size; i++) {    // traverse array size
            numbers[i] = random(low,high);  // assign random value to each index
        }
        return numbers;                     // return completed array
    }
   
    /**
     * Generates an array of random characters in the range between low and high
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @param size the size to make the array
     * @return an array of random characters
     */
    public static char[] random(char low, char high, int size) {
        char[] numbers = new char[size];    // create empty array 
        for (int i = 0; i < size; i++) {    // traverse array size
            numbers[i] = random(low,high);  // assign random value to each index
        }
        return numbers;                     // return completed array
    }
    
    /**
     * Formats the array into a string that could be outputted
     * 
     * @param array the array to format
     * @return a string of formatted text
     */
    public static String toString(int[] array) {
        String text = "[";
        for (int i = 0; i < array.length-1; i++) {
            text += array[i] + ",";
        }
        text += array[array.length-1] + "]";
        return text;
    }
    
    /**
     * Formats the array into a string that could be outputted
     * 
     * @param array the array to format
     * @return a string of formatted text
     */
    public static String toString(double[] array) {
        String text = "[";
        for (int i = 0; i < array.length-1; i++) {
            text += array[i] + ",";
        }
        text += array[array.length-1] + "]";
        return text;
    }
    
    /**
     * Formats the array into a string that could be outputted
     * 
     * @param array the array to format
     * @return a string of formatted text
     */
    public static String toString(char[] array) {
        String text = "[";
        for (int i = 0; i < array.length-1; i++) {
            text += array[i] + ",";
        }
        text += array[array.length-1] + "]";
        return text;
    }
    
    /**
     * Generates a random character
     * 
     * @param low lowest character in the range
     * @param high highest character in the range
     * @return random character in range
     */
    public static char random(char low, char high) {
        return (char)random((int)low,(int)high);     // cast to int and back  
    }
    
    /**
     * Generate a random number in a range
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return random number in the range
     */
    public static int random(int low, int high) {
        return (int)(random((double)low, (double)high));
    }
    
    /**
     * Generate a random number in a range
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return random number in the range
     */
    public static double random(double low, double high) {
        return (high - low + 1d) * Math.random() + low;
    }

}
