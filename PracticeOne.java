package Collection;
import java.util.*;
public class PracticeOne{
    static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Kela");
        list.add("PineApple");
        list.add("Orange");
        list.add("Mango");
        System.out.println("List Of Fruits: " + list);
        int index = 0;
        System.out.println("Fruit on index 0: " + list.get(index));
        list.set(index, "Kiwi");
        System.out.println("Updated List( Apple to Kiwi): " + list);
        list.remove("Kiwi");
        System.out.println("Kiwi Removed,\nUpdated List: " + list);
        System.out.println("Did This List Contains Kiwi?: " + list.contains("Kiwi"));
        System.out.println("Is the list empty?: " + list.isEmpty());
        System.out.println("Size of list: " + list.size());
        System.out.println("Reversed list: " + list.reversed());
        //System.out.println(list.);
    }
}
