package javapractise.accessmodifier;

public class Final {
    public final int finalInt;

    public Final(int finalInt) {
        this.finalInt = finalInt;
    }

    final void method1() {
        System.out.println("this is a final method"+finalInt);
    }
    int changeFinal(){
        return 20;
    }
}
