package javapractise.abstraction;

public interface Vehicle {
    /*public static final*/int ref = 0;

    // abstract
    default void move(int speed) {
        System.out.println("moving at speed"+ref);
    }
    //methods can have a body in interface

//public abstract
    void brake(boolean state);
    void gearUp();
}
