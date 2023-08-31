package day14_Constructors_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime03 {
    public static void main(String[] args) {
        //Anlık zamanı alma
           LocalTime simdi= LocalTime.now();
        System.out.println(simdi); //22:44:43.262173300
       DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("HH : mm");
        String formattedTime=dtf1.format(simdi);
        System.out.println(formattedTime);


                /*
DateTime Class ta kullanilan tarih saat formatlari
    HH : mm ==> 24'lu saat sistemi
    hh : mm ==> 12'li saat sistemi AM, PM gösterilmez
    hh : mm a ==> 12'li saat sistemi AM, PM
    HH : mm : ss==> saniyeyi gosterir
    HH : MM ==> yanlis format cunku MM aylar icin kullanilir
    "mm" "minute" demektir. "MM" "month" demektir.

    dd-MM-yyyy ==> gun - ay - yil
    MMM ==> Aug
    MMMM ==> August  */


        LocalDate tarih=LocalDate.now();
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        String yeniTarih=dtf2.format(tarih);
        System.out.println(yeniTarih);

        // Başka bir zaman dilimindeki zamanı nasıl alırız

        LocalDate dateInTokyo=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        LocalDate dateInAmsterdam=LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);

        LocalTime timeInTokyo=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        LocalTime timeInAmsterdam=LocalTime.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(timeInTokyo);
        System.out.println(timeInAmsterdam);

       LocalDateTime ldt= LocalDateTime.now();
        System.out.println(ldt);// 2023-08-28T23:17:05.281775300 T'ye kadar date i verir, T'den sonra time ı verir
        DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("dd.MM.yyyy HH : mm");
        String formattedLdt=dtf3.format(ldt);
        System.out.println(formattedLdt);
    }

}
