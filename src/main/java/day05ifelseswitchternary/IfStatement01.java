package day05ifelseswitchternary;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        // Verilen sayının pozitif, negatif veya nötr olduğunu kontrol ediniz
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int num=scan.nextInt();
        if(num>0) {
            System.out.println("Girdiğiniz sayı" + num + "\nBu bir pozitif sayıdır");
        }
            else if(num<0)
        {
            System.out.println("Girdiğiniz sayı " + num + "\nBu bir negatif sayıdır");
        }
            else
            System.out.println("Girdiğiniz sayı " + num + "\nNötr");


    }

}
