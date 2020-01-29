package javapractise.equalsnhashcode;

import java.util.Objects;


public class Car {
    private String brand;
    private int uniqueId;

    public Car(String brand, int uniqueId) {
        this.brand = brand;
        this.uniqueId = uniqueId;
    }
//just overridden, NOT MODIFIED
/*
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
*/
//Overridden and modified implementation


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return uniqueId == car.uniqueId &&
                Objects.equals(brand, car.brand);
    }

    public static void main(String[] args) {
        Car c1= new Car("LAMBO",233);
        Car c2=new Car("audi",1111);
        Car c3= new Car("LAMBO",233);
        System.out.println(c1.hashCode()+" "+c2.hashCode()+" "+c3.hashCode());
        if(c1==c3)
            System.out.println("c1==c3");
        if(c1.equals(c3))
            System.out.println("c1 equals c3");
        //Firstly, == is a operator and java doesn't support operator overloading. So, == just checks if the memory address is same here.
        //== DOES NOT USE HASHCODE(we don't know how it works) and hashcode is DEFINITELY NOT MEMORY ADDRESS as we can override it
        //if we override the equals and hashcode method output we can get different output according to our implementation
        //Implementation of native methods are hidden. obj.hashCode() is a native method if not overridden

    }
}
