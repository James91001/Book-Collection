
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String author;
    private int quantity;
    private String image;   // add later
    
    /**
     * constructor to make the book object
     */
    public Book(int id, String nm, String auth, int qty)
    {
        this.id = id;
        this.name = nm;
        this.author = auth;
        this.quantity = qty;
    }
    
    /**
     *  Getter for ID
     */
    public int getID() {
        return this.id;
    }
    
    /**
     *  Getter for Name
     */
    public String getName() {
        return this.name;
    }
    
    /**
     *  Getter for Author
     */
    public String getAuthor() {
        return this.author;
    }
    
    /**
     *  Getter for Quantity
     */
    public int getQuantity() {
        return this.quantity;
    }
    
}
