package day12ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList05 {
    public static void main(String[] args) {
        //Example : Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 10, 19] ==> 12 and 10


        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);
        Collections.sort(nums); //ArrayList lerde sıralamak için Collections.sort() kullanılır
        int fark=nums.get(1)-nums.get(0);
        for (int i=1;i<nums.size();i++) {
            fark=Math.min(nums.get(i)-nums.get(i-1),fark);

        }
        for (int i=1;i<nums.size();i++) {
            if(nums.get(i)-nums.get(i-1)==fark)
                System.out.println(nums.get(i)+" "+nums.get(i-1));

        }

    }
}
