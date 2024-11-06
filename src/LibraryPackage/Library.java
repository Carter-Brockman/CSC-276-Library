package LibraryPackage;

import java.util.ArrayList;

public class Library{

    private ArrayList<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) //Adds LibraryItem object (item) to the items ArrayList
    {
        items.add(item);
    }

    public void displayItems() //Displays all items and their info via displayDetails()
    {
        for(LibraryItem item: items)
        {
            System.out.println("------------------------------------------");
            item.displayDetails();
        }
    }

    public void checkOutItem(int index) //Checks out an item in the ArrayList (based on the index of the list)
    {
        items.get(index).checkOutBook();
    }

    public void returnItem(int index) //Marks item in ArrayList as available (based on the index of the list)
    {
        items.get(index).returnItem();
    }

} //End of Library
