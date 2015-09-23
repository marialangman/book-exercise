/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * edited by Maria Langman
 * @September 21, 2015
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;  //number of pages in the book
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numPages;
        refNumber = "";
    }
    //Mutator to set refNumber
    public void setRefNumber(String ref)
    {
        if (ref.length()<3)
            System.out.println("Error:  Reference number must be 3 characters minimum; cannot change Reference Number.");
        else    
            refNumber = ref;
    }
    // Return author
    public String getAuthor()
    {
        return author;
    }
    // Return title
    public String getTitle()
    {
        return title;
    }
    // Return number of pages in the book
    public int getPages()
    {
        return pages;
    }
    // Return the refNumber
    public String getRefNumber()
    {
        return refNumber;
    }
    //Print Author to terminal window
    public void printAuthor()
    {
        System.out.println("Author: " + author);
    }
    //Print Title to terminal window
    public void printTitle()
    {
        System.out.println("Title: " + title);
    }
    //Print the details - title, author, pages - of the book to terminal window
    public void printDetails()
    {
        if (refNumber.length()==0)
            refNumber = "ZZZ";
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nNumber of pages: " + pages + "\nReference No.: " + refNumber );
    }

}
