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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
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
}
