package javapractise.callbackmethodtest;

public class Button {

    private Listener listener;

    public void setListner(Listener listener) {
        this.listener = listener;
    }

    public void buttonPressed(){
        System.out.println("Button Pressed");
        try {
            Thread.sleep(2000);
            listener.ButtonOn();
            Thread.sleep(2000);
            listener.ButtonOff();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
