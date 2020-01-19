package office;

public class Button {

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    void click() {
        System.out.println("Doing something");
        try {
            Thread.sleep(4000);
            clickListener.onClick();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
