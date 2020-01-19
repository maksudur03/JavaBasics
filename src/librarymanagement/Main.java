package librarymanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        String input="4";
        long checkId;

        while (true) {

            Scanner sc = new Scanner(System.in); // learn more about Scanner ?
            switch (input) { // difference between switch-case and if-else ? how we use && || in switch-case?
                case "1": {
                    lib.addBook();
                    System.out.println("Press 1 to add another book");
                    System.out.println("Press 4 to go to menu\nPress 0 to Exit");
                    input= sc.next();
                    break;
                }
                case "2": {
                    System.out.println("Showing list of books");
                    lib.showBookList();
                    System.out.println("Type the ID of the book you want to read");
                    checkId = sc.nextLong();
                    System.out.println(lib.selectBook(checkId));
                    System.out.println("Press x to delete the book");
                    if (sc.next().charAt(0) == 'x') {
                        lib.removeBook(checkId);
                    }
                    System.out.println("Showing list of books after deletion\n");
                    lib.showBookList();
                    System.out.println("Press 4 to go to menu\nPress 0 to Exit");
                    input = sc.next();
                    break;
                }
                case "3": {
                    System.out.println("Enter the ID of book you want to delete");
                    long id = sc.nextLong();
                    lib.removeBook(id);
                    System.out.println("Showing list of books after deletion\n");
                    lib.showBookList();
                    System.out.println("Press 4 to go to menu\nPress 0 to Exit");
                    input = sc.next();
                    break;
                }
                case "0": {
                    System.out.println("GOOD BYE, SEE YOU SOON");
                    return;
                }
                case "4": {
                    showMenu();
                    input = sc.next();
                    break;
                }
                default: {
                    System.out.println("Invalid Input\nTry Again");
                    input = sc.next();
                }
            }
        }
    }

    private static void showMenu() {

        // use StringBuilder -> read, ask question, understand then implement ?

        StringBuilder screen = new StringBuilder(50);
        StringBuilder welcome = new StringBuilder("Welcome to Library\n");
        StringBuilder bookAdd = new StringBuilder("1.ADD BOOK\n");
        StringBuilder bookList = new StringBuilder("2.SEE BOOK LIST\n");
        StringBuilder removeBook = new StringBuilder("3.REMOVE BOOK\n");
        StringBuilder option = new StringBuilder("4.MENU\nPress the adjacent number");
        screen.append(welcome);
        screen.append(bookAdd);
        screen.append(bookList);
        screen.append(removeBook);
        screen.append(option);
        System.out.println(screen);


        /*
        System.out.println("Welcome to Library\n" +
                "1.ADD BOOK\n" +
                "2.SEE BOOK LIST\n" +
                "3.REMOVE BOOK\n" +
                "4.MENU\n" +
                "Press the adjacent number");

         */
    }
}


