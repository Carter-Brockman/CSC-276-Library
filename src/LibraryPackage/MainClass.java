package LibraryPackage;

public class MainClass {

    public static void main(String[] args){

        Library library = new Library();

        library.addItem(new Book("Calculus Volume II", "Gilbert Strang", 737));
        library.addItem(new Journal("Accounting", "Ford Douglass", 32));
        library.addItem(new Journal("Manufacturing Processes", "Davis Keith", 83));
        library.addItem(new Book("Don Quixote", "Miguel de Cervantes", 1072));

        //All books in library at start
        System.out.println("All items in library: ");
        library.displayItems();
        System.out.println("------------------------------------------\n");

        //After checking out Calculus Volume II & Manufacturing Processes
        library.checkOutItem(0);
        library.checkOutItem(2);
        System.out.println("After Checking out: ");
        library.displayItems();
        System.out.println("------------------------------------------\n");

        //After returning manufacturing processes, still waiting on Calculus Volume II
        library.returnItem(2);
        System.out.println("After returning books");
        library.displayItems();
        System.out.println("------------------------------------------\n");

    } //End of main

} //End of MainClass
