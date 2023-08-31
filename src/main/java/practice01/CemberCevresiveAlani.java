package practice01;

import java.util.Scanner;

public class CemberCevresiveAlani {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Çemberin yarıçapını giriniz:");
        float sayi1=scan.nextInt();

        System.out.println("Çevresi:"+(sayi1*2*(3.14)));
        System.out.println("Alanı:"+(sayi1*sayi1*3.14));
    }
}
