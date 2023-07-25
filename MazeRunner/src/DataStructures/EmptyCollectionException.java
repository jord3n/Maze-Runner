package DataStructures;

/**
 * An Empty Collection Exception class.
 * Prints out what type of collection is empty
 * for use in ITCS 2214 Data Structures and Algorithms
 * UNC Charlotte, 2016
 * @author clatulip
 */
public class EmptyCollectionException extends Exception {
    
    /**
     *   
     * an exception for when the stack is empty
     * @param collection
     */
    public EmptyCollectionException(String collection) {
        super("The " + collection + " is empty.");
    }
    
}
