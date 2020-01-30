package javapractise.hashmap;

import javapractise.instanceoftest.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*  public static <T> void main(String[] args) {
     *//*      HashMap<Integer,String> hashMap = new HashMap<>();
      hashMap.put(417,"munif");
      hashMap.put(418,"nahiyan");
      hashMap.replaceAll((k,v)->v.concat(" sust"));

      HashMap<Integer,String> hashMap1 = new HashMap<>();
      hashMap1.putIfAbsent(419,"tasmia");
      hashMap1.putIfAbsent(420,"dipto");

      hashMap.putAll(hashMap1);

      hashMap.compute(418,(k,v)->v.concat(" nasharah "));

        for(Map.Entry m : hashMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println(hashMap.keySet());*//*

       AnyClass<Param> anyClass = new AnyClass<>(new Param());
    }*/

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(5);
        ints.add(10);
        addIntegers(ints);
        double sum = sum(ints);
        List<String> strs = new ArrayList<>();
        strs.add("klmnop");
        strs.add("mnop");
        printData(strs);
        System.out.println("Sum of ints=" + sum);


//        Student student = new Student();
//        student.setPhoneNumber("0123456");
//        student.makePhoneCall();
//        student.setPhoneNumber("98765");
//        student.makePhoneCall();
//        student.setPhoneNumber("lam sam");

    }

    public static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void printData(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void addIntegers(List<? super Integer> list) {
        list.add(50);
    }
}
