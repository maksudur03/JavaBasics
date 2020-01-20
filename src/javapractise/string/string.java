package javapractise.string;

public class string {
    public static void main(String[] args) {
        String str; //=new String("HEELLOOOO");
        str="bye";
        str="not bye";
        StringBuilder welcome = new StringBuilder("Welcome to Library\n");
        StringBuilder bookAdd = new StringBuilder("1.ADD BOOK\n");
        StringBuilder bookList = new StringBuilder("2.SEE BOOK LIST\n");
        StringBuilder removeBook = new StringBuilder("3.REMOVE BOOK\n");
//        StringBuilder menu = new StringBuilder("4.MENU\nPress the adjacent number");
       // welcome.append(bookAdd);
        //removeBook.append(menu);
        //bookList.append(removeBook);
        //welcome.append("4.MENU\nPress the adjacent number");
        System.out.println(str);
    }
}
