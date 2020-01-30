package javapractise.accessmodifier;

public class extender extends Final {

    public extender(int finalInt) {
        super(finalInt);
    }
    public static void main(String[] args) {
        Final fin = new Final(25);
        fin.method1();
       // fin.changeFinal(fin.finalInt);
        System.out.println(fin.finalInt);
    }
}
