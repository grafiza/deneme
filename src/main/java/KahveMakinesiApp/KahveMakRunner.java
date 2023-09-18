package KahveMakinesiApp;

import java.util.Scanner;

public class KahveMakRunner {
    public static void main(String[] args) {
        Kahve turkKahvesi= new Kahve("Türk Kahvesi");
        Kahve filtreKahve= new Kahve("Filtre Kahve");
        Kahve espresso= new Kahve("Espresso");


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen seçiniz");
        System.out.println("1." +turkKahvesi.getKahveAdi());
        System.out.println("2." +filtreKahve.getKahveAdi());
        System.out.println("3." +espresso.getKahveAdi());


    }
}
