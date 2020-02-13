package javapractise.instanceoftest;

import java.util.Objects;

public class Car {
    private String engine;
    private String brand;
    private int uniqueId;

    public Car() {
    }

    private Car(String brand, int uniqueId) {
        this.brand=brand;
        this.uniqueId=uniqueId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int move(){
        System.out.println("moving");
        return 4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return uniqueId == car.uniqueId &&
                Objects.equals(engine, car.engine) &&
                Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, brand, uniqueId);
    }
    public static void main(String[] args) {
        //Car c1= new RacingCar("maruti",22);//upcasting
        //RacingCar rc0 = new Car("AUDI",11);// Compilation error
        //Car c0 = new RacingCar("lambo",22);
        //RacingCar rc0= (RacingCar)c0;//DOWNCASTING
        //RacingCar rc1 = new RacingCar("maruti" ,22);//casting
        //System.out.println(rc0.getClass());

        Car cyber = new ElectricCar();
        System.out.println(cyber.getBrand());
    }

}
