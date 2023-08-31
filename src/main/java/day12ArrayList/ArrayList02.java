package day12ArrayList;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {
        //Örnek 1: Bir Integer ArrayList oluşturun
        // ve tek olanları 11 olarak değiştirin

        ArrayList<Integer> ages=new ArrayList<>();
        ages.add(5);
        ages.add(7);
        ages.add(18);
        ages.add(8);
        ages.add(83);
        ages.add(28);
        ages.add(23);
        ages.add(13);
        for (Integer w:ages) {
            if(w%2!=0)
                ages.set(ages.indexOf(w),11);
        }
        System.out.println(ages);
    }
}
