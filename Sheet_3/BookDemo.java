// Define the Book class
class Book {
    String title;
    String author;
    double price;

    // Constructor to initialize Book object
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Book Title : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Price      : $" + price);
    }
}

public class BookDemo {
    public static void main(String[] args) {
        // Create a Book object
        Book myBook = new Book("The Alchemist", "Paulo Coelho", 350.50);

        // Display book details
        myBook.displayDetails();
    }
}
