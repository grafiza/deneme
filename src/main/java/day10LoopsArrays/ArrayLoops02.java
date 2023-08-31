package day10LoopsArrays;

import java.util.Arrays;

public class ArrayLoops02 {
    public static void main(String[] args) {
        //Example: Integer array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz
int [] ages=new int[6];
ages[0]=15;
ages[1]=16;
ages[2]=12;
ages[3]=22;
ages[4]=17;
ages[5]=25;
//        System.out.println(Arrays.toString(ages));
//        Arrays.sort(ages);
//        System.out.println("En küçük = " + ages[0]);
//        System.out.println("En büyük = " + ages[ages.length-1]);
//        System.out.println(ages[0]+ages[ages.length-1]);
    // 2. yol

        int minimum=ages[0];
        int maximum=ages[ages.length-1];
        for (int w:ages) {
            minimum=Math.min(w,minimum);
            maximum=Math.max(w,maximum);
        }
        System.out.println("maximum = " + maximum);
        System.out.println("minimum = " + minimum);

    }
}
