package practice04ArrayList;

import java.util.Scanner;

public class Fahrenayt {
    public static void main(String[] args) {
// Fahrenheit değeri, Celsius değere çeviren
// method yazınız.
        // formül: c = (f-32)/1.8

        //Not: fahrenheit degerini bu methoda
        // gonderdıgımde bana celsius cinsinden
        // sıcaklık donmeli

        Scanner scan=new Scanner(System.in);
        System.out.println("Fahrenayt değeri:");
        double fahrenayt=scan.nextDouble();
        double celcius=celciusDondur(fahrenayt);
        System.out.println(fahrenayt +" : "+celcius+"°C");

    }

    private static double celciusDondur(double fahrenayt) {
        return (fahrenayt-32)/1.8;
    }
}
