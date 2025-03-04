
/** required package class namespace */
package cs40samplecode;

/** required imports */
import cs40samplecode.io.Dialogs;
import cs40samplecode.tools.Numbers;
import cs40samplecode.tools.Text;
import java.awt.Font;


/**
 * CS40SampleCode.java - A sample of some code to try from the CS40S course. 
 * This code is divided into more usable classes and packages. This code is
 * just an example of some of the code tried in class or when helping 
 * students. It is not definitive code, may have bugs and has room for 
 * improvement as well as your own personal touches. But it does give you 
 * something to use to try to help with your problem solving.
 *
 * @author Mr. Wachs
 * @since Nov. 21, 2019, 3:49:01 p.m.
 */
public class CS40SampleCode 
{

    ////////////////////////////////////////////////////////////////////////////
    // REUSABLE VARIABLES and METHODS below.....................................
    // (Note: you may also copy the import(s) starting at line 5 above)
    ////////////////////////////////////////////////////////////////////////////
    
    static final String TITLE = "Sample App";
    static final Font   FONT  = new Font("Consolas",Font.PLAIN,12);
    
    static Dialogs dialog = new Dialogs(TITLE,null,FONT);
    
    
    /**
     * starts the application
     */
    private static void start() {
        dialog.output("Welcome to " + TITLE);
    }

    /**
     * ends the application
     */
    private static void end() {
        dialog.output("Thanks for using " + TITLE);
        System.exit(0);                                 // terminates the app
    }

    ////////////////////////////////////////////////////////////////////////////
    // METHODS and VARIABLES FOR THIS PROBLEM below.............................
    ////////////////////////////////////////////////////////////////////////////

    
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
            String  s1 = dialog.input("Enter string");            
            int     n1 = dialog.inputInteger("Enter integer");
            double  n2 = dialog.inputDouble("Enter double");
            int     n3 = Numbers.random(1, 5);
            int     n4 = Numbers.random(5, 10);
            boolean b1 = Numbers.inRange(5, n3, n4);
            boolean b2 = Numbers.isEven(5);     
            boolean b3 = dialog.yesNo("Do you understand?");
            double  d1 = Numbers.random(1.0, 10.0);
            char    c1 = Text.random('a', 'z');
            String  s2 = Text.random(5);
            
            // constant:
            final String[] CHOICES = { "A","B","C" };
                        
            String     s3 = dialog.choices("Pick one", CHOICES);
            int[]      a1 = Numbers.random(1, 100, 5);
            double[]   a2 = Numbers.random(1.0, 10.0, 5);
            char[]     a3 = Text.random('a', 'z', 5);
            String[]   a4 = Text.random('a', 'z', 5, 5);
            int[][]    m1 = Numbers.random(3,5,1,5);
            double[][] m2 = Numbers.random(3,5,1.0,5.0);
            char[][]   m3 = Text.random(3,5,'a','z');
            String[][] m4 = Text.random(3,5,5,'a','z');
            String     s4 = dialog.buttons("Click a button",CHOICES);
                        
            String   s5  = Text.toString(a1);
            String   s6  = Text.toString(a2);
            String   s7  = Text.toString(a3);
            String   s8  = Text.toString(a4);
            String   s9  = Text.toString(m1);
            String   s10  = Text.toString(m2);
            String   s11 = Text.toString(m3);
            String   s12 = Text.toString(m4);            
                                                
            // prepare output results:
            text += "String"                    + "\t\t\t= " + s1 + "\n";
            text += "int"                       + "\t\t\t= " + n1 + "\n";
            text += "double"                    + "\t\t\t= " + n2 + "\n";
            text += "5 {" + n3 + "-" + n4 + "}" + "\t\t\t= " + b1 + "\n";
            text += "5 is even"                 + "\t\t= "   + b2 + "\n";      
            text += "Do you understand"         + "\t= "     + b3 + "\n";    
            text += "random double"             + "\t\t= "   + d1 + "\n";
            text += "random char"               + "\t\t= "   + c1 + "\n";
            text += "random String"             + "\t\t= "   + s2 + "\n";
                        
            // now the arrays...
            text += "choice was"                + "\t\t= "   + s3 + "\n";
            text += "button was"                + "\t\t= "   + s4 + "\n";            
            text += "random int array"          + "\t= "     + s5 + "\n";
            text += "random double array"       + "\t= "     + s6 + "\n";
            text += "random char array"         + "\t= "     + s7 + "\n";
            text += "random string array"       + "\t= "     + s8 + "\n";
            text += "random int matrix:"        + "\n"       + s9;
            text += "random double matrix:"     + "\n"       + s10;
            text += "random char matrix:"       + "\n"       + s11;
            text += "random string matrix:"     + "\n"       + s12;
                                                            
            dialog.output(text);
        } while (dialog.playAgain());
    }
}
