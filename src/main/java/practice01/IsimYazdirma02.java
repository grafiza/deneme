package practice01;

import java.util.Scanner;

public class IsimYazdirma02 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("İsminiz:");
        String ad=scan.nextLine();
        String ilkharf=scan.next();
        System.out.print("Soyisminiz:");
        String soyad=scan.nextLine();
        System.out.println("İsim-Soyisim :: "+ad+" "+soyad);
        System.out.println("İlkharf: "+ilkharf);

    }
}
