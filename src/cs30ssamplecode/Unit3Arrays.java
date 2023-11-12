
/** Required package class namespace */
package cs30ssamplecode;

/** Required imports */
import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


/**
 * CS30SArrays.java - A sample of some code to try from up to the end of the 
 * arrays unit. As you solve problems, some common tasks keep coming up like:
 *    - inputting a number
 *    - giving users a choice from a list
 *    - making randoms (including entire arrays of randoms)
 * Etc. and you find you are writing simple dialog boxes or trying something 
 * a little fancier with graphical type things. These methods are just an 
 * example of some of the code tried in class or when helping students. It is
 * not a definitive code, may have bugs and has room for improvement as well
 * as your own personal touches. But it does give you something to try to help
 * with your problem solving.
 *
 * @author Mr. Wachs
 * @since Nov. 14, 2019, 10:29:49 a.m.
 */
public class Unit3Arrays 
{

    // REUSABLE VARIABLES and METHODS (below this line)........................
    
    static final String TITLE      = "Sample App";
    static final Font   FONT       = new Font("Consolas",Font.PLAIN,12);
    static final Color  BACKGROUND = new Color(238,238,238);
    static final Color  FOREGROUND = new Color(0,0,0);

    
    /**
     * Starts the application and welcomes user with a dialog
     */
    private static void start() {
        // Call output to generate a dialog and attach the title global variable
        output("Welcome to " + TITLE);
    }
    
    /**
     * Ends the application with a dialog and terminates the application
     */
    private static void end() {
        // Call output dialog and attach global title then terminate the app
        output("Thanks for using " + TITLE);
        System.exit(0);                                 // Terminates the app
    }

    /**
     * Ask the user a yes and no question, in a confirm dialog box
     * 
     * @param text the yes no question to ask in the dialog
     * @return true (yes), false (no)
     */
    private static boolean yesNo(String text) {
        // Create graphical display area with formatted text to put in dialog
        JTextArea area = formatArea(text);
        // Store the user's response in a variable from what they clicked on
        // when the dialog appears only showing "yes" and "no" buttons for 
        // the user to choose from  
        int response = JOptionPane.showConfirmDialog(null,area,TITLE,
                JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (response == JOptionPane.YES_OPTION) return true;
        else                                    return false;
    }
    
    /**
     * Asks the user for a string input in a input dialog box
     * 
     * @param text the text for the dialog box
     * @return a valid string
     */
    private static String input(String text) {
        // Create graphical display area with formatted text to put in dialog
        JTextArea area = formatArea(text);
        // Store the user's response in a variable from what they typed into
        // a input dialog
        String    value = JOptionPane.showInputDialog(null, 
                area,TITLE,JOptionPane.PLAIN_MESSAGE);
        // Create an error message if they user did not enter a value correctly
        final String ERROR = "Error, please enter again\n\n";
        // Force a loop if the user left the dialog empty and clicked "ok" or
        // they clicked "cancel" or the "X"
        while (value == null || value.equals("")) {
            // Recreate the graphical display area
            area  = formatArea(ERROR + text);
            value = JOptionPane.showInputDialog(null,area,TITLE,
                    JOptionPane.PLAIN_MESSAGE);
        }
        return value;           // Once they have entered a value, return it
    }
    
    /**
     * Asks the user for a number (integer) in a input dialog box
     * 
     * @param text the text for the dialog box
     * @return a valid integer
     */
    private static int inputInteger(String text) {
        String value = input(text);     // Get user's response
        // Create an error message if they user did not enter a value correctly
        final String ERROR = "Error, please enter again\n\n";
        // Force a loop if the user did not enter a valid integer
        while (isInteger(value) == false) {
            value = input(ERROR + text);
        }
        int number = Integer.parseInt(value);       // Convert to integer
        return number;                              // Return number value
    }
    
    /**
     * Asks the user for a number (double) in a input
     * dialog box
     * 
     * @param text the text for the dialog box
     * @return a valid integer
     */
    private static double inputDouble(String text) {
        String value = input(text);     // Get user's response
        // Create an error message if they user did not enter a value correctly
        final String ERROR = "Error, please enter again\n\n";
        // Force a loop if the user did not enter a valid double
        while (isDouble(value) == false) {
            value = input(ERROR + text);
        }
        double number = Double.parseDouble(value);      // Convert to double
        return number;                                  // Return number value
    }
    
    /**
     * Checks the value to see if it contains numerical characters or a "-"
     * 
     * @param value the string of characters to check
     * @return is a number (true) or not (false)
     */
    private static boolean isInteger(String value) {
        // Convert string into array of char values (built-in string method)
        char[] characters = value.toCharArray();
        // Loop (traverse) through this array from start to end
        for (int i = 0; i < characters.length; i++) {      
            // Read in the character at this index
            char character = characters[i];
            // Use built-in method to see if this character is a digit (0-9)
            if (Character.isDigit(character) == false) {
                // Character was not a digit, but is it the negative sign 
                if (characters[i] != '-') {
                    return false;       // Not a valid character for a integer
                }
            }
        }
        return true;                    // All characters valid for a integer
    }

    /**
     * Checks the value to see if it contains numerical characters or a "-" 
     * or a "."
     * 
     * @param value the string of characters to check
     * @return is a number (true) or not (false)
     */
    private static boolean isDouble(String value) {
        // Convert string into array of char values (built-in string method)
        char[] characters = value.toCharArray();
        // Loop (traverse) through this array from start to end
        for (int i = 0; i < characters.length; i++) {  
            // Read in the character at this index
            char character = characters[i];
            // Use built-in method to see if this character is a digit (0-9)
            if (Character.isDigit(character) == false) {
                // Character was not a digit, but is it the negative sign or
                // the decimal symbol
                if (characters[i] != '.' && 
                    characters[i] != '-') {
                    return false;       // Not a valid character for a double
                }
            }
        }
        return true;                    // All characters valid for a double
    }
    
    /**
     * Outputs text in a more visual graphical dialog 
     * 
     * @param text the text to display
     */
    private static void output(String text) {
        // Create graphical display area with formatted text to put in dialog
        JTextArea area = formatArea(text);
        // Add the display area to the dialog to show the user
        JOptionPane.showMessageDialog(null,area,TITLE,
                JOptionPane.PLAIN_MESSAGE);        
    }
        
    /**
     * Outputs text in a more visual graphical dialog 
     * 
     * @param text the text to display
     * @param imageName the name of the image to display
     */
    private static void output(String text, String imageName) {
        // Create graphical display area with formatted text to put in dialog
        JTextArea area = formatArea(text);
        // Create a icon picture from the name (and path) to an image file
        Icon picture = new ImageIcon(imageName);
        // Add the display area and icon to the dialog to show the user
        JOptionPane.showMessageDialog(null,area,TITLE,
                JOptionPane.PLAIN_MESSAGE,picture);        
    }
    
    /**
     * Sets up a fancy display area for the text to display
     * 
     * @param text the string of text to format
     * @return the formatted text area for display
     */
    private static JTextArea formatArea(String text) {
        // Create a graphics object to display the graphical things
        JTextArea area = new JTextArea();
        // Assign the global variable font, colors, and passed text to the area
        area.setFont(FONT);
        area.setBackground(BACKGROUND);
        area.setForeground(FOREGROUND);
        area.setText(text);
        return area;
    }
        
    /**
     * Ask the user if they want to play again, in a dialog box
     * 
     * @return true (yes, play again), false (no)
     */
    private static boolean playAgain() {
        // Send the yesNo method the play again message
        return yesNo("Do you want to play again?");
    }
    
    /**
     * Determines if a number if odd or even
     * 
     * @param number the number to check
     * @return true (if even), false (if odd)
     */
    private static boolean isEven(int number) {
        if (number % 2 == 0) return true;   // Number divides evenly by zero
        else                 return false;  // Number does not divide by zero
    }
    
    /**
     * Checks to make sure the number is in the range
     * 
     * @param number the number to check
     * @param low lowest in the range
     * @param high highest in the range
     * @return in range (true) or not (false)
     */
    private static boolean inRange(int number, int low, int high) {
        if (number >= low && number <= high) return true;
        return false;
    }
        
    /**
     * Generate a random number (a double) in a range
     * 
     * @param low the lowest double in the range
     * @param high the highest double in the range
     * @return random double in the range
     */
    private static double random(double low, double high) {
        return (high - low + 1d) * Math.random() + low;
    }
    
    /**
     * Generate a random number (an integer) in a range
     * 
     * @param low the lowest integer in the range
     * @param high the highest integer in the range
     * @return random integer in the range
     */
    private static int random(int low, int high) {
        return (int)(random((double)low, (double)high));
    }
    
    /**
     * Generates a random character in a range
     * 
     * @param low lowest character in the range
     * @param high highest character in the range
     * @return random character in range
     */
    private static char random(char low, char high) {
        return (char)random((int)low,(int)high);     // cast to int and back  
    }
    
    /**
     * Presents an input dialog with a drop down selection of options
     * 
     * @param text the text to show in the dialog
     * @param options the array of option to have in the drop down
     * @return the option they choose
     */
    private static String choices(String text, String[] options) {
        // Create graphical display area with formatted text to put in dialog
        JTextArea area = formatArea(text);
        // Add display area to dialog to show user which gives a drop-down
        // in the dialog and returns an "object"
        Object object = JOptionPane.showInputDialog(null, area, TITLE, 
                JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        if (object == null)  return "";                 // User selects "X"
        else                 return object.toString();  // Return user's choice
    }
        
    /**
     * Generates an array of random integers in the range between low and high
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @param size the size to make the array
     * @return an array of random integers
     */
    private static int[] random(int low, int high, int size) {
        int[] numbers = new int[size];      // Create empty array of passed size
        for (int i = 0; i < size; i++) {    // Traverse array 
            numbers[i] = random(low,high);  // Assign random value to each index
        }
        return numbers;                     // Return completed array
    }
    
    /**
     * Generates an array of random doubles in the range between low and high
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @param size the size to make the array
     * @return an array of random doubles
     */
    private static double[] random(double low, double high, int size) {
        double[] numbers = new double[size]; // Create empty array 
        for (int i = 0; i < size; i++) {    // Traverse array 
            numbers[i] = random(low,high);  // Assign random value to each index
        }
        return numbers;                     // Return completed array
    }
   
    /**
     * Generates an array of random characters in the range between low and high
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @param size the size to make the array
     * @return an array of random characters
     */
    private static char[] random(char low, char high, int size) {
        char[] numbers = new char[size];    // Create empty array 
        for (int i = 0; i < size; i++) {    // Traverse array 
            numbers[i] = random(low,high);  // Assign random value to each index
        }
        return numbers;                     // Return completed array
    }
    
    /**
     * Generates a matrix of random integers in the range between low and high
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @param rows the number of rows (down) to make the matrix 
     * @param columns the number of columns (across) to make the matrix
     * @return an array of random integers
     */
    private static int[][] random(int low, int high, int rows, int columns) {
        int[][] matrix = new int[rows][columns];    // Create empty matrix
        for (int row = 0; row < rows; row++) {                  // Travel rows
            for (int column = 0; column < columns; column++) {  // and columns
                matrix[row][column] = random(low, high);        // Assign value
            }
        }
        return matrix;                              // Return completed matrix
    }
    
    /**
     * Generates a matrix of random doubles in the range between low and high
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @param rows the number of rows (down) to make the matrix 
     * @param columns the number of columns (across) to make the matrix
     * @return an array of random doubles
     */
    private static double[][] random(double low, double high, int rows, 
                                     int columns) {
        double[][] matrix = new double[rows][columns];    // Create empty matrix
        for (int row = 0; row < rows; row++) {                  // Travel rows
            for (int column = 0; column < columns; column++) {  // and columns
                matrix[row][column] = random(low, high);        // Assign value
            }
        }
        return matrix;                              // Return completed matrix
    }
    
    /**
     * Generates a matrix of random characters in the range between low and high
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @param rows the number of rows (down) to make the matrix 
     * @param columns the number of columns (across) to make the matrix
     * @return an array of random characters
     */
    private static char[][] random(char low, char high, int rows, int columns) {
        char[][] matrix = new char[rows][columns];    // Create empty matrix
        for (int row = 0; row < rows; row++) {                  // Travel rows
            for (int column = 0; column < columns; column++) {  // and columns
                matrix[row][column] = random(low, high);        // Assign value
            }
        }
        return matrix;                              // Return completed matrix
    }
    
    /**
     * Formats the array into a string that could be outputted
     * 
     * @param array the array to format
     * @return a string of formatted text
     */
    private static String toString(int[] array) {
        String text = "[";                          // Variable to store array
        for (int i = 0; i < array.length-1; i++) {  // Traverse array 
            text += array[i] + ",";                 // Attach index to variable
        }
        text += array[array.length-1] + "]";        // Attach last index
        return text;
    }
    
    /**
     * Formats the array into a string that could be outputted
     * 
     * @param array the array to format
     * @return a string of formatted text
     */
    private static String toString(double[] array) {
        String text = "[";                          // Variable to store array
        for (int i = 0; i < array.length-1; i++) {  // Traverse array 
            text += array[i] + ",";                 // Attach index to variable
        }
        text += array[array.length-1] + "]";        // Attach last index
        return text;
    }
    
    /**
     * Formats the array into a string that could be outputted
     * 
     * @param array the array to format
     * @return a string of formatted text
     */
    private static String toString(char[] array) {
        String text = "[";                          // Variable to store array
        for (int i = 0; i < array.length-1; i++) {  // Traverse array 
            text += array[i] + ",";                 // Attach index to variable
        }
        text += array[array.length-1] + "]";        // Attach last index
        return text;
    }
    
    /**
     * Formats the matrix into a string that could be outputted
     * 
     * @param matrix the array to format
     * @return a string of formatted text
     */
    private static String toString(int[][] matrix) {
        String text = "";                          // Variable to store array
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                text += matrix[row][column] + " \t";
            }
            text += "\n";
        }
        return text;
    }
    
    /**
     * Formats the matrix into a string that could be outputted
     * 
     * @param matrix the array to format
     * @return a string of formatted text
     */
    private static String toString(double[][] matrix) {
        String text = "";                          // Variable to store array
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                text += matrix[row][column] + " \t";
            }
            text += "\n";
        }
        return text;
    }
    
    /**
     * Formats the matrix into a string that could be outputted
     * 
     * @param matrix the array to format
     * @return a string of formatted text
     */
    private static String toString(char[][] matrix) {
        String text = "";                          // Variable to store array
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                text += matrix[row][column] + " \t";
            }
            text += "\n";
        }
        return text;
    }
    
    // PROBLEM SPECIFIC VARIABLES and METHODS (below this line)................

    /**
     * Main method for the project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start();
        program();
        end();
    }
    
    /**
     * The main logic for this program
     */
    private static void program() {
        do {                        
            // variables:
            String text = "Sample program...\n\n";
            
            // text input dialogs
            String  s1 = input("Enter string");            
            int     n1 = inputInteger("Enter integer");
            double  n2 = inputDouble("Enter double");
            int     n3 = random(1, 5);
            int     n4 = random(5, 10);
            boolean b1 = inRange(5, n3, n4);
            boolean b2 = isEven(5);     
            boolean b3 = yesNo("Do you understand?");
            double  d1 = random(1.0, 10.0);
            char    c1 = random('a', 'z');
            
            // constant:
            final String[] CHOICES = { "A","B","C" };
            
            String     s2 = choices("Pick one", CHOICES);
            int[]      a1 = random(1, 100, 5);
            double[]   a2 = random(1.0, 10.0, 5);
            char[]     a3 = random('a', 'z', 5);            
            int[][]    m1 = random(1, 9, 4, 5);
            double[][] m2 = random(1.0, 9.0, 4, 5);
            char[][]   m3 = random('a', 'z', 4, 5);
            String     s3 = toString(a1);
            String     s4 = toString(a2);
            String     s5 = toString(a3);
            String     s6 = toString(m1);
            String     s7 = toString(m2);
            String     s8 = toString(m3);
            
            // prepare output results:
            text += "String"                    + "\t\t\t= " + s1 + "\n";
            text += "int"                       + "\t\t\t= " + n1 + "\n";
            text += "double"                    + "\t\t\t= " + n2 + "\n";
            text += "5 {" + n3 + "-" + n4 + "}" + "\t\t\t= " + b1 + "\n";
            text += "5 is even"                 + "\t\t= "   + b2 + "\n";      
            text += "Do you understand"         + "\t= "     + b3 + "\n";    
            text += "random double"             + "\t\t= "   + d1 + "\n";
            text += "random char"               + "\t\t= "   + c1 + "\n";
            
            // now the arrays...
            text += "choice was"                + "\t\t= "   + s2 + "\n";            
            text += "random int array"          + "\t= "     + s3 + "\n";
            text += "random double array"       + "\t= "     + s4 + "\n";
            text += "random char array"         + "\t= "     + s5 + "\n";
            text += "random int matrix"         + "\t=\n\n"  + s6 + "\n";
            text += "random double matrix"      + "\t=\n\n"  + s7 + "\n";
            text += "random char matrix"        + "\t=\n\n"  + s8 + "\n";
                                    
            output(text);
        } while (playAgain() == true);
    }

}
