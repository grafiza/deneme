package day20Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

    public static void main(String[] args) {
        LinkedList<String> liste=new LinkedList<>();
        liste.add("Zafer");
        liste.add("Seyfi");
        liste.add("Zafer1");
        liste.add("Zafer2");
        liste.add("Zafer4");
        liste.add("Seyfi");
        liste.add("Seyfi");
        liste.add("Seyfi");
        liste.add(1,"gdffdg");
        liste.addFirst("hdakalks");liste.addLast("asdasdasd");
        System.out.println(liste);
        liste.remove("Zafer2");
        System.out.println(liste);
        liste.removeLastOccurrence("Seyfi");
        System.out.println(liste);
        String lis=liste.peek();
        System.out.println(lis);
        System.out.println(liste.poll());
        System.out.println(liste);
        System.out.println(liste.element());
        System.out.println(liste);
        System.out.println(liste.pop());
        System.out.println(liste);
    }
}
