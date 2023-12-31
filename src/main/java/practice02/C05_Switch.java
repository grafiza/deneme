package practice02;

import java.util.Scanner;

public class C05_Switch {
    public static void main(String[] args) {
         /*

         Kullanıcıdan 0-4 arasi sınav puanını sisteme girmesini isteyiniz.

         Eger puanı 0,0-1,0 arasında ise KALDI seviyesi veriniz
              puanı 1,0-2,0 arasında ise GECTI seviyesi veriniz
              puanı 2,0-2,5 arasında ise IYI seviyesi veriniz
              puanı 2,5-3,5 arasında ise UST seviyesi veriniz
              puanı 3,5-4,0 arasında ise HARİKA seviyesi veriniz

        switch case kullanarak KALDI seviyesine F harf notu veriniz
                               GECTİ seviyesine D harf notu veriniz
                               IYI seviyesine C harf notu veriniz
                               UST seviyesine B harf notu veriniz
                               HARİKA seviyesine A harf notu veriniz
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("0-4 arasında bir puan girin:");
        double puan = scan.nextDouble();
        String durum="";
        if(puan>=0 && puan<1)
            durum="KALDI";
        else if(puan>=1 && puan<2)
            durum="GECTİ";
        else if(puan>=2 && puan<2.5)
            durum="İYİ";
        else if(puan>=2.5 && puan<3.5)
            durum="UST";
        else if(puan>=3.5 && puan<=4)
            durum="HARİKA";
        else
            durum="Hatalı Giriş !";
        System.out.println("Durum:"+durum);
        switch(durum){
            case "KALDI":
                System.out.println("Not :F");
                break;
            case "GECTİ":
                System.out.println("Not :D");
                break;
            case "İYİ":
                System.out.println("Not :C");
                break;
            case "UST":
                System.out.println("Not :B");
                break;
            case "HARİKA":
                System.out.println("Not :A");
                break;
            default:
                System.out.println("Sınav puanınızı kontrol ediniz");
        }

    }
}
