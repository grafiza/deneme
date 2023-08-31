package day03wrapperconcatenationoperators;

public class TypeCasting {
    public static void main(String[] args) {
        /*
        Numeric primitive data type larinin birbirine donusturulmesine "Type Casting" denir
        Numeric(sayisal) data typelar  byte  - short  - int -   long -   float -     double

        Note 1: Kucuk data type lerini buyuk data type'larina cevirmeyi java otomatik yapabilir
        Bu isleme AutoWidening (Otomatik Genisletme) denir

        Note 2: Buyuk data type larini kucuk data type'larina cevirmek riskli bir istir
        Java bu riskli isleri otomatik olarak yapmaz. Bu islemi kod yazanlar yapar
        Bu isleme Expilicit Narrowing (Aciktan daraltma)

         */
        byte h=15;
        int k=h; // autowidening

        int sayi1=452;
        short sayi2=(short)sayi1;
    }
}
