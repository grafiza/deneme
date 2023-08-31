package day10LoopsArrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        String stdNames[]=new String[5];
        System.out.println("Arrays.toString(stdNames) = " + Arrays.toString(stdNames));
        stdNames[2]="Ali";
        stdNames[1]="Enes";
        stdNames[3]="Azize";
        stdNames[4]="Zafer";
        stdNames[0]="Fatma";
        System.out.println(Arrays.toString(stdNames));
        System.out.println(stdNames[4]);

        /*
        ----------------------------
         */
        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.

        String cities[]=new String[5];
        cities[0]="Rize";
        cities[1]="Düzce";
        cities[2]="Ankara";
        cities[3]="İzmir";
        cities[4]="İstanbul";
        
        //1. yol
        int toplam=0;
        for (int i = 0; i < cities.length; i++) {
            toplam+=cities[i].length();
        }
        System.out.println(toplam);

        //2. yol
        int totalChar=0;
        for (String w:cities){
            totalChar+=w.length();
        }
        System.out.println("totalChar = " + totalChar);
    }
}
