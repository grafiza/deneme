package day06SwitchTernary;

public class TernaryInterViewSorusu {
    public static void main(String[] args) {

        //interview question
        /*    Example : Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
                       1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
                       2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
         */
        int year=2005;
        String sonuc=(year%100==0)?(year%400==0?"Leap":"Leap Değil"):(year%4==0?"Leap":"Leap Değil");
        System.out.println(year+ " " + sonuc);
    }
}
