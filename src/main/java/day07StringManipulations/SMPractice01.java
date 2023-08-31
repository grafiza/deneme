package day07StringManipulations;

import java.util.Scanner;

public class SMPractice01 {
    public static void main(String[] args) {
        /*
            Example : Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                        i)En az 8 character olsun
                        ii)Space characteri password'de olmasin
                        iii)En az bir tane buyuk harf olsun
                        iv)En az bir tane kucuk harf olsun
                        v)En az bir tane rakam olsun
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz:");
        String pwd=scan.nextLine();
        boolean islength=pwd.length()>0;
        boolean isSpace=pwd.contains(" ");
        boolean isUpper=pwd.replaceAll("[^A-Z]","").length()>0;
        boolean isLower=pwd.replaceAll("[^a-z]","").length()>0;
        boolean isDigit=pwd.replaceAll("[^0-9]","").length()>0;

        System.out.println(islength);
        System.out.println(isSpace);
        System.out.println(isUpper);
        System.out.println(isLower);
        System.out.println(isDigit);

        boolean control=islength && isSpace && isUpper && isLower && isDigit;
        String yaz=control?"Şifre Geçerli":"Şifre geçerli değil";
        System.out.println(yaz);
    }
}
