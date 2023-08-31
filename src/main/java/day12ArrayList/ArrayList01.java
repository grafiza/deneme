package day12ArrayList;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<Integer> ages=new ArrayList<>();
        ArrayList<Integer> newAges=new ArrayList<>();
        ages.add(5);
        ages.add(7);
        ages.add(18);
        ages.add(8);
        ages.add(2,77);

        newAges.add(1);
        newAges.add(2);
        newAges.add(3);
        newAges.add(4);
        //ages.addAll(2,newAges);//[5, 7, 1, 2, 3, 4, 77, 18, 8]
        ages.addAll(newAges);//[5, 7, 77, 18, 8, 1, 2, 3, 4]
        System.out.println(ages);

        int elemanSayisi=ages.size();
        System.out.println(elemanSayisi);
        System.out.println(ages.get(2));

        ages.set(1,334);
        System.out.println(ages);


    }

}
