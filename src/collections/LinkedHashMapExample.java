package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> phoneBook = new LinkedHashMap<>(4, .75f, false);
        phoneBook.put("Alex", 1);
        phoneBook.put("Jill", 1);
        phoneBook.put("Brenda", 1);
        phoneBook.put(null, Integer.MIN_VALUE);
        System.out.println(phoneBook);
        if (phoneBook.containsKey("Brenda")) {
            phoneBook.remove("Alex");
        }
        System.out.println(phoneBook);
    }
}
