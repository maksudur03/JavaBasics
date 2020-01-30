package javapractise.hashmap;

import java.util.List;

public class AnyClass<T extends Test2> {
    private T value;

    public AnyClass(T value) {
        this.value = value;
        this.value.hello();
        System.out.println(value.toString());
    }
}
