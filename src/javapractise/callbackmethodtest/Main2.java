package javapractise.callbackmethodtest;

//this main class will implement the interface
public class Main2 implements  Listener{
    public static void main(String[] args) {
        Main2 main2= new Main2();
        Button button = new Button();
        button.setListner(main2);
        button.buttonPressed();
    }

    @Override
    public void ButtonOn() {
        System.out.println("Button on");
    }

    @Override
    public void ButtonOff() {
        System.out.println("BUTTON OFF AFTER 2 SECS");
    }
}
