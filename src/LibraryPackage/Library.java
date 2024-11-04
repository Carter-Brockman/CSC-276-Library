package LibraryPackage;

import java.util.ArrayList;

public class Library{

    private ArrayList<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item)
    {
        items.add(item);
    }

    public void displayItems()
    {
        for(LibraryItem item: items)
        {
            System.out.println("------------------------------------------");
            item.displayDetails();
        }
    }

    public void checkOutItem(int index)
    {
        items.get(index).checkOutBook();
    }

    public void returnItem(int index)
    {
        items.get(index).returnItem();
    }

}
