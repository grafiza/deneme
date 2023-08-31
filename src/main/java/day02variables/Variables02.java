package day02variables;

public class Variables02 {
    public static void main(String[] args) {
        //Non-Primitive Data Type

        //Ornek 9: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.

        String ogrenciAdi = "Ali Can" ;

        int age = 7;

        //Stringler icin default deger (varsayilan deger) null dir
        //null demek 0 demek degildi. 0 da coding te bir degerdir
        //null hiclik demektir
        //icinde variable veya method bulunmayan bos bir obje demektir


        /*
        interview sorusu ?
        primitive ve non-primitive data type lari arasindaki fark nedir?

        1) primitive ler sadece bizim atadigimiz degeri icerir
           non-primitiveler bizim atadigimiz degeri ve methodlar icerir.

        2) primitiveler kucuk harfle baslar
           non-primitiveler ise buyuk harfle baslar

        3) primitiveleri java uretmistir ve 8 tanedir
           non-primitive leri java ve programcilar uretebilir, sinirsiz sayidadir

        4) primitive ler memory de data typelarina gore sabit boyutta bellek kullanir
           non-primitive ler memory de buyuklugune gore degisen boyutlarda bellek kullanabilir.
         */
byte ogrnot1=100;
byte ogrnot2=100;
        System.out.print("Not Toplamı");
        System.out.println(ogrnot1+ogrnot2);
        long deneme=0;
        System.out.println(Long.MAX_VALUE);
        System.out.println('a'+'b');
int harf='a';
        System.out.println(harf);//97
    }

}
