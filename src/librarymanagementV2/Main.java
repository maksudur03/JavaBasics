package librarymanagementV2;

import java.util.Scanner;

/**/
public class Main {
    public static String menuInput = "4";
    public static Scanner scan = new Scanner(System.in);
    public static Library lib = new Library();

    public static void main(String[] args) {

        String subMenuInput;

        while (true) { // learn more about Scanner ?
            switch (menuInput) { // difference between switch-case and if-else ? how we use && || in switch-case?
                case "1": {
                    lib.addBooktoList();
                    System.out.println("Press 1 to add another book");
                    System.out.println("Press 4 to go to menu\nPress 0 to Exit");
                    subMenuInput = scan.next();
                    if (subMenuInput.equals("1")) {
                        menuInput = "1";
                    } else {
                        showSubMenu(subMenuInput);
                    }
                    break;
                }
                case "2": {
                    System.out.println("Showing list of books\n");
                    lib.showBookList();
                    System.out.println("Press 6 to read a book\nPress 4 to go to menu\nPress 0 to Exit");
                    subMenuInput = scan.next();
                    readBook(subMenuInput);
                    break;
                }

                case "3": {
                    lib.showBookList();
                    System.out.println("Enter the ID of book you want to delete");
                    long id = scan.nextLong();
                    lib.librarian.removeBook(id);
                    System.out.println("Press 4 to go to menu\nPress 0 to Exit");
                    subMenuInput = scan.next();
                    showSubMenu(subMenuInput);
                    break;
                }
                case "0": {
                    System.out.println("GOOD BYE, SEE YOU SOON");
                    return;
                }
                case "4": {
                    showMenu();
                    menuInput = scan.next();
                    break;
                }
                default: {
                    System.out.println("Invalid Input.");
                    menuInput = "4";
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

    private static void showSubMenu(String subMenuInput) {
        switch (subMenuInput) {
            case "4": {
                menuInput = "4";
                break;
            }
            case "0": {
                menuInput = "0";
                break;
            }
            default: {
                System.out.println("Invalid Input.");
                menuInput = "4";
            }
        }
    }


    private static void readBook(String subMenuInput) {
        long checkId;
        if (subMenuInput.equals("6")) {
            System.out.println("Type the ID of the book you want to read");
            checkId = scan.nextLong();
            System.out.println(lib.selectBook(checkId));
            System.out.println("Press 4 to go to menu\nPress 0 to Exit");
            System.out.println("Press x to delete the book");
            subMenuInput = scan.next();
            switch (subMenuInput) {
                case "x":
                case "X": {
                    lib.librarian.removeBook(checkId);
                    System.out.println("Press 4 to go to menu\nPress 0 to Exit");
                    subMenuInput = scan.next();
                    showSubMenu(subMenuInput);
                    break;
                }
                default: {
                    showSubMenu(subMenuInput);
                }
            }
        } else {
            showSubMenu(subMenuInput);
        }
    }
}
