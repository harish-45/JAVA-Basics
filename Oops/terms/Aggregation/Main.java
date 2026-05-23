package Oops.terms.Aggregation;

public class Main {
    public static void main(String[] args) {

       // create some books
        Book book1 = new Book("The Great Gatsby", 180);
        Book book2 = new Book("To Kill a Mockingbird", 281);
        Book book3 = new Book("1984", 328);

        // create an array of books
        Book[] books = {book1, book2, book3};

        // create a library and pass the array of books
        Library library = new Library("City Library", 1950, books);

        // display library information
        library.LibraryInfo();

        // concept of aggregation: the library has books, but the books can exist independently of the library
        // if i delete the library, the books still exist
    }
}
