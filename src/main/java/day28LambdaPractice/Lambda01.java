package day28LambdaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(-5, -8, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));
        //SORU1: List elemanlarının çift ve pozitif olanlarını,
        // Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın

        //SORU2: List elemanlarının çift ve pozitif olanlarını,
        // Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın

        //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın

        //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın

        //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın

        // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup,
        // birler basamagı 5 olanları yazdırınız

        // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın

        // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın

        //SORU9 : Listin pozitif elemanlarının, carpımını
        // Lambda Expression ile return ederek yazdırın

        //SORU10 : Listin cift elemanlarının, karelerini,
        // kucukten buyuge sıralayıp list halinde return ederek yazdırınız


        getEvenAndOddList(myList);
        System.out.println();
        getEvenAndOddListMethodReferance(myList);
        System.out.println();
        getSquareOfNumbers(myList);
        System.out.println();
        getSquareOfDistinctNumbers(myList);
        System.out.println();
        sortByAscended(myList);
        System.out.println();
        getPositiveNumbersCubeAndFiveOnePairs(myList);
        System.out.println();
        sumOfNumbers(myList);
        sumOfNumberWithLambda(myList);
        System.out.println(multiplyPositiveNumberWithLambdaEx(myList));
        System.out.println(squareEvenNumbersWithLsst(myList));


    }

    private static List<Integer> squareEvenNumbersWithLsst(List<Integer> myList) {
        return myList.
                stream().
                filter(t->t%2==0).
                map(t->t*t).
                sorted().
                collect(Collectors.toList());
    }

    private static int multiplyPositiveNumberWithLambdaEx(List<Integer> myList) {
        return myList.stream().filter(t->t>0).reduce(1,(t,u)->t*u);
    }

    private static void sumOfNumberWithLambda(List<Integer> myList) {
        System.out.println(
                myList.
                stream().
                reduce(0, (t, u) -> t + u));
    }

    private static void sumOfNumbers(List<Integer> myList) {
        System.
                out.
                println(myList.stream().
                        reduce(Integer::sum).
                        get());
    }

    private static void getPositiveNumbersCubeAndFiveOnePairs(List<Integer> myList) {
        myList.stream().
                filter(t->t>0).
                map(t->t*t*t).
                filter(t->t%10==5).
                forEach(Utils::printWithSpace);
    }

    public static void getEvenAndOddList(List<Integer> myList) {
        myList.
                stream().
                filter(t -> t > 0).
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));
    }

    public static void getEvenAndOddListMethodReferance(List<Integer> myList) {
        myList.
                stream().
                filter(Utils::getEvenAndPositive).
                forEach(Utils::printWithSpace);
    }

    public static void getSquareOfNumbers(List<Integer> list) {
        list.
                stream().
                map(t -> t * t).
                forEach(Utils::printWithSpace);
    }

    public static void getSquareOfDistinctNumbers(List<Integer> list) {
        list.
                stream().
                map(t -> t * t).
                distinct().
                forEach(Utils::printWithSpace);
    }
    public static void sortByAscended(List<Integer> list) {
        list.
                stream().
                sorted(Comparator.reverseOrder()).
                forEach(Utils::printWithSpace);
    }
}
