package collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        linkedList.addFirst(3);
        linkedList.addLast(6);
        System.out.println(linkedList);
        linkedList.getFirst();
        linkedList.getLast();
        linkedList.removeFirst();
        linkedList.removeLast();
//        linkedList.removeIf((x)-> x%2==0);
//        System.out.println(linkedList);

        LinkedList<Integer> linkedList1 = new LinkedList<>(Arrays.asList(2,3,4));
        System.out.println(linkedList);
        linkedList.removeAll(linkedList1);
        System.out.println(linkedList);
    }
}
