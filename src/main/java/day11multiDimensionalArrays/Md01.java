package day11multiDimensionalArrays;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        // Bir Array in elemanları Array ise Multidinesinal Array olarak adlandırılır
        // MultiDimensional Array oluşturma
        // ilk köşeli parantez 'outer' ikinci köşeli parantez 'inner array'i temsil eder
        //
        int a[][]=new int[3][2];// [ [0,0] , [0,0] , [0,0] ] ==> Default

        a[0][0]=5;
        a[0][1]=12;
        a[1][0]=81;
        a[1][1]=45;
        a[2][0]=123;
        a[2][1]=0;

        System.out.println(Arrays.toString(a)); //[[I@19dfb72a, [I@17c68925, [I@7e0ea639]
        System.out.println(Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]

        System.out.println(a[1][1]);//45
        System.out.println(Arrays.toString(a[0]));//[5, 12]

int toplam=0;
        String dizi[][]= {{"Zafer","Büşra","Harun"},{"Azra","Şevval"},{"Bera","Halil"}};
        for (String[] w:dizi
             ) {
                toplam+=w.length;
        }
        System.out.println("toplam = " + toplam);


        //Example 2: Yukaridaki students array'inde icinde 
        // "r" olan isimleri console'a yazdiriniz

        for (String[] w:dizi
             ) {
            for (String x:w
                 ) {
                if(x.contains("r")){
                    System.out.println("x = " + x);
                }
            }
            
        }
    }
}
