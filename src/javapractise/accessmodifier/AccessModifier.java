package javapractise.accessmodifier;

public class AccessModifier {
     private final double PI_CONST=3.14;
     public final String FIB="1,1,2,3,5,8.....";

    public AccessModifier() {
    }
    //can't set any constructor,getter,setter
    public void changeFinal(String demo){
        demo="changed";
        System.out.println(demo);
    }
}
