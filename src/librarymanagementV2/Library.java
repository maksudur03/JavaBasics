package librarymanagementV2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.ListIterator;
import java.util.Scanner;

public class Library  {

    private static ArrayList<Book> bookList = new ArrayList<Book>();
    public static Scanner scanner = new Scanner(System.in);
    public Librarian librarian= new Librarian();
    public static ArrayList<Book> getBookList() {
        return bookList;
    }

    public void addBooktoList(){
        Book bookToBeAdded= new Book();
        bookToBeAdded=librarian.takingInputForBook();
        getBookList().add(bookToBeAdded);

        System.out.println(bookToBeAdded.showBook(bookToBeAdded.getId()) + "\n");
    }



    public static void showBookList() {
        for (Book book : bookList) { // for-each, for-loop. while-loop ? less priority
            System.out.println("ID:" + book.getId() + " NAME:" + book.getName() + " Author:" + book.getAuthor() + '\n');
        }
    }

    public String selectBook(long id) {
        for (Book book : bookList) {
            if (id == book.getId()) {
                return book.showBook(book.getId());
            }
        }
        return "Not found";
    }



}
