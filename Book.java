/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @Maria Langman
 * @September 21, 2015
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private String publisher;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, String bookPublisher)
    {
        author = bookAuthor;
        title = bookTitle;
        publisher = bookPublisher;

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

    public String getPublisher()
    {
        return publisher;
    }
    public void printBook()
    {
        System.out.println("Author: " + author + ", " + "Title: " + title +"\nPublisher: " + publisher);
    }

    public void printDetails()
    {
		System.out.println("Author: "+ author);
		System.out.println("Title: "+ title);
		System.out.println("Publisher: "+ publisher);
	}
}
