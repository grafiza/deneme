package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz:");
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        System.out.println("Toplam = " +( a+ b));
        System.out.println("Fark = " +( a- b));
        System.out.println("Çarpım = " +( a*b));
        System.out.println("Bölme = " +( a/ b));
    }
}
