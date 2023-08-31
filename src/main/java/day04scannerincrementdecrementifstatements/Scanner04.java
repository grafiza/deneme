package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz
        //           45678 ==> 45 + 78 = 123
        Scanner scan =new Scanner(System.in);

        System.out.println("5 basamaklı bir sayı giriniz:");
        int sayi=scan.nextInt();

        // 5 basamaklı bir tamsayıyı 100e bölersek son 3 basamağı silmiş oluruz.
        int firstTwo=sayi/1000;
        int lastTwo=sayi%100;

        System.out.println(firstTwo);
        System.out.println(lastTwo);
        System.out.println(firstTwo+lastTwo);


    }
}
