package day07StringManipulations;

import java.util.Scanner;

public class C08Odev {
    public static void main(String[] args) {
         /*
    Kullanıcıdan uc basamaklı pozitif bir sayı sisteme girmesini isteyiniz

    Bu sayıyı okunuşuna çeviren bir kod yazınız.

    or: girilen sayı = 425
    konsolda;
    dort yuz
    yirmi
    bes
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı pozitif bir sayı giriniz");
        int num=scan.nextInt();
        int yuzler=num/100;
        int onlar=(num/10)%10;
        int birler=num%10;

        switch (yuzler){
            case 1:
                System.out.println("Yüz");
                break;
            case 2:
                System.out.println("İkiyüz");
                break;
            case 3:
                System.out.println("Üçyüz");
                break;
            case 4:
                System.out.println("Dörtyüz");
                break;
            case 5:
                System.out.println("Beşyüz");
                break;
            case 6:
                System.out.println("Altıyüz");
                break;
            case 7:
                System.out.println("Yediyüz");
                break;
            case 8:
                System.out.println("Sekizyüz");
                break;
            case 9:
                System.out.println("Dokuzyüz");
                break;
            default:
        }
        switch (onlar){
            case 1:
                System.out.println("On");
                break;
            case 2:
                System.out.println("yirmi");
                break;
            case 3:
                System.out.println("otuz");
                break;
            case 4:
                System.out.println("kırk");
                break;
            case 5:
                System.out.println("elli");
                break;
            case 6:
                System.out.println("altmış");
                break;
            case 7:
                System.out.println("yetmiş");
                break;
            case 8:
                System.out.println("seksen");
                break;
            case 9:
                System.out.println("doksan");
                break;
            default:
        }
        switch (birler){
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("Üç");
                break;
            case 4:
                System.out.println("Dört");
                break;
            case 5:
                System.out.println("Beş");
                break;
            case 6:
                System.out.println("Altı");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");
                break;
            default:
        }


    }
}
