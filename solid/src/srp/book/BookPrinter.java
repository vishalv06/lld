package srp.book;

public class BookPrinter {

    public void printBook(Book book) {
        System.out.println("Printing srp.book.Book Title" + book.getTitle());
        System.out.println("Printing srp.book.Book Author" + book.getAuthor());
    }
}
