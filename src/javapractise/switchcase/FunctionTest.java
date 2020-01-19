package javapractise.switchcase;

import java.util.Scanner;

public class FunctionTest {
    public FunctionTest() {
    }
    public void switchCase(){
        Scanner scanner= new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        switch (choice) {
            case 'i': {
                System.out.println("Ice cream");
                return;
                //return "ice cream";
            }
            case 'D':
            case 'd': {
                System.out.println("Drinks");
                return;
                //return " Drinks" ;
            }
            case 'F':
            case 'f': {
                System.out.println("Food");
                return;
                //return "Food";
            }
            default: {
                System.out.println("Wrong button");
                return;
                //return "Wrong Button";
            }
        }
    }
}
