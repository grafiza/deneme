package day24enum_iterator_lambda;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {
        Cities rize = Cities.RİZE;

        System.out.println(rize);

        String akksaray = Cities.AKSARAY.getCityName();
        System.out.println(akksaray);
        String posta = Cities.ANKARA.getPostalCode();
        System.out.println(posta);
        ////Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin,


        System.out.println("plaka:");
        Scanner scan = new Scanner(System.in);
        int plaka = scan.nextInt();
        Cities cities[] = Cities.values();
        // System.out.println(Arrays.toString(cities));
        if (plaka > 81 || plaka < 1)
            System.out.println("Geçersiz");
        else {
            for (Cities c : cities) {
                if (c.getPlateCode() == plaka)
                    System.out.println(c);
            }
        }

    }
}
