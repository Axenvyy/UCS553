import library.model.*;

public class Main {

    public static void main(String[] args) {

        LibraryResource.setLibraryName("Central University Library");

        LibraryResource[] resources = new LibraryResource[5];
                        
        resources[0] = new Book(1, "Java", "James Gosling");
        resources[1] = new DigitalResource(2, "OS pdf", "Silverschatz");
        resources[2] = new Book(3, "Data Structures", "narasimha");
        resources[3] = new DigitalResource(4, "CN", "jj");
        resources[4] = new Book(5, "Algorithms", "Cormen");

        int[] overdueDays = {5, 10, 0, 7, 3};

        double totalFine = 0;

        System.out.println("Library: " + LibraryResource.getLibraryName());

        for (int i = 0; i < resources.length; i++) { // Polymorphism
                ((Printable) resources[i]).printDetails();

                double fine = resources[i].calculateFine(overdueDays[i]);

                System.out.println("Overdue Days: " + overdueDays[i]);
                System.out.println("Fine: Rs. " + fine);

                totalFine += fine;
        }
        System.out.println("Totalfine is "+fine);
    }
}