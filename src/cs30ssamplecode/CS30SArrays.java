
/** required package class namespace */
package cs30ssamplecode;

/** required imports */
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
 *    - making randoms
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
public class CS30SArrays 
{

    // REUSABLE VARIABLES and METHODS below.....................................
    
    static final String TITLE      = "Sample App";
    static final Font   FONT       = new Font("Consolas",Font.PLAIN,12);
    static final Color  BACKGROUND = new Color(238,238,238);
    static final Color  FOREGROUND = new Color(0,0,0);
    
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
     * starts the application
     */
    private static void start() {
        output("Welcome to " + TITLE);
    }

    /**
     * ends the application
     */
    private static void end() {
        output("Thanks for using " + TITLE);
        System.exit(0);                                 // terminates the app
    }

    /**
     * Ask the user a yes and no question, in a confirm dialog box
     * 
     * @param text the yes no question to ask in the dialog
     * @return true (yes), false (no)
     */
    private static boolean yesNo(String text) {
        JTextArea area  = formatArea(text);
        int response = JOptionPane.showConfirmDialog(null,area,TITLE,
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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
        JTextArea area  = formatArea(text);
        String    value = JOptionPane.showInputDialog(null, 
                area,TITLE,JOptionPane.QUESTION_MESSAGE);
        while (value == null || value.equals("")) {
            area  = formatArea("Error, please enter again\n\n" + text);
            value = JOptionPane.showInputDialog(null,area,TITLE,
                    JOptionPane.QUESTION_MESSAGE);
        }
        return value;
    }
    
    /**
     * Asks the user for a number (integer) in a input dialog box
     * 
     * @param text the text for the dialog box
     * @return a valid integer
     */
    private static int inputInteger(String text) {
        String value = input(text);
        while (isInteger(value) == false) {
            value = input("Error, please enter again\n\n" + text);
        }
        int number = Integer.parseInt(value);
        return number;        
    }
    
    /**
     * Asks the user for a number (double) in a input
     * dialog box
     * 
     * @param text the text for the dialog box
     * @return a valid integer
     */
    private static double inputDouble(String text) {
        String value = input(text);
        while (isDouble(value) == false) {
            value = input("Error, please enter again\n\n" + text);
        }
        double number = Double.parseDouble(value);
        return number;        
    }

    /**
     * Checks the value to see if it contains numerical characters or a "-" 
     * or a "."
     * 
     * @param value the string of characters to check
     * @return is a number (true) or not (false)
     */
    private static boolean isDouble(String value) {
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
    private static boolean isInteger(String value) {
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
     * Outputs text in a more visual graphical dialog 
     * 
     * @param text the text to display
     * @param imageName the name of the image to display
     */
    private static void output(String text, String imageName) {
        JTextArea area    = formatArea(text);
        Icon      picture = new ImageIcon(imageName);
        JOptionPane.showMessageDialog(null,area,TITLE,
                JOptionPane.PLAIN_MESSAGE,picture);        
    }
    
    /**
     * Outputs text in a more visual graphical dialog 
     * 
     * @param text the text to display
     */
    private static void output(String text) {
        JTextArea area = formatArea(text);
        JOptionPane.showMessageDialog(null,area,TITLE,
                JOptionPane.PLAIN_MESSAGE);        
    }
    
    /**
     * Sets up a fancy display area for the text to display
     * 
     * @param text the string of text to format
     * @return the formatted text area for display
     */
    private static JTextArea formatArea(String text) {
        // create a graphics object to display the graphical things
        JTextArea area = new JTextArea();
        // assign the font, colors, and text to the area
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
        return yesNo("Do you want to play again?");
    }
    
    /**
     * Determines if a number if odd or even
     * 
     * @param number the number to check
     * @return true (if even), false (if odd)
     */
    private static boolean isEven(int number) {
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
    private static boolean inRange(int number, int low, int high) {
        if (number >= low && number <= high) return true;
        return false;
    }
        
    /**
     * Presents an input dialog with a drop down selection of options
     * 
     * @param text the text to show in the dialog
     * @param options the array of option to have in the drop down
     * @return the option they choose
     */
    private static String choices(String text, String[] options) {
        JTextArea area = formatArea(text);
        Object object = JOptionPane.showInputDialog(null, area, TITLE, 
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (object == null)  return "";
        else                 return object.toString();
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
    private static double[] random(double low, double high, int size) {
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
    private static char[] random(char low, char high, int size) {
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
    private static String toString(int[] array) {
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
    private static String toString(double[] array) {
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
    private static String toString(char[] array) {
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
    private static char random(char low, char high) {
        return (char)random((int)low,(int)high);     // cast to int and back  
    }
    
    /**
     * Generate a random number in a range
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return random number in the range
     */
    private static int random(int low, int high) {
        return (int)(random((double)low, (double)high));
    }
    
    /**
     * Generate a random number in a range
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return random number in the range
     */
    private static double random(double low, double high) {
        return (high - low + 1d) * Math.random() + low;
    }

    // METHODS and VARIABLES FOR THIS PROBLEM below.............................
 
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
            
            String   s2 = choices("Pick one", CHOICES);
            int[]    a1 = random(1, 100, 5);
            double[] a2 = random(1.0, 10.0, 5);
            char[]   a3 = random('a', 'z', 5);
            String   s3 = toString(a1);
            String   s4 = toString(a2);
            String   s5 = toString(a3);
                        
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
                        
            output(text);
        } while (playAgain() == true);
    }

}
