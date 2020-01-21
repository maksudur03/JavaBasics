package librarymanagementV2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.ListIterator;
import java.util.Scanner;

public class Library  {

    private static ArrayList<Book> bookList = new ArrayList<Book>();
    public static Scanner scanner = new Scanner(System.in);
    public Librarian librarian= new Librarian();

    static ArrayList<Book> getBookList() {
        return bookList;
    }

    public static void showBookList() {
        for (Book book : bookList) { // for-each, for-loop. while-loop ? less priority
            System.out.println(showBookSummary(book));
        }
    }

    public String showBookDetails(long id) {
        for (Book book : bookList) {
            if (id == book.getId()) {
                return book.showBook(book.getId());
            }
        }
        return "Not found";
    }
    
    public  static String showBookSummary(Book book){
        return "ID:" + book.getId() + " NAME:" + book.getName() + " Author:" + book.getAuthor() + '\n';
    }



}
