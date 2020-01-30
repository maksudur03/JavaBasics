package javapractise.instanceoftest;

public class RacingCar extends Car {
    boolean nitro;
    public RacingCar(String brand, int uniqueId,boolean nitro) {
        super(brand, uniqueId);
        this.nitro=nitro;
    }

    public RacingCar(String brand, int uniqueId) {
        super(brand, uniqueId);
    }
}
