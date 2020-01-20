package librarymanagementV2;

import java.util.InputMismatchException;
import java.util.ListIterator;

public class Librarian {
    BookAuthenticator bookAuthenticator = new BookAuthenticator();
    public Book takingInputForBook(){
        Book book = new Book();
        long uncheckedId = 0;
        double uncheckedPrice = 0;
        String uncheckedAuthor;
        String uncheckedContent;

        boolean hasRepeat = false;
        System.out.println("ENTER BOOK ID");
        while (!hasRepeat) {
            uncheckedId = bookAuthenticator.idValidation();
            hasRepeat = bookAuthenticator.checkForRepetition(uncheckedId);
        }
        book.setId(uncheckedId);

        System.out.println("ENTER BOOK NAME");
        book.setName(Library.scanner.next());

        System.out.println("ENTER BOOK AUTHOR");
        uncheckedAuthor=bookAuthenticator.authorRangeCheck();
        book.setAuthor(uncheckedAuthor);

        System.out.println("ENTER BOOK CONTENT");
        uncheckedContent=bookAuthenticator.contentRangeCheck();
        book.setContent(uncheckedContent);

        System.out.println("ENTER BOOK PRICE");
        uncheckedPrice = bookAuthenticator.priceValidation();
        book.setPrice(uncheckedPrice);

        return book;

    }
    public void removeBook(long id) {

        ListIterator<Book> itr = Library.getBookList().listIterator(); // ListIterator ?
        while (itr.hasNext()) {
            if (itr.next().getId() == id)
                itr.remove();
        }
        System.out.println("Showing list of books after deletion\n");
        Library.showBookList();
    }

}
