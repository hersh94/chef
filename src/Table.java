/**
 *
 * 
 * @author 
 * @version 
 */
public class Table extends Thread
{
    private String contents = null; // contents
    private boolean empty = true; // empty?
    
    /**
     * Puts two objects in the box.  This method returns when
     * the objects has been put on to the table.
     * 
     * @param item The object to be put in the box.
     */
    public synchronized void put(String item) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                return;
            }
        }
        contents = item;
        empty = false;
        notifyAll();
    }
    
    /**
     * Gets an object from the box.  This method returns once the
     * object has been removed from the box.
     * 
     * @return The object taken from the box.
     */
    public synchronized String get() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                return null;
            }
        }
        String items = contents;
        contents = null;
        empty = true;
        notifyAll();
        return items;
    }

}