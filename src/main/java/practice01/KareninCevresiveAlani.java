package practice01;

import java.util.Scanner;

public class KareninCevresiveAlani {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Karenin kenar uzunluğunu giriniz:");
        int sayi1=scan.nextInt();

        System.out.println("Çevresi:"+(sayi1*4));
        System.out.println("Alanı:"+(sayi1*sayi1));
    }
}
