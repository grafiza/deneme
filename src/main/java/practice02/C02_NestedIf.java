package practice02;

import java.util.Scanner;

public class C02_NestedIf {
    public static void main(String[] args) {
         /*
      Kullanıcıdan sisteme bir numara girmesini isteyin.

      Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.

      Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Rakam" yazdırın,
      10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.

  */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı girin:");
        int num1=scan.nextInt();
        String sonuc=num1<0?"Negatif Sayı":(num1<10?"Rakam":"Pozitif Sayı");
        System.out.println(sonuc);
        if(num1<0)
            System.out.println("Negatif Sayı");
        else
            if(num1<10)
                System.out.println("Rakam");
            else
                System.out.println("Pozitif Sayı");
    }
}
