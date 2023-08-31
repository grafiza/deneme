package practice04ArrayList;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        /*
        Basit 4 islem yapan bir hesap makinesi kodlayınız
        Kullanıcıcn yapacagi islemi islem sembolu ile
        ( +  -  /  *  ) secmesini isteyiniz
        Kullanıcının 2 sayi girmesini isteyiniz
        Girilen islem ve sayilara gore dogru sonucu
         ekrana yazdırınız
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen işlem yapmak istediğiniz sembolü giriniz\n" +
                "Toplama : +\n" +
                "Çıkarma : -\n" +
                "Çarpma : *\n" +
                "Bölme : /\n");
        char ch=scan.next().charAt(0);
        if(ch=='+'|| ch=='-'||ch=='*'||ch=='/'){
            System.out.print("1. Sayı : ");
            int sayi1=scan.nextInt();
            System.out.print("2. Sayı : ");
            int sayi2=scan.nextInt();
            hesapla(ch,sayi1,sayi2);
        }
        else
            System.out.println("Hatalı Giriş");

    }
    public static void hesapla(char islem,double a,double b){
        switch (islem){
        case '+' :System.out.println(a+" + "+b+" = "+(a+b));break;
        case '-' :System.out.println(a+" - "+b+" = "+(a-b));break;
        case '*' :System.out.println(a+" * "+b+" = "+(a*b));break;
        case '/' :System.out.println(a+" / "+b+" = "+(a/b));break;
        }
    }
}
