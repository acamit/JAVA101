package collections;

import java.util.HashMap;

public class HashMapExample {
   public static void main(String[] args) {
       HashMap<String, Integer> phoneBook = new HashMap<>();
       phoneBook.put("Alex", 1);
       phoneBook.put("Jill", 1);
       phoneBook.put("Brenda", 1);
       phoneBook.put(null, Integer.MIN_VALUE);
       System.out.println(phoneBook);
       if (phoneBook.containsKey("Alex")) {
           phoneBook.remove("Alex");
       }
       System.out.println(phoneBook);

   }

}
