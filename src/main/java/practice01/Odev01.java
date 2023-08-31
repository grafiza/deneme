package practice01;

import java.util.Scanner;

public class Odev01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1. Sayıyı giriniz:");
        int sayi1=scan.nextInt();
        System.out.println("2. Sayıyı giriniz:");
        int sayi2=scan.nextInt();
        System.out.println("Toplamı:"+(sayi1+sayi2));
        System.out.println("Farkı:"+(sayi1-sayi2));
        System.out.println("Çarpımı:"+(sayi1*sayi2));
    }
}
