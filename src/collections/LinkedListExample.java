package collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static  void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add(1, "c");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list.remove('b'));

        var item = list.poll(); // return and remove first item
    }
}
