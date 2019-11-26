
/** required package class namespace */
package cs42samplecode.io;

/**
 * System.java - this class simulates the java.lang class that does the 
 * standard outputs and redirects those outputs to a custom output style 
 * (either System.out, to a custom user interface, a permanent file, or all
 * of these)
 *
 * @author Mr. Wachs 
 * @since 8-Mar-2019 
 */
public class System 
{

    private final static String[] FONTS = {
        "Consolas",
        "Trebuchet MS",
        "Tahoma",
        "Bookman Old Style",
    };
    
    public static final String RESET                    = "\033[0m";  
    public static final String BLACK                    = "\033[0;30m";   
    public static final String RED                      = "\033[0;31m";   
    public static final String GREEN                    = "\033[0;32m";  
    public static final String YELLOW                   = "\033[0;33m";  
    public static final String BLUE                     = "\033[0;34m";   
    public static final String PURPLE                   = "\033[0;35m";  
    public static final String CYAN                     = "\033[0;36m";  
    public static final String WHITE                    = "\033[0;37m";  
    public static final String BLACK_BOLD               = "\033[1;30m";  
    public static final String RED_BOLD                 = "\033[1;31m";   
    public static final String GREEN_BOLD               = "\033[1;32m"; 
    public static final String YELLOW_BOLD              = "\033[1;33m"; 
    public static final String BLUE_BOLD                = "\033[1;34m";  
    public static final String PURPLE_BOLD              = "\033[1;35m"; 
    public static final String CYAN_BOLD                = "\033[1;36m";  
    public static final String WHITE_BOLD               = "\033[1;37m"; 
    public static final String BLACK_UNDERLINED         = "\033[4;30m"; 
    public static final String RED_UNDERLINED           = "\033[4;31m";  
    public static final String GREEN_UNDERLINED         = "\033[4;32m"; 
    public static final String YELLOW_UNDERLINED        = "\033[4;33m"; 
    public static final String BLUE_UNDERLINED          = "\033[4;34m";  
    public static final String PURPLE_UNDERLINED        = "\033[4;35m";
    public static final String CYAN_UNDERLINED          = "\033[4;36m";  
    public static final String WHITE_UNDERLINED         = "\033[4;37m"; 
    public static final String BLACK_BACKGROUND         = "\033[40m";  
    public static final String RED_BACKGROUND           = "\033[41m";  
    public static final String GREEN_BACKGROUND         = "\033[42m"; 
    public static final String YELLOW_BACKGROUND        = "\033[43m"; 
    public static final String BLUE_BACKGROUND          = "\033[44m";   
    public static final String PURPLE_BACKGROUND        = "\033[45m"; 
    public static final String CYAN_BACKGROUND          = "\033[46m";   
    public static final String WHITE_BACKGROUND         = "\033[47m";  
    public static final String BLACK_BRIGHT             = "\033[0;90m";  
    public static final String RED_BRIGHT               = "\033[0;91m"; 
    public static final String GREEN_BRIGHT             = "\033[0;92m";  
    public static final String YELLOW_BRIGHT            = "\033[0;93m"; 
    public static final String BLUE_BRIGHT              = "\033[0;94m";  
    public static final String PURPLE_BRIGHT            = "\033[0;95m"; 
    public static final String CYAN_BRIGHT              = "\033[0;96m";  
    public static final String WHITE_BRIGHT             = "\033[0;97m";  
    public static final String BLACK_BOLD_BRIGHT        = "\033[1;90m"; 
    public static final String RED_BOLD_BRIGHT          = "\033[1;91m";  
    public static final String GREEN_BOLD_BRIGHT        = "\033[1;92m"; 
    public static final String YELLOW_BOLD_BRIGHT       = "\033[1;93m";
    public static final String BLUE_BOLD_BRIGHT         = "\033[1;94m"; 
    public static final String PURPLE_BOLD_BRIGHT       = "\033[1;95m";
    public static final String CYAN_BOLD_BRIGHT         = "\033[1;96m";  
    public static final String WHITE_BOLD_BRIGHT        = "\033[1;97m"; 
    public static final String BLACK_BACKGROUND_BRIGHT  = "\033[0;100m";
    public static final String RED_BACKGROUND_BRIGHT    = "\033[0;101m";
    public static final String GREEN_BACKGROUND_BRIGHT  = "\033[0;102m";
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";
    public static final String BLUE_BACKGROUND_BRIGHT   = "\033[0;104m";
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; 
    public static final String CYAN_BACKGROUND_BRIGHT   = "\033[0;106m";  
    public static final String WHITE_BACKGROUND_BRIGHT  = "\033[0;107m";  
    
    /**
     * Internal class to properly simulate the java.lang.System.out class
     */
    public static class out 
    {
        
        /**
         * Simulates the 'Printing' of an object
         * 
         * @param object The Object type to be 'printed'
         */
        public static void println(Object object) {
            output(object,true);
        }
       
        /**
         * Simulates the 'Printing' of an object
         * 
         * @param object The Object type to be 'printed'
         */
        public static void println(boolean object) {
            println(new Boolean(object));
        }
        
        /**
         * Simulates the 'Printing' of an object
         * 
         * @param object The Object type to be 'printed'
         */
        public static void println(int object) {
            println(new Integer(object));
        }
        
        /**
         * Simulates the 'Printing' of an object
         * 
         * @param object The Object type to be 'printed'
         */
        public static void println(long object) {
            println(new Long(object));
        }
        
        /**
         * Simulates the 'Printing' of an object
         * 
         * @param object The Object type to be 'printed'
         */
        public static void println(float object) {
            println(new Float(object));
        }
        
        /**
         * Simulates the 'Printing' of an object
         * 
         * @param object The Object type to be 'printed'
         */
        public static void println(double object) {
            println(new Double(object));
        }
        
        /**
         * Simulates the 'Printing' of an object
         * 
         * @param object The Object type to be 'printed'
         */
        public static void print(Object object) {
            output(object,true);
        }
        
        /**
         * Simulates the 'Printing' of an object
         * 
         * @param object The Object type to be 'printed'
         */
        public static void print(boolean object) {
            print(new Boolean(object));
        }
        
        /**
         * Simulates the 'Printing' of an object
         * 
         * @param object The Object type to be 'printed'
         */
        public static void print(int object) {
            print(new Integer(object));
        }
        
        /**
         * Simulates the 'Printing' of an object
         * 
         * @param object The Object type to be 'printed'
         */
        public static void print(long object) {
            print(new Long(object));
        }
        
        /**
         * Simulates the 'Printing' of an object
         * 
         * @param object The Object type to be 'printed'
         */
        public static void print(float object) {
            print(new Float(object));
        }
        
        /**
         * Simulates the 'Printing' of an object
         * 
         * @param object The Object type to be 'printed'
         */
        public static void print(double object) {
            print(new Double(object));
        }
        
        /**
         * Simulates the 'Printing' of an object but uses a header style of 
         * formatting
         * 
         * @param object The Object type to be 'printed'
         */
        public static void header(Object object) {   
            if (object == null) return;
            String text = object.toString() + line(); 
            simpleOutput("\n");
            simpleColorOutput(text, "", BLUE, RESET);
            simpleOutput("\n");
        }
        
        /**
         * Simulates the 'Printing' of an object but uses a comment style of 
         * formatting
         * 
         * @param object The Object type to be 'printed'
         */
        public static void comment(Object object) {  
            if (object == null) object = new String("null"); 
            String text = "// " + object.toString();
            simpleColorOutput(text, "", YELLOW, RESET);
        }
        
        /**
         * Simulates a 'dialog' by 'printing' an object but uses a marker in 
         * the output to indicate the dialog is being simulated
         * 
         * @param object The Object type to be 'printed'
         */
        public static void dialog(Object object) {
            if (object == null) object = new String("null");
            String message = "~~~SIMULATED DIALOG: ";  
            String text    = object.toString();
            simpleColorOutput(message, text, GREEN, RESET);          
        }
        
        /**
         * Adds this object to the dynamic list of outputs with or 
         * without a new line
         * 
         * @param object the object (as a string) to add to output
         * @param newLine adds a new line (true) or not (false)
         */
        private static void output(Object object, boolean newLine) {
            if (object == null) object = new String("null");
            if (newLine) simpleOutput(object.toString() + "\n");
            else         simpleOutput(object.toString()); 
        }
        
        /**
         * Does a simple output with the passed message combined with other
         * textual data
         * 
         * @param message the message to output
         * @param font the font to use
         * @param color the starting color
         * @param reset the color reset
         */
        private static void simpleColorOutput(String message, String font, 
                String color, String reset) {
            simpleOutput("");
            simpleOutput(color + message + reset);
            simpleOutput(font);
            simpleOutput("\n");
        }
        
        /**
         * Does a simple output with the passed message
         * 
         * @param message the message to output 
         */
        private static void simpleOutput(String message) {
            java.lang.System.out.print(message);
        }
        
        /**
         * Creates a line of 50 '.' dots to add to an output
         * 
         * @return a text line of 50 dots
         */
        private static String line() {
            String text = ".";
            for (int i = 0; i < 50; i++) text += ".";
            return text;
        }
        
    }      
    
    /**
     * Exits the application
     * 
     * @param status the exit status
     */
    public static void exit(int status) {
        java.lang.System.exit(status);
    }
    
}