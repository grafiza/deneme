package day14_Constructors_DateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        LocalDate myCurrentDate=LocalDate.now();
        System.out.println(myCurrentDate.getMonthValue());//8
        System.out.println(myCurrentDate.getYear());//2023
        System.out.println(myCurrentDate.getDayOfMonth());//28
        System.out.println(myCurrentDate.getMonth());//AUGUST String değil  Month geri döndürür (enum). Java da değişmez sabit değerler BÜYÜK harfle yazılır
        System.out.println(myCurrentDate.getDayOfWeek()); // MONDAY

        // İLERİKİ TARİHE NASIL GİDİLİR

        System.out.println(myCurrentDate.plusYears(1).plusMonths(1).plusDays(1)); //2024-09-29

        // Geçmiş tarihe nasıl gidilir

        System.out.println(myCurrentDate.minusYears(1).minusMonths(1).minusDays(1)); //2022-07-27

        // spesifik bir tarih girmek

        System.out.println(LocalDate.of(1980, 12, 9)); //1980-12-09
        LocalDate date1=LocalDate.of(1980, 12, 9);
        LocalDate date2=LocalDate.of(1981, 12, 9);
        System.out.println(date1.isAfter(date2)); //false
        System.out.println(date1.isBefore(date2)); //true


        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yıl,ay ve günü sırayla giriniz : ");
        int year=scan.nextInt();
        int month=scan.nextInt();
        int day=scan.nextInt();
        LocalDate myDate=LocalDate.of(year,month,day);
        if(myDate.isBefore(LocalDate.now()))
            System.out.println("Geçersiz tarih girdiniz...");
        else
            System.out.println("Zamanı girebilirsiniz");

    }
}
