package Oops.terms.Aggregation;

public class Library {

    String name;
    int year;
    Book[] books;

    public Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    public void LibraryInfo() {
        System.out.println("In " + this.year + " established '" + this.name + "'");
        System.out.println("Books Available : ");
        for (Book book : books) {
            System.out.println(book.bookInfo());
        }
    }
}