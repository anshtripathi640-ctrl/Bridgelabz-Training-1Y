package Collection;
import java.util.*;
public class PracticeTwo{
    static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("List: " + list);
        list.addFirst(69);
        System.out.println("After adding element at first Index: " + list);
        list.addLast(67);
        System.out.println("Afrer adding element at last Index: " + list);
        list.removeFirst();
        System.out.println("After removing element at first Index: " + list);
        list.removeLast();
        System.out.println("After removing element at last index: " + list);
        System.out.println("Reversed List: " +  list.reversed()  );
        System.out.println("Size of linked list: " + list.size());
    }
}
