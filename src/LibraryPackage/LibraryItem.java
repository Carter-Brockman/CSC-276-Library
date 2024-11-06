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

    //Marks item as unavailable or tell user its already checked out
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

    //Marks item as available or tells user item is already available
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

    public String toString() //Default output to be later overridden
    {
        return (title + ", written by " + author);
    }

    public void displayDetails() //Default output to be later overridden
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

} //End of LibraryItem
