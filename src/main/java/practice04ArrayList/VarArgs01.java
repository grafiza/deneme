package practice04ArrayList;

public class VarArgs01 {
    public static void main(String[] args) {
        // kac tane kelime verilirse verilsin
// iclerinden en uzun olanı yazdıran bir method olusturun
// bu methodun access modifier'ını public yapıp aynı
// packagagedeki  faklı bir classdan calıstırınız
String str1="Zafer";
String str2="Semi";
String str3="Orhan";
String str4="Mustafa";
String str5="Kalender";
String str6="Muhammed";
String str7="Seyfullah";
String str8="Abdurrahman";
String [] list={"a","b"};
enUzunKelime(str1,str2,str3,str4,str5,str6,str7);
    }

    public static void enUzunKelime(String...kelime) {
        String enUzun="";
        for (String w:kelime             ) {
            if(w.length()>enUzun.length())
                enUzun=w;
        }
        System.out.println(enUzun);
    }
}
