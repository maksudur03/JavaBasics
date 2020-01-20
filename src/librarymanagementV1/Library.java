package librarymanagementV1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.ListIterator;
import java.util.Scanner;

public class Library implements Validation,RangeCheck {

    private ArrayList<Book> list = new ArrayList<Book>();
    Scanner scanner = new Scanner(System.in);


    public void addBook(){
        Book book = new Book();
        long uncheckedId = 0;
        double uncheckedPrice = 0;
        String uncheckedAuthor;
        String uncheckedContent;

        boolean hasRepeat = false;
        System.out.println("ENTER BOOK ID");
        while (!hasRepeat) {
            uncheckedId = idValidation();
            hasRepeat = checkForRepetition(uncheckedId);
        }
        book.setId(uncheckedId);

        System.out.println("ENTER BOOK NAME");
        book.setName(scanner.next());

        System.out.println("ENTER BOOK AUTHOR");
        uncheckedAuthor=authorRangeCheck();
        book.setAuthor(uncheckedAuthor);

        System.out.println("ENTER BOOK CONTENT");
        uncheckedContent=contentRangeCheck();
        book.setContent(uncheckedContent);

        System.out.println("ENTER BOOK PRICE");
        uncheckedPrice = priceValidation();
        book.setPrice(uncheckedPrice);

        list.add(book);

        System.out.println(book.showBook(book.getId()) + "\n");
    }

    public void showBookList() {
        for (Book book : list) { // for-each, for-loop. while-loop ? less priority
            System.out.println("ID:" + book.getId() + " NAME:" + book.getName() + " Author:" + book.getAuthor() + '\n');
        }
        System.out.println();
    }

    public void removeBook(long id) {

        ListIterator<Book> itr = list.listIterator(); // ListIterator ?
        while (itr.hasNext()) {
            if (itr.next().getId() == id)
                itr.remove();
        }
        System.out.println("Showing list of books after deletion\n");
        showBookList();
    }

    public String selectBook(long id) {
        for (Book book : list) {
            if (id == book.getId()) {
                return book.showBook(book.getId());
            }
        }
        return "Not found";
    }

    public boolean checkForRepetition(long id) {
        for (Book book : list) {
            if (id == book.getId()) {
                System.out.println("This ID already exists.Give another ID");
                return false;
            }
        }
        return true;
    }

    public long idValidation() {
        long input = 0;
        while (input == 0) {
            try {
                input = scanner.nextLong();
            } catch (InputMismatchException exception) {
                System.out.println("Invalid input. Try again");
            }
            scanner.nextLine();
        }
        return input;
    }

    public double priceValidation() {
        double input = 0;
        while (input == 0) {
            try {
                input = scanner.nextDouble();
            } catch (InputMismatchException exception) {
                System.out.println("Invalid input. Try again");
            }
            scanner.nextLine();
        }
        return input;
    }

    public String contentRangeCheck() {
        String content;
        while (true) {
            content = scanner.next();
            if (content.length() >= 10 && content.length() <= 256) {
                break;
            } else if (content.length() < 10) {
                System.out.println("Book content is too small.Try Again");
            } else if (content.length() > 256) {
                System.out.println("Book content is too large.Try Again");
            }
        }
        return content;
    }

    public String authorRangeCheck() {
        String author;
        while (true) {
            author = scanner.next();
            if (author.length() >= 5 && author.length() <= 20) {
                break;
            } else if (author.length() < 5) {
                System.out.println("Author name is too small.Try Again");

            } else if (author.length() > 20) {
                System.out.println("Author name is too large.Try Again");
            }
        }
        return author;
    }

}
