package day20Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Set01 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();

        hs.add("Zafer");
        hs.add("Harun");
        hs.add("Büşra");
        hs.add("Azra");
        hs.add("Halil");
        hs.add("Halil");// tekrarlı elemanları eklerken hata vermez ama sadece bir kere ekler
        hs.add(null);
        hs.add(null);
        System.out.println(hs);
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("abc");
        lhs.add("abcde");
        lhs.add("abcdef");
        lhs.add("abcxyz");
        lhs.add("abclkjm");
        lhs.add(null);
        System.out.println(lhs);

        LinkedHashSet<String> lhs1=new LinkedHashSet<>();
        lhs1.add("abc");
        lhs1.add("abcrewde");
        lhs1.add("abcxyz");
        lhs1.add("abcrwexyz");
        lhs1.add("abclkrewrjm");



        System.out.println(lhs.retainAll(lhs1));
        System.out.println(lhs);
        System.out.println(lhs1);


        TreeSet<Character> ts=new TreeSet<>();
        ts.add('a');
        ts.add('b');
        ts.add('c');
        ts.add('d');
        ts.add('1');
        ts.add('3');
        ts.add('5');
        // ts.add(null);  null tree set e eklenmez

        System.out.println(ts.subSet('a', 'c'));

        System.out.println(ts);
    }

}
