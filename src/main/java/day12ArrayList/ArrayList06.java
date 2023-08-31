package day12ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayList06 {
    public static void main(String[] args) {
        // Bir list oluştururken kısayol
        List<Integer> list= Arrays.asList(1,2,55,46,23,12) ;
       //list.remove(0); //çalışmaz
       //list.add(54); // çalışmaz
       //list.clear(); // çalışmaz

        // asList yöntemi kullanılırsa eleman sayısını değiştiren metotlar çalışmaz

        list.set(0,5); //çalışır
        System.out.println(list);
        System.out.println(list.size()); // çalışır


    }
}
