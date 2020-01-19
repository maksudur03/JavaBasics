package javapractise.listoptimize;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //list can't take primitive types as argument
        //Integer is a wrapper class for primitive type int

        //creating an arraylist
        List<Integer> listofInteger = new ArrayList<>();
        //adding an element
        listofInteger.add(0);
        //adding element at a certain index
        listofInteger.add(1, 1);
        listofInteger.add(2, 2);

        //creating another arraylist
        List<Integer> secondListofInteger = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
             secondListofInteger.add(i,i+3);
        }

        //adding second arraylist to the first arraylist
        listofInteger.addAll(secondListofInteger);
        //System.out.println(listofInteger);
        listofInteger.addAll(2,secondListofInteger);
        System.out.println(listofInteger);
        //removes all element of secondlistofinteger along with all the repeatations
        listofInteger.removeAll(secondListofInteger);
        //retains all element of secondlistofinteger along with all the repeatations
        listofInteger.retainAll(secondListofInteger);
        //sets 99 at 18th index
        //listofInteger.set(18,99);
        System.out.println(listofInteger);
        //removes the first 8 in the list
        //listofInteger.remove((Integer)8);
        //istofInteger.remove(11);
        System.out.println(listofInteger.size());


    }
}
