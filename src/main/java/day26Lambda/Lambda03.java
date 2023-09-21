package day26Lambda;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Lambda03 {
    // 7 den 70 e kadar tüm sayıların toplamını veren kodu yazınız

    public static void main(String[] args) {
        System.out.println(getSumFromSevenToSeventy());
        System.out.println(getMultiplyFromThreeToNine());
        System.out.println(getFactoriel());
        System.out.println(getSumOfEvensBetweenToInteger());
    }
    //4) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz
    public static int getSumFromSevenToSeventy() {
        return IntStream.
                rangeClosed(7, 70).
                reduce(Math::addExact).
                getAsInt();
        //IntStream.rangeClosed(7,70).reduce(Integer::sum);
    }
    //5) 3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
    public static int getMultiplyFromThreeToNine() {
        return IntStream.
                rangeClosed(3, 9).
                reduce(Math::multiplyExact).
                getAsInt();
        //IntStream.rangeClosed(7,70).reduce(Integer::sum);
    }

    //6) Size verilen sayinin faktoryelini hesaplayan kodu yaziniz.
    public static int getFactoriel() {
        System.out.println("Sayıyı giriniz");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        if (sayi == 0)
            return 1;
        else if (sayi < 0)
            return -1;
        else
            return IntStream.
                    rangeClosed(1, sayi).
                    reduce(Math::multiplyExact).
                    getAsInt();
    }
    //7)Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    public static int getSumOfEvensBetweenToInteger() {
        System.out.println("1. Sayıyı giriniz");
        Scanner scan = new Scanner(System.in);
        int sayi1 = scan.nextInt();
        System.out.println("1. Sayıyı giriniz");
        int sayi2=scan.nextInt();
        if(sayi1>sayi2)
        {
            sayi1=sayi1+sayi2;
            sayi2=sayi1-sayi2;
            sayi1=sayi1-sayi2;
        }
        return IntStream.
                range(sayi1+1, sayi2).
                filter(Utils::isNumberEven).
                sum();

    }
}
