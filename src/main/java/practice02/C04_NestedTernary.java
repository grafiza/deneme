package practice02;

import java.util.Scanner;

public class C04_NestedTernary {

    public static void main(String[] args) {
/*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı girin:");
        int num1 = scan.nextInt();
        System.out.println("Bir sayı girin:");
        int num2 = scan.nextInt();
        Object durum1=num1==num2?"Sayılar Birbirine Esit":num1>num2?num1:num2;
        System.out.println(durum1);
    }
}
