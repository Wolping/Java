import java.util.ArrayList;
import java.util.List;
public class FacadePatternLibraryExample {
    public static void main(String[] args) {
        LibraryFacade libraryFacade = new LibraryFacade();

        Book book1 = new Book("Design Patterns", "Erich Gamma");
        Book book2 = new Book("Clean Code", "Robert C. Martin");

        libraryFacade.addBook(book1);
        libraryFacade.addBook(book2);

        List<Book> searchResult = libraryFacade.searchBooks("Design");
        System.out.println("Search result:");
        for (Book book : searchResult) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }

        Book selectedBook = new Book("Design Patterns", "Erich Gamma");
        if (libraryFacade.checkBookAvailability(selectedBook)) {
            libraryFacade.processOrder(selectedBook);
        } else {
            System.out.println("The selected book is not available in the library.");
        }
    }
}