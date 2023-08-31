package day07StringManipulations;

import java.util.Scanner;

public class SMPractice07 {
    public static void main(String[] args) {
        /*  Örnek :
       Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin
       i) Parola Boş olmamalıdır, en az bir karakter icermelidir.
       ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir
       iii) Başında ve sonunda boşluk olmamalıdır.
   */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen parola giriniz:");
        String pwd=scan.nextLine();
        Boolean isEmpty=!pwd.isEmpty();
        Boolean isBlank=!pwd.isBlank();
        Boolean isSpace=pwd.trim().equals(pwd);
        System.out.println(isEmpty);
        System.out.println(isBlank);
        System.out.println("isSpace = " + isSpace);
        if(isEmpty && isBlank && isSpace)
            System.out.println("Şifre Geçerli");
        else
            System.out.println("Şifre Geçersiz");


         /*
        Note:
            String lerin esitliklerini kontrol ederken "==" yerin equals kullaniriz
            cunku == sembolu iki stringi karsilastirirken hem adreslerin hemde degerlerine bakar
            eger ikiside ayni ise stringler esittir der

            equals() methodu ise iki string karsilastirirken sadece degerlerine bakar, degerleri ayni ise bu iki
            string esittir der, degerler farkli ise bu iki string farkli der
         */
    }
}
