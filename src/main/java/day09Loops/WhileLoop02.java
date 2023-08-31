package day09Loops;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {
        //Example 2: 23'den 12'ye kadar cift
        // tamsayilari console'a yazdiriniz

        int num=23;
        while(num>11){
            if(num%2==0)
                System.out.println(num);
            num--;
        }


        //Example 1: Kullanicinin verdigi sayi
        // icin carpim tablosunu olusturup console'a
        // yazdiran kodu yaziniz
        /*            3 ==> 3x1=3
                            3x2=6
                            3x3=9
                            3x4=12 ...
                            3x10=30

                            */
        Scanner scan=new Scanner(System.in);
        System.out.println("1 den 10 a kadar bir sayı giriniz...");
        int num1=scan.nextInt();
        int i=1;
        while(i<11){
            System.out.println(num1+"x"+i+"="+num1*i);
            i++;
        }
    }
}
