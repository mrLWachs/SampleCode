
/** required package class namespace */
package cs42samplecode;

/** required imports */
import cs42samplecode.collections.LinkedList;
import cs42samplecode.io.Dialogs;
import cs42samplecode.tools.Numbers;
import cs42samplecode.tools.Text;
import java.awt.Font;


/**
 * CS42SIBSampleCode.java - A sample of some code to try from the CS42SIB
 * course. This code is divided into more usable classes and packages. This 
 * code is just an example of some of the code tried in class or when helping 
 * students. It is not definitive code, may have bugs and has room for 
 * improvement as well as your own personal touches. But it does give you 
 * something to use to try to help with your problem solving.
 *
 * @author Mr. Wachs
 * @since Nov. 21, 2019, 3:49:01 p.m.
 */
public class CS42SIBSampleCode 
{
    
    // REUSABLE VARIABLES and METHODS below.....................................
    
    private static final String TITLE = "Sample App";
    private static final Font   FONT  = new Font("Consolas",Font.PLAIN,12);
    
    private static Dialogs dialogs = new Dialogs(TITLE,null,FONT);
    private static Text    text    = new Text();
    private static Numbers numbers = new Numbers();
    
    
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
        dialogs.output("Welcome to " + TITLE);
    }

    /**
     * ends the application
     */
    private static void end() {
        dialogs.output("Thanks for using " + TITLE);
        System.exit(0);                                 // terminates the app
    }

    // METHODS and VARIABLES FOR THIS PROBLEM below.............................
 
    /**
     * The main logic for this program
     */
    private static void program() {
        do {                        
            
            // constants:
            final String[] CHOICES    = { "A","B","C" };
            final int      MIN        = 1;
            final int      MAX        = 5;
            final int      ROWS       = 3;
            final int      COLUMNS    = 5; 
            final int      PLACES     = 4;             
            final char     ALPHA_MIN  = 'a';
            final char     ALPHA_MAX  = 'z';
                        
            // variables:
            String outputText = "Sample program...\n\n";
                        
            // text input dialogs
            String  i1 = dialogs.input("Enter string");            
            int     i2 = dialogs.inputInteger("Enter integer");
            double  i3 = dialogs.inputDouble("Enter double");
            boolean i4 = dialogs.yesNo("Do you understand?");
            String  i5 = dialogs.choices("Pick one", CHOICES);
            String  i6 = dialogs.buttons("Click a button",CHOICES);
            
            // other methods
            boolean o1 = numbers.isEven(MAX); 
            boolean o2 = numbers.inRange(MIN,MIN,MAX);
            
            // random variable values
            int     r1 = numbers.random(MIN, MAX);                          
            double  r2 = numbers.random(((double)MIN), ((double)MAX));
            char    r3 = text.random(ALPHA_MIN, ALPHA_MAX);
            String  r4 = text.random(MAX);
            String  r5 = text.randomWord();
                        
            // random arrays
            int    a1[] = numbers.random(MIN, MAX, MAX);
            double a2[] = numbers.random(((double)MIN), ((double)MAX), MAX);
            char   a3[] = text.random(ALPHA_MIN, ALPHA_MAX, MAX);
            String a4[] = text.random(ALPHA_MIN, ALPHA_MAX, MAX, MAX);
            String a5[] = text.randomWords(MAX);
            
            // random matrices
            int    m1[][] = numbers.random(ROWS,COLUMNS,MIN,MAX);
            double m2[][] = numbers.random(ROWS,COLUMNS,((double)MIN), ((double)MAX));
            char   m3[][] = text.random(ROWS,COLUMNS,ALPHA_MIN,ALPHA_MAX);
            String m4[][] = text.random(ROWS,COLUMNS,MAX,ALPHA_MIN,ALPHA_MAX);
            String m5[][] = text.randomWords(ROWS, COLUMNS);
            
            // random lists
            LinkedList<Integer>   l1 = numbers.randomList(MIN, MAX, MAX);
            LinkedList<Double>    l2 = numbers.randomList(((double)MIN), ((double)MAX), MAX);
            LinkedList<Character> l3 = text.randomList(ALPHA_MIN, ALPHA_MAX, MAX);
            LinkedList<String>    l4 = text.randomList(ALPHA_MIN, ALPHA_MAX, MAX, MAX);
            LinkedList<String>    l5 = text.randomList(MAX);
            
            // round off the double arrays, matrices and lists
            double             ro1[]   = numbers.round(a2, PLACES);
            double             ro2[][] = numbers.round(m2, PLACES);
            LinkedList<Double> ro3     = numbers.round(l2, PLACES);
            
            // pad arrays, matrices, and lists
            String             p1[]   = text.padSpaces(a4);
            String             p2[]   = text.padSpaces(a5);
            String             p3[][] = text.padSpaces(m4);
            String             p4[][] = text.padSpaces(m5);
            LinkedList<String> p5     = text.padSpaces(l4);
            LinkedList<String> p6     = text.padSpaces(l5);
                        
            // format arrays           
            String s1 = text.toString(a1);
            String s2 = text.toString(ro1);
            String s3 = text.toString(a3);
            String s4 = text.toString(p1);
            String s5 = text.toString(p2);
            
            // format matrices
            String s6  = text.toString(m1);
            String s7  = text.toString(ro2);
            String s8  = text.toString(m3);
            String s9  = text.toString(p3);
            String s10 = text.toString(p4);
                        
            // prepare output results:
            
            // inputted values
            outputText += "\nInputted values....\n\n";
            outputText += "Entered String"               + "\t\t\t= " + i1 + "\n";
            outputText += "Entered integer"              + "\t\t\t= " + i2 + "\n";
            outputText += "Entered double"               + "\t\t\t= " + i3 + "\n";
            outputText += "Selected 'Do you understand'" + "\t= "     + i4 + "\n";
            outputText += "Selected 'Pick one'"          + "\t\t= "   + i5 + "\n";
            outputText += "Selected 'Click a button'"    + "\t= "     + i6 + "\n";
            
            // other methods outputs
            outputText += "\nOther method outputs....\n\n";
            outputText += "Method isEven"             + "\t= " + o1  + "\n";
            outputText += "Method inRange"            + "\t= " + o2  + "\n";
            
            // random variables 
            outputText += "\nRandom variables....\n\n";
            outputText += "random integer"            + "\t= " + r1 + "\n";
            outputText += "random double"             + "\t= " + r2 + "\n";
            outputText += "random char"               + "\t= " + r3 + "\n";
            outputText += "random String"             + "\t= " + r4 + "\n";
            outputText += "random word"               + "\t= " + r5 + "\n";
            
            // and the arrays...  
            outputText += "\nOriginal Arrays....\n\n";
            outputText += "random int array"          + "\t= " + s1  + "\n";
            outputText += "random double array"       + "\t= " + s2  + "\n";
            outputText += "random char array"         + "\t= " + s3  + "\n";
            outputText += "random string array"       + "\t= " + s4  + "\n";
            outputText += "random words array"        + "\t= " + s5 + "\n";
            
            // and matrices
            outputText += "\nOriginal Matrices....\n\n";
            outputText += "random int matrix:"        + "\n\n" + s6 + "\n";
            outputText += "random double matrix:"     + "\n\n" + s7 + "\n";
            outputText += "random char matrix:"       + "\n\n" + s8 + "\n";
            outputText += "random string matrix:"     + "\n\n" + s9 + "\n";
            outputText += "random words matrix:"      + "\n\n" + s10 + "\n";
              
            // and lists
            outputText += "\nOriginal Lists....\n\n";
            outputText += "random int list:"        + "\t" + l1.toString()  + "\n";
            outputText += "random double list:"     + "\t" + ro3.toString() + "\n";
            outputText += "random char list:"       + "\t" + l3.toString()  + "\n";
            outputText += "random string list:"     + "\t" + p5.toString()  + "\n";
            outputText += "random words list:"      + "\t" + p6.toString()  + "\n";
            
            dialogs.output(outputText,1000,800);
        } while (dialogs.playAgain());
    }
    
}
