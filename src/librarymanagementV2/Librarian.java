package librarymanagementV2;

import java.util.InputMismatchException;
import java.util.ListIterator;

import static librarymanagementV2.Library.getBookList;

public class Librarian {
    LibrarianAssistant librarianAssistant = new LibrarianAssistant();

    public void addBooktoList(){
        Book bookToBeAdded;
        bookToBeAdded=librarianAssistant.takingInputForBook();
        getBookList().add(bookToBeAdded);

        System.out.println(bookToBeAdded.showBook(bookToBeAdded.getId()) + "\n");
    }

    public void removeBook(long id) {

        ListIterator<Book> itr = getBookList().listIterator(); // ListIterator ?
        while (itr.hasNext()) {
            if (itr.next().getId() == id)
                itr.remove();
        }
        System.out.println("Showing list of books after deletion\n");
        Library.showBookList();
    }

}
