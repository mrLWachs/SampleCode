
/** required package class namespace */
package cs30ssamplecode.withclasses;


/**
 * CS30SClasses.java - A sample of some code to try from up to the end of the 
 * classes unit. This code uses the same methods as the arrays unit, but it is 
 * now divided into more usable classes that target the specifics of what the
 * methods were trying to do and has categorized it into a class. this code is
 * just an example of some of the code tried in class or when helping 
 * students. It is not definitive code, may have bugs and has room for 
 * improvement as well as your own personal touches. But it does give you 
 * something to use to try to help with your problem solving.
 *
 * @author Mr. Wachs
 * @since Nov. 21, 2019, 3:49:01 p.m.
 */
public class Unit4Classes 
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
        Dialogs.output("Welcome to " + TITLE);
    }

    /**
     * ends the application
     */
    private static void end() {
        Dialogs.output("Thanks for using " + TITLE);
        System.exit(0);                                 // terminates the app
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
            String  s1 = Dialogs.input("Enter string");            
            int     n1 = Dialogs.inputInteger("Enter integer");
            double  n2 = Dialogs.inputDouble("Enter double");
            int     n3 = Numbers.random(1, 5);
            int     n4 = Numbers.random(5, 10);
            boolean b1 = Numbers.inRange(5, n3, n4);
            boolean b2 = Numbers.isEven(5);     
            boolean b3 = Dialogs.yesNo("Do you understand?");
            double  d1 = Numbers.random(1.0, 10.0);
            char    c1 = Numbers.random('a', 'z');
            
            // constant:
            final String[] CHOICES = { "A","B","C" };
            
            String   s2 = Dialogs.choices("Pick one", CHOICES);
            int[]    a1 = Numbers.random(1, 100, 5);
            double[] a2 = Numbers.random(1.0, 10.0, 5);
            char[]   a3 = Numbers.random('a', 'z', 5);
            String   s3 = Numbers.toString(a1);
            String   s4 = Numbers.toString(a2);
            String   s5 = Numbers.toString(a3);
                        
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
                        
            Dialogs.output(text);
        } while (Dialogs.playAgain());
    }
    
}
