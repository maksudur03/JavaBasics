package librarymanagementV2;

public class LibrarianAssistant {
    BookAuthenticator bookAuthenticator = new BookAuthenticator();

    public Book takingInputForBook(){
        Book book = new Book();
        long uncheckedId = 0;
        double uncheckedPrice = 0;
        String uncheckedAuthor;
        String uncheckedContent;

        boolean hasRepetition = false;
        System.out.println("ENTER BOOK ID");
        while (!hasRepetition) {
            uncheckedId = bookAuthenticator.idValidation();
            hasRepetition = bookAuthenticator.checkForRepetition(uncheckedId);
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
}
