package javapractise.abstraction;

public class Bike implements Vehicle {
    @Override
    public void move(int speed) {

    }

    @Override
    public void brake(boolean state) {
        System.out.println("brake applied"+state);
    }

    @Override
    public void gearUp() {

    }

    public static void main(String[] args) {
        System.out.println(new Vehicle() {
            @Override
            public void move(int speed) {
                System.out.println("moving at speed"+ref);
            }

            @Override
            public void brake(boolean state) {

            }

            @Override
            public void gearUp() {

            }
        });
    }
}
