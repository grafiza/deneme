package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int num1=scan.nextInt();
        if (num1%2 ==0){
            System.out.println("Girdiğiniz sayı çift");}
            else{
            System.out.println("Girdiğiniz sayı tek");
        }
    }
}
