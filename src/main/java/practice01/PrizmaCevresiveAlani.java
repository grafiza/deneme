package practice01;

import java.util.Scanner;

public class PrizmaCevresiveAlani {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Prizmanın kısa kenarını giriniz:");
        int kisaKenar=scan.nextInt();
        System.out.println("Prizmanın uzun kenarını  giriniz:");
        int uzunKenar=scan.nextInt();

        System.out.println("Prizmanın yüksekliğini giriniz:");
        int yukseklik=scan.nextInt();



        System.out.println("Hacmi:"+(kisaKenar*uzunKenar*yukseklik));
    }
}
