package day20Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
    public static void main(String[] args) {
        Queue<String> depo=new LinkedList<>();
        depo.add("et");
        depo.add("süt");
        depo.add("peynir");
        depo.add("zeytin");
        System.out.println(depo);
        depo.remove();
        System.out.println(depo);
        System.out.println(depo.peek());
        depo.clear();
        System.out.println(depo);
        System.out.println(depo.poll());
       // System.out.println(depo.element());//Exception in thread "main" java.util



        Queue<String >depo1=new PriorityQueue<>();
        depo1.add("portakal");
        depo1.add("elma");
        depo1.add("yumurta");
        depo1.add("armut");
        depo1.add("lahana");
        depo1.add("kiraz");

        System.out.println(depo1);

        Deque<String> d=new LinkedList<>();
        d.add("portakal");
        d.add("elma");
        d.add("yumurta");
        d.add("armut");
        d.add("lahana");
        d.add("kiraz");
        d.add("karpuz");
        d.addFirst("fasulye");
        d.addLast("ceviz");
        System.out.println(d);

    }

}
