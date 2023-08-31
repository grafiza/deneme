package day04scannerincrementdecrementifstatements;

public class IfStatements01 {
    public static void main(String[] args) {
        int a=3;
        if(a>-1 && a<10){
            System.out.println("Rakam");
        }
        //Ornek 2: Sayi uc basamakli ise ekrana "Sayi üç basamaklidir!" yazdirin.

        int num1=1344;
        if(num1>99 && num1<1000){
            System.out.println("Sayı üç basamaklıdır");
        }
        else {
            System.out.println("Sayı üç basamaklı değildir");
        }
    }
}
