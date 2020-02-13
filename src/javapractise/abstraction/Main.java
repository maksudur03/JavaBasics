package javapractise.abstraction;

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.play();
        c.die();
        Vehicle vehicle = new Vehicle() {
            @Override
            public void brake(boolean state) {
                System.out.println("break applied");
            }

            public void gearUp() {
                System.out.println("gear increased");
            }
        };
        vehicle.brake(true);
    }
}
