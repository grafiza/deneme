package day12ArrayList;

import java.util.ArrayList;

public class ArrayList03 {
    public static void main(String[] args) {
        //Örnek : Tekrarli elemanlari olan bir
        // listten sadece tekrarsiz elemanlari olan bir list elde edinn
        //           [J, a, v, a, v] ==> [J, a, v]
        ArrayList <Character> a=new ArrayList<>();
        ArrayList <Character> b=new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');

        for (Character w:a) {
            if(!b.contains(w))
                b.add(w);
        }
        System.out.println(b);
    }
}
