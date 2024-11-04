package LibraryPackage;

public class LibraryItem {

    protected String title; //subclass & pgk only
    protected String author; //subclass & pgk only
    protected boolean isAvailable; //subclass & pgk only

    public LibraryItem(String title, String author)
    {
        this.title = title;
        this.author = author;
        isAvailable = true;
    }

    public void checkOutBook()
    {
        if(isAvailable)
        {
            isAvailable = false;
        }
        else
        {
            System.out.println("Item is not currently available");
        }
    }

    public void returnItem()
    {
        if(!isAvailable)
        {
            isAvailable = true;
        }
        else
        {
            System.out.println("Item is already available");
        }
    }

    public String toString()
    {
        return (title + ", written by " + author);
    }

    public void displayDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if(isAvailable)
        {
            System.out.println(title + " is available");
        }
        else
        {
            System.out.println(title + " is not available");
        }
    }

}
