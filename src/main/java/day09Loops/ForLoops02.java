package day09Loops;

import java.util.Scanner;

public class ForLoops02 {
    public static void main(String[] args) {
        /*
          Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                X X X X X
                X X X X X
                X X X X X
    */

        for(int i=1;i<=3;i++){
            for(int j=1;j<=5;j++){
                System.out.print("X ");
            }
            System.out.println();
        }

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen satır sayısını girin");
        int row=scan.nextInt();
        System.out.println("Lütfen satır sayısını girin");
        int column=scan.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
