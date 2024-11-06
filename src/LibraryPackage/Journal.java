package LibraryPackage;

public class Journal extends LibraryItem{

    private int issueNumber; //This class only

    public Journal(String title, String author, int issueNumber)
    {
        super(title,author);
        this.issueNumber = issueNumber;
    }
    @Override //Shows additional information (issueNumber)
    public String toString()
    {
        return (title + ", written by " + author + ", issue number " + issueNumber);
    }

    @Override //overridden to display info specifically for journals
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

} //End of Journal
