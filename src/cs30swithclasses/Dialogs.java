
/** required package class namespace */
package cs30swithclasses;

import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

 
/**
 * Dialogs.java - description
 *
 * @author Mr. Wachs
 * @since Nov. 21, 2019, 3:49:53 p.m.
 */
public class Dialogs 
{

    public static String title      = "Sample App";
    public static Font   font       = new Font("Consolas",Font.PLAIN,12);
    public static Color  background = new Color(238,238,238);
    public static Color  foreground = new Color(0,0,0);
    
    
    /**
     * Default constructor, set class properties
     * 
     * @param title
     * @param font
     * @param background
     * @param foreground 
     */
    public Dialogs(String title, Font font, Color background, Color foreground) {
        this.title      = title;
        this.font       = font;
        this.background = background;
        this.foreground = foreground;        
    }
    
    /**
     * Ask the user a yes and no question, in a confirm dialog box
     * 
     * @param text the yes no question to ask in the dialog
     * @return true (yes), false (no)
     */
    public static boolean yesNo(String text) {
        JTextArea area  = formatArea(text);
        int response = JOptionPane.showConfirmDialog(null,area,title,
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
    public static String input(String text) {
        JTextArea area  = formatArea(text);
        String    value = JOptionPane.showInputDialog(null, 
                area,title,JOptionPane.QUESTION_MESSAGE);
        while (value == null || value.equals("")) {
            area  = formatArea("Error, please enter again\n\n" + text);
            value = JOptionPane.showInputDialog(null,area,title,
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
    public static int inputInteger(String text) {
        String value = input(text);
        while (Numbers.isInteger(value) == false) {
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
    public static double inputDouble(String text) {
        String value = input(text);
        while (Numbers.isDouble(value) == false) {
            value = input("Error, please enter again\n\n" + text);
        }
        double number = Double.parseDouble(value);
        return number;        
    }
        
    /**
     * Outputs text in a more visual graphical dialog 
     * 
     * @param text the text to display
     * @param imageName the name of the image to display
     */
    public static void output(String text, String imageName) {
        JTextArea area    = formatArea(text);
        Icon      picture = new ImageIcon(imageName);
        JOptionPane.showMessageDialog(null,area,title,
                JOptionPane.PLAIN_MESSAGE,picture);        
    }
    
    /**
     * Outputs text in a more visual graphical dialog 
     * 
     * @param text the text to display
     */
    public static void output(String text) {
        JTextArea area = formatArea(text);
        JOptionPane.showMessageDialog(null,area,title,
                JOptionPane.PLAIN_MESSAGE);        
    }
    
    /**
     * Sets up a fancy display area for the text to display
     * 
     * @param text the string of text to format
     * @return the formatted text area for display
     */
    public static JTextArea formatArea(String text) {
        // create a graphics object to display the graphical things
        JTextArea area = new JTextArea();
        // assign the font, colors, and text to the area
        area.setFont(font);
        area.setBackground(background);
        area.setForeground(foreground);
        area.setText(text);
        return area;
    }
        
    /**
     * Ask the user if they want to play again, in a dialog box
     * 
     * @return true (yes, play again), false (no)
     */
    public static boolean playAgain() {
        return yesNo("Do you want to play again?");
    }
            
    /**
     * Presents an input dialog with a drop down selection of options
     * 
     * @param text the text to show in the dialog
     * @param options the array of option to have in the drop down
     * @return the option they choose
     */
    public static String choices(String text, String[] options) {
        JTextArea area = formatArea(text);
        Object object = JOptionPane.showInputDialog(null, area, title, 
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (object == null)  return "";
        else                 return object.toString();
    }
    
}
