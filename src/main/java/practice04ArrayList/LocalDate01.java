package practice04ArrayList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDate01 {
    public static void main(String[] args) {
        /*
        Ali 29.10.1923 tarihinden 45 yıl 8 ay 5 gun
        sonra dogdu.
        Veli  15.09.1993 tarihinden 24 yil 2 ay 11 gun
        once dogdu.
        Ali ve Veli'nin dogum tarihini hesaplayıp yazdırınız.
        Ali ve Veli'nin dogum tarihlerinin aynı olup
        olmadıgını kontrol eden kodu yazınız
         */
        LocalDate dt1=LocalDate.of(1923,10,29).plusYears(45).plusMonths(8).plusDays(5);
        LocalDate dt2=LocalDate.of(1993,9,15).minusYears(24).minusMonths(2).minusDays(11);


        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yy/M/d");
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd.MMM.yyyy");
        System.out.println(dtf1.format(dt1));
        System.out.println(dtf.format(dt2));
        if(dt1.equals(dt2))
            System.out.println("Aynı tarih");
        else
            System.out.println("Aynı trih değil");
    }
}
