package day24enum_iterator_lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators {
    public static void main(String[] args) {
        List<String> myList= new ArrayList<>();
        myList.add("Tom");
        myList.add("Toma");
        myList.add("Taom");
        myList.add("aTom");
        myList.add("fTomf");
        myList.add("sTosm");
        myList.add("dTodam");

     //  Iterator<String> myIterator= myList.iterator();
//       while (myIterator.hasNext()){
//           myIterator.next();
//           myIterator.remove();
//
//       }

      ListIterator<String>listIterator= myList.listIterator();

      while (listIterator.hasNext()){
         String ad= listIterator.next();
          listIterator.set(ad+"*");
      }
        System.out.println(myList);
    }
}
