class Book {
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Display book details
    void displayDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : $" + price);
    }
}

public class BookReferenceDemo {
    public static void main(String[] args) {
        // Create first Book object
        Book book1 = new Book("Java Basics", "Alice", 250.0);

        // Create second Book object
        Book book2 = new Book("Python Basics", "Bob", 300.0);

        // Display initial details
        System.out.println("Before assigning reference:");
        System.out.println("Book 1:");
        book1.displayDetails();
        System.out.println("Book 2:");
        book2.displayDetails();

        // Assign book1 reference to book2
        book2 = book1;

        // Change details using book2
        book2.title = "Advanced Java";
        book2.price = 400.0;

        // Display details after changes
        System.out.println("\nAfter assigning reference and modifying book2:");
        System.out.println("Book 1:");
        book1.displayDetails();
        System.out.println("Book 2:");
        book2.displayDetails();
    }
}
