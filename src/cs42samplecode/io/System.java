
/** required package class namespace */
package cs42samplecode.io;

/**
 * System.java - this class simulates the java.lang class that does the 
 * standard outputs and redirects those outputs to a custom simulator
 *
 * @author Mr. Wachs 
 * @since 8-Mar-2019 
 */
public class System 
{
    
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
            Simulator.output(object,true);
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
            Simulator.output(object,true);
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
                
    }      
    
    /**
     * Exits the application
     * 
     * @param status the exit status
     */
    public static void exit(int status) {
        Simulator.exit(status);
    }
    
}
