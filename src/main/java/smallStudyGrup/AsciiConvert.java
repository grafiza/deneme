package smallStudyGrup;

import java.util.Scanner;

public class AsciiConvert {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi=scan.nextInt();
        System.out.println((char)sayi);
    }
}
