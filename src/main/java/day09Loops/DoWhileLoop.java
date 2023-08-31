package day09Loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
         /*
            Kullanicidan bir tamsayi aliniz
            Tamsayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
            Tamsayi 100 ve 100'den buyuk ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz
         */

        Scanner scan=new Scanner(System.in);

        do{
            System.out.print("Bir sayı giriniz");
            int num=scan.nextInt();
            if (num>=100)
                System.out.println("Kazandınız");
            else {
                System.out.println("Kaybettiniz");
                break;
            }
        }while(true);

    }
}
