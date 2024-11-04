package LibraryPackage;

public class Journal extends LibraryItem{

    private int issueNumber;

    public Journal(String title, String author, int issueNumber)
    {
        super(title,author);
        this.issueNumber = issueNumber;
    }
    @Override
    public String toString()
    {
        return (title + ", written by " + author + ", issue number " + issueNumber);
    }

    @Override
    public void displayDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Journal");
        System.out.println("Issue number: " + issueNumber);
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
