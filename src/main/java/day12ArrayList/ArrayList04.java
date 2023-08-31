package day12ArrayList;

import java.util.ArrayList;

public class ArrayList04 {
    public static void main(String[] args) {
        //Örnek : Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.
        ArrayList<String> r = new ArrayList<>();
        r.add("Manisa");
        r.add("Nigde");
        r.add("Tokat");
        r.add("Van");
        System.out.println(r);

        for (int i = 0; i <r.size() ; i++) {
            if(r.get(i).contains("a")) {
                r.remove(i);

            i--;
            }
        }
        System.out.println(r);

        //foreach eleman silme işlemlerinde başarısızdır

    }
}
