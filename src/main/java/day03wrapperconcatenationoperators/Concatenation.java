package day03wrapperconcatenationoperators;

public class Concatenation {
    public static void main(String[] args) {
        //Örnek: Bir string ve iki integer oluştur. String değeri ile integerların toplamını console a yazdır

        String a="metin";
        int sayi1=5;
        int sayi2=3;


        System.out.println(a+sayi1+sayi2);//metin53
        // Bu işleme CONCATENATION denir. string ve sayıların birleştirilmesi
        System.out.println(a+sayi1*sayi2);//metin15 işlem önceliği
        System.out.println(a+(sayi1+sayi2));//metin8
        System.out.println(sayi1+sayi2+a);//8metin
        System.out.println(sayi1+a+sayi2);//5metin3



                //Ornek 1: Bir String ve iki integer variable olusturun. String degeri ile int larin toplamini console yazdirin



                //Java da "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur
                //Java da "+" sembolu iki String arasinda veya bir String ve bir sayi arasinda kullanilirsa concatenation islemi olur
                //Concatenation islemi birlestirme yapar
                //Note : Concatenation islemlerinde java matematikteki islem onceligini kullanir

        /* Matematikte islem onceligi
        1)Once uslu sayilar
        2)Parantez ici islemler
        3)Carpma ve Bolmeler yapilir
        4)Toplama ve cikarmalar yapilir
        5)Ayni oncelikli olanlarda soldan saga baslanir

         */
            }


        }
