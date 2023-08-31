package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        /*
       Ornek:  Kullanıcıdan i)Adini ve Soyadini ii)Yaşını iii)Boyunu iv)kilosunu v) medeni durumunu girmesini isteyin
               Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın
        */

        Scanner scan=new Scanner(System.in);
        Scanner scan1=new Scanner(System.in);

        System.out.println("Adınız:");
        String ad=scan.nextLine();

        System.out.println("Soyadınız:");
        String soyad=scan.nextLine();

        System.out.println("Yaşınız:");
        byte yas=scan.nextByte();

        System.out.println("Boyunuz:");
        float boy=scan.nextFloat();

        System.out.println("Kilonuz");
        short kilo=scan.nextShort();

        System.out.println("Medeni Durumunuz:");
        String medeniDurum=scan1.nextLine();

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("kilo = " + kilo);
        System.out.println("medeniDurum = " + medeniDurum);

    }
}
