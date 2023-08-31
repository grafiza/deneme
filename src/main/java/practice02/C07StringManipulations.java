package practice02;

import java.util.Locale;
import java.util.Scanner;

public class C07StringManipulations {
    public static void main(String[] args) {
        /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    NOT: Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı ve soyadınızı aralarında bir boşluk olacak şekilde giriniz:");
        String adSoyad = scan.nextLine();
        String ad=adSoyad.substring(0,adSoyad.indexOf(" "));
        System.out.println(ad);
        String soyad=adSoyad.substring(adSoyad.indexOf(" ")+1);
        System.out.println(soyad);
        String first=ad.toUpperCase().charAt(0)+ad.toLowerCase().substring(1);
        String second=soyad.toUpperCase().charAt(0)+soyad.toLowerCase().substring(1);

        System.out.println("Ad :"+first);
        System.out.println("Soyad :"+second);


    }
}
