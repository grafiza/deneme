package day13methodcreation_methodoverloading_varargs_passbyvalue;

import java.util.Scanner;

public class MethodCreation01 {
    public static void main(String[] args) {
        //ornek 1 : 2 sayiyi carpma islemi yapan bir method olusturunuz
        //int sonuc=carpma(3,6);
        //System.out.println(sonuc);


        ////Ornek 2: Verilen 3 sayidan ilk ikisini
        // carpan ve sonucu ucuncu sayi ile
        // toplayan method'u olusturunuz ve kullaniniz.

        int toplam=carpma(5,5,4);
        System.out.println(toplam);
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String word=scan.next();
        kelimeYaz(word);


        //Eger bir method yeni bir data üretmiyor ise return type i void olur
        //methodun return type i void ise method body icinde return keyword yazilmaz
        //Note : Method olusturmada kullanilan variable lar parametreler "parameters" olarak adlandirilir
        //      Method call da kullanilan degerlere Argumanlar "Arguments" denir.
    }
    public static void kelimeYaz(String kelime){
        System.out.println(kelime);
    }
    public static int carpma(int a, int b,int c){
        return a*b+c;
    }

}
