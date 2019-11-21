
/** required package class namespace */
package samplecode;

/** required imports */
import javax.swing.JOptionPane;


/**
 * CS30SMethods.java - A sample of some code to try from up to the end of the 
 * methods unit. As you solve problems, some common tasks keep coming up like:
 *    - inputting a number
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
public class CS30SMethods
{

    // REUSABLE VARIABLES and METHODS below.....................................
    
    static final String TITLE = "Sample App";
    
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
        int response = JOptionPane.showConfirmDialog(null,text,TITLE,
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Asks the user for a string input in a input dialog box
     * 
     * @param text the text for the dialog box
     * @return a valid string
     */
    private static String input(String text) {
        String value = JOptionPane.showInputDialog(null, 
                text,TITLE,JOptionPane.QUESTION_MESSAGE);
        while (value == null || value.equals("")) {
            value = JOptionPane.showInputDialog(null,
                    "Error, please enter again\n\n" + text,TITLE,
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
        while (value.equals("")) {
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
        while (value.equals("")) {
            value = input("Error, please enter again\n\n" + text);
        }
        double number = Double.parseDouble(value);
        return number;        
    }
    
    /**
     * Outputs text in a more visual graphical dialog 
     * 
     * @param text the text to display
     */
    private static void output(String text) {
        JOptionPane.showMessageDialog(null,text,TITLE,
                JOptionPane.PLAIN_MESSAGE);        
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
        if (number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
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
        if (number >= low && number <= high) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Generate a random number in a range
     * 
     * @param low the lowest number in the range
     * @param high the highest number in the range
     * @return random number in the range
     */
    private static int random(int low, int high) {
        double seed   = Math.random();
        double L      = (double)low;
        double H      = (double)high;
        double value  = (H - L + 1) * seed + L;
        int    answer = (int)value;
        return answer;        
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
            
            // prepare output results:
            text += "String = "            + s1 + "\n";
            text += "int    = "            + n1 + "\n";
            text += "double = "            + n2 + "\n";
            text += "5 between " + n3 + " and " + n4 + " = " + b1 + "\n";
            text += "5 is even = "         + b2 + "\n";      
            text += "Do you understand = " + b3 + "\n";  
            
            output(text);
        } while (playAgain() == true);
    }

}
