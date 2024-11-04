package LibraryPackage;

public class Book extends LibraryItem{

    private int pages;

    public Book(String title, String author, int pages)
    {
        super(title,author);
        this.pages = pages;
    }
    @Override
    public String toString()
    {
        return (title + ", written by " + author + ", consisting of " + pages + " pages");
    }

    @Override
    public void displayDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Book");
        System.out.println("Pages: " + pages);
        if(isAvailable)
        {
            System.out.println(title + " is available");
        }
        else
        {
            System.out.println(title + " is not available");
        }
    }

}//End of LibraryItem