package practice01;
import java.util.Scanner;
public class IsimYazdirma {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("İsminiz:");
        String ad=scan.nextLine();
        System.out.print("Soyisminiz:");
        String soyad=scan.nextLine();
        System.out.println("İsminiz : "+ad);
        System.out.println("Soyisminiz : "+soyad);
        System.out.println("Kursumuza kaydınız alınmıştır. Teşekkürler");
    }
}
