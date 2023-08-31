package day14_Constructors_DateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime02 {
    public static void main(String[] args) {
        //Example 2: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen doğum tarihinizi yıl,ay ve günü sırayla giriniz : ");
        int year=scan.nextInt();
        int month=scan.nextInt();
        int day=scan.nextInt();
        LocalDate myDate=LocalDate.of(year,month,day);
        System.out.println(myDate.getDayOfWeek());
    }
}
