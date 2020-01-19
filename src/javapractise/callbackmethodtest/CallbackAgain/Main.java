package javapractise.callbackmethodtest.CallbackAgain;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        IO IO = new IO();
        IO.setCalcu(new Calcu() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }

            @Override
            public int subtraction(int a, int b) {
                return a-b;
            }

            @Override
            public int multiplication(int a, int b) {
                return a*b;
            }

            @Override
            public int divide(int a, int b) {
                return a/b;
            }
        });
        IO.takeInput();
    }
}

