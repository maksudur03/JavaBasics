package javapractise.scannertest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        /*
        String str="helloo gdj whfkl hsl jdla ";
        str+=1212223213;
        Scanner scan = new Scanner(str);
        System.out.println(str);
        while (scan.hasNext()) {
            System.out.println(scan.next());
            if(scan.hasNextLong()){
               System.out.println("Found long "+ scan.nextLong());
            }
        }
         */
        long number=0;
        Scanner scan= new Scanner(System.in);
        while (number==0) {
            try {
                number = scan.nextLong();
            } catch (InputMismatchException e) {
                System.out.println("invalid input");
            }
            scan.nextLine();
        }
        System.out.println(number);
    }
}
