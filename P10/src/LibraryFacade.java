import java.util.ArrayList;
import java.util.List;
class LibraryFacade {
    private LibraryCatalog libraryCatalog;
    private OrderProcessor orderProcessor;

    public LibraryFacade() {
        this.libraryCatalog = new LibraryCatalog();
        this.orderProcessor = new OrderProcessor();
    }

    public void addBook(Book book) {
        libraryCatalog.addBook(book);
    }

    public List<Book> searchBooks(String keyword) {
        return libraryCatalog.searchBooks(keyword);
    }

    public boolean checkBookAvailability(Book book) {
        return libraryCatalog.checkAvailability(book);
    }

    public void processOrder(Book book) {
        if (checkBookAvailability(book)) {
            orderProcessor.processOrder(book);
        } else {
            System.out.println("The book is not available in the library.");
        }
    }
}
