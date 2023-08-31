package day10LoopsArrays;

import java.util.Arrays;

public class ArrayLoops03 {
    public static void main(String[] args) {
        //Example : Bir integer array olusturun ve 5 ten kucuk olan elemanlari yazdirin
        //           [12, 3, -3, 5, 23] ==> 3, -3
        int [] sayilar={12,3,-3,5,23};
        for (int w:sayilar) {
            if (w<5)
                System.out.print(w+" ");
        }
        //Example Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz
        String [] names={"A","T","W","V","H","P"};
        //binarySearch() metodu , sort() metodu kullanmadan kullanılmaz!
        // binarySearch() metodu var olan elemanlar için size o elemanın indeksini verir
        // binarySearch() metodu var OLMAYAN elemanlar için negatif sayı verir
        //"-" işaretinin anlamı, o eleman yok demektir
        // sayı ise aranan elaman eğer dizide (Array'de) olsaydı kaçıncı eleman olurdu'yu ifade eder


        Arrays.sort(sayilar);
        int aranan=Arrays.binarySearch(names,"A");
        System.out.println("aranan = " +sayilar[aranan]+" "+ aranan);
//ornek :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        String s = "Java is easy. Learn Java earn money.";
        int kelimeSayisi=s.split(" ").length;
        System.out.println("kelimeSayisi = " + kelimeSayisi);


    }
}
