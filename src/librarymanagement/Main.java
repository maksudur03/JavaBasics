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
                    System.out.println("Press 4 to go to menu\nPress 0 to Exit");
                    input = sc.next();
                    break;
                }
                case "3": {
                    System.out.println("Enter the ID of book you want to delete");
                    long id = sc.nextLong();
                    lib.removeBook(id);
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
                    System.out.println("Invalid Input.");
                    input="4";
                }
            }
        }
    }

    private static void showMenu() {
        // use StringBuilder -> read, ask question, understand then implement ?
        StringBuilder screen = new StringBuilder("Welcome to Library\n")
                .append("1.ADD BOOK\n")
                .append("2.SEE BOOK LIST\n")
                .append("3.REMOVE BOOK\n")
                .append("4.MENU\n0.EXIT\nPress the adjacent number");
        System.out.println(screen);
    }
}


