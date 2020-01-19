package javapractise.callbackmethodtest.CallbackAgain;

import java.util.Scanner;

public class IO {
    Scanner scan= new Scanner(System.in);
    private Calcu calcu;
    public void setCalcu(Calcu calcu){
        this.calcu=calcu;
    }
    public void takeInput() throws InterruptedException {
        System.out.println("Type value of A");
        int a = scan.nextInt();
        System.out.println("Type value of B");
        int b = scan.nextInt();
        Thread.sleep(2000);
        System.out.println("Sum: "+calcu.sum(a,b));
        Thread.sleep(2000);
        System.out.println("Subtraction: "+calcu.subtraction(a,b));
        Thread.sleep(2000);
        System.out.println("Multiplication: "+calcu.multiplication(a,b));
        Thread.sleep(2000);
        System.out.println("Division:"+calcu.divide(a,b));
    }
}
