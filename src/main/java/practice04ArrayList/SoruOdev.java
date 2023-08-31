package practice04ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SoruOdev {
    public static void main(String[] args) {
        /*
        Kulanıcıdan alınan bir tam sayı kadar(47den kucuk olmak kosuluyla)
        FIBONACCI dizisi olusturun
        Ör: sayi=10 için
        0-1-1-2-3-5-8-13-21-34 gibi
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("sayı:");
        int sayi=scan.nextInt();
        ArrayList<Integer> dizi=new ArrayList<>();
        dizi.add(0);
        for (int i = 1; i <= sayi; i++) {
            dizi.add(dizi.get(i-1)+i);

        }
        System.out.println(dizi);
    }
}
