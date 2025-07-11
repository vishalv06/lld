package solid.srp.book;

public class BookPersistence {

    public void saveToDatabase(Book book) {
        System.out.println("Saving Title to database" + book.getTitle());
        System.out.println("Saving Author to database" + book.getAuthor());
    }
}
