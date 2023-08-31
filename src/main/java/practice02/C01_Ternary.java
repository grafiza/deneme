package practice02;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {


    /*
            Kullanıcıdan bir sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı girin:");
        int num1 = scan.nextInt();
        Object mesaj=num1%2==0?"Çift sayı":num1+3;
        System.out.println(mesaj);
    }
}