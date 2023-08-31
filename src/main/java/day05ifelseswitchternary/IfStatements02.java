package day05ifelseswitchternary;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //Gün sayısını girildiğinde günün adını yazdır

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 1-7 arası sayı giriniz");
        byte day=scan.nextByte();
        if(day==1)
            System.out.println("Pazartesi");
        else if(day==2)
            System.out.println("Salı");
        else if(day==3)
            System.out.println("Çarşamba");
        else if(day==4)
            System.out.println("Perşembe");
        else if(day==5)
            System.out.println("Cuma");
        else if(day==6)
            System.out.println("Cumartesi");
        else if(day==7)
            System.out.println("Pazar");
        else
            System.out.println("Hata");


    }
}
