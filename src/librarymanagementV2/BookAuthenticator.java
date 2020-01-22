package librarymanagementV2;

import java.util.InputMismatchException;
import java.util.ListIterator;

public class BookAuthenticator implements RangeCheck,Validation{

    public String contentRangeCheck() {
        String content;
        while (true) {
            content = Library.scanner.next();
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
            author = Library.scanner.next();
            if (author.length() >= 5 && author.length() <= 20) {
                break;
            } else {
                if (author.length() < 5) {
                    System.out.println("Author name is too small.Try Again");

                }
                if (author.length() > 20) {
                    System.out.println("Author name is too large.Try Again");
                }
            }
        }
        return author;
    }
    public boolean checkForRepetition(long id) {
        for (Book book :Library.getBookList() ) {
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
                input = Library.scanner.nextLong();
            } catch (InputMismatchException exception) {
                System.out.println("Invalid input. Try again");
            }
            Library.scanner.nextLine();
        }
        return input;
    }

    public double priceValidation() {
        double input = 0;
        while (input == 0) {
            try {
                input = Library.scanner.nextDouble();
            } catch (InputMismatchException exception) {
                System.out.println("Invalid input. Try again");
            }
            Library.scanner.nextLine();
        }
        return input;
    }


}
