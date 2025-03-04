
/** required package class namespace */
package cs30ssamplecode;

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
public class Unit2Methods
{

    // REUSABLE VARIABLES and METHODS (below this line)........................
    
    static final String TITLE = "Sample App";

    
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
        // Store the user's response in a variable from what they clicked on
        // when the dialog appears only showing "yes" and "no" buttons for 
        // the user to choose from         
        int response = JOptionPane.showConfirmDialog(null,text,TITLE,
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);        
        if (response == JOptionPane.YES_OPTION) {
            return true;            // The user's response picked yes
        }
        else {
            return false;           // The user's response picked no
        }
    }
    
    /**
     * Asks the user for a string input in a input dialog box
     * 
     * @param text the text for the dialog box
     * @return a valid string
     */
    private static String input(String text) {
        // Store the user's response in a variable from what they typed into
        // a input dialog
        String value = JOptionPane.showInputDialog(null, 
                text,TITLE,JOptionPane.QUESTION_MESSAGE);
        // Create an error message if they user did not enter a value correctly
        final String ERROR = "Error, please enter again\n\n";
        // Force a loop if the user left the dialog empty and clicked "ok" or
        // they clicked "cancel" or the "X"
        while (value == null || value.equals("")) {
            // Have the user enter again (with error message attached)
            value = JOptionPane.showInputDialog(null,ERROR + text,TITLE,
                        JOptionPane.QUESTION_MESSAGE);
        }
        // Once they have entered a value, return it
        return value;
    }
    
    /**
     * Asks the user for a number (integer) in a input dialog box
     * 
     * @param text the text for the dialog box
     * @return a valid integer
     */
    private static int inputInteger(String text) {
        // Store user's response from what they inputted in a dialog
        String value = input(text);
        // Create an error message if they user did not enter a value correctly
        final String ERROR = "Error, please enter again\n\n";
        // Force a loop if the user left the dialog empty
        while (value.equals("")) {
            value = input(ERROR + text);
        }
        // Now convert what the user entered into an integer
        int number = Integer.parseInt(value);
        return number;        // Then return that number value      
    }
    
    /**
     * Asks the user for a number (double) in a input
     * dialog box
     * 
     * @param text the text for the dialog box
     * @return a valid integer
     */
    private static double inputDouble(String text) {
        // Store user's response from what they inputted in a dialog
        String value = input(text);
        // Create an error message if they user did not enter a value correctly
        final String ERROR = "Error, please enter again\n\n";
        // Force a loop if the user left the dialog empty
        while (value.equals("")) {
            value = input(ERROR + text);
        }
        double number = Double.parseDouble(value);      // Convert to double
        return number;                                  // Return number value       
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
        if (number % 2 == 0) {      // Number divides evenly by zero
            return true;
        }
        else {                      // Number does not divide evenly by zero
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
        double seed   = Math.random();              // Create random seed value
        double L      = (double)low;                // Cast low boundry
        double H      = (double)high;               // Cast high boundry
        double value  = (H - L + 1) * seed + L;     // Apply formula
        int    answer = (int)value;                 // Cast back to integer
        return answer;                              // return final value     
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
