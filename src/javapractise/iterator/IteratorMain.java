package javapractise.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
         list.clear();
        Iterator iterator = list.iterator();
        System.out.println(list);
        
    }
}
