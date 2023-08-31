package day03wrapperconcatenationoperators;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz:");
        byte yas=input.nextByte(); //Kullanıcının verdiği datayı byte tipinde getirir.
        System.out.println(yas);
        //1. adim : Scanner Class'tan object olustur

        //2. adim : Kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("Lutfen yasinizi giriniz..");

        //3. admi : Uygun method'u kullanarak kullanicinin verdigi data yi memory e yerlestiriniz
        byte age = input.nextByte();


        System.out.println(age);
    }
}
