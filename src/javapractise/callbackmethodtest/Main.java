package javapractise.callbackmethodtest;

public class Main {
    public static void main(String[] args) {

        Button button = new Button();
        button.setListner(new Listener() {
            @Override
            public void ButtonOn() {
                System.out.println("Button On");
            }

            @Override
            public void ButtonOff() {
                System.out.println("Button off after 2 secs");
            }
        });
        button.buttonPressed();


/*Anonymous Class Example
        anonymous anonymous = new anonymous() {
            @Override
            public void test() {
                System.out.println("Anonymous class created");
            }
        };
        anonymous.test();

 */
    }
}
