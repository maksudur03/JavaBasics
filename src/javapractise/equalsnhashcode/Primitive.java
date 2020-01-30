package javapractise.equalsnhashcode;

public class Primitive {

    public static void main(String[] args) {

        String S1 = new String("HELLO");
        String S2 = new String("HELLO");

        String s1 = "Hello";
        String s2 = "Hello";

        if(S1==S2) System.out.println("S1==S2");else System.out.println("S1!=S2");
        System.out.println(S1.equals(S2));
        System.out.println(S1.hashCode()+ " " +S2.hashCode());

        if(s1==s2) System.out.println("s1==s2");else System.out.println("s1!=s2");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode()+ " " +s2.hashCode());

        Double D1=20.5;
        Double D2=20.5;

        double d1=20.5;
        double d2=20.5;

        if(d1==d2) System.out.println("d1==d2");else System.out.println("d1!=d2");
        if(D1==D2) System.out.println("D1==D2");else System.out.println("D1!=D2");

        System.out.println(D1.equals(D2));
        System.out.println(D1.hashCode()+ " " +D2.hashCode());

        Integer I1=20;
        Integer I2=20;

        int i1=20;
        int i2=20;

        if(i1==i2) System.out.println("i1==i2");else System.out.println("i1!=i2");
        if(I1==I2) System.out.println("I1==I2");else System.out.println("I1!=I2");

        System.out.println(I1.equals(I2));
        System.out.println(I1.hashCode()+ " " +I2.hashCode());
    }
}
