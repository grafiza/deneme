package practice01;

public class C01Variables {
    public static void main(String[] args) {
        //(int) bir variable(yas)  olustur ve yazdır
        int yas=12;
        System.out.println(yas);
        //(int) bir variable(sayi)  olustur ve yazdır
        int sayi=3344;
        System.out.println(sayi);
        //konsola sayi = 50 seklinde yazdır
        System.out.println("sayi = 50");
        //yeni bir variable olustur(benimYasim) ve yas variable'inin degerini benimYasim variable'ına kopyala
        int benimYasim=yas;

        //String bir variable olusturalım (isim)
        String isim="Zafer";
        //isim variable ını etiketıyle yazdır
        System.out.println("isim :"+isim);

        //onunIsmi variable'ı olustur ve isim variable'ının degerini onunIsmi variable'ına kopyala
        String onunIsmi=isim;

        //onunIsmi variable'ını etiketiyle yazdır
        System.out.println("onun ismi:"+onunIsmi);

        //isim variable'ının degerini guncelle
isim="ZAFER";
        //isim ve onunIsmi variable'larını yazdır
        System.out.println(isim);
        System.out.println(onunIsmi);
    }
}
