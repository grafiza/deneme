package day26Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        printElementsExceptStartsWithE(myList);
        System.out.println();
        List <String> newList= printDistinctElementsLengthLessThanFive(myList);
        getElementsLengthLessThanFiveWithUpperCase(myList);
        getElementsUpperCase(myList);

    }

    //Example 1: Bir List'teki E ile baslayanlar haric tum elemanlari
    // console'a yazdiran method'u olusturunuz.

    public static void printElementsExceptStartsWithE(List<String> myList) {
        myList.stream().
                filter(t -> !t.startsWith("E")).
                forEach(Utils::printlnTheSameLineWithSpace);

    }
    //Example 2: Bir List'te character sayisi 5 den az olan tum elemanlari tekrarsiz
    // olarak console'a yazdiran method'u olusturunuz.

    public static List<String> printDistinctElementsLengthLessThanFive(List<String> myList) {
        myList.stream().
                distinct().
                filter(t -> t.length() < 5).
                forEach(Utils::printlnTheSameLineWithSpace);
return myList;
    }
//Example 3: Bir List'teki character sayisi 5 den cok olan tum elemanlari buyuk harflerle
    // bir listin icinde veren method'u olusturunuz.

    public static List<String> getElementsLengthMoreThanFiveWithUpperCase(List<String> myList) {
        return  myList.stream().
                filter(t->t.length()>5).
                map(String::toUpperCase).// class name:: method name ==> method reference
                        //map(String::toUpperCase).
                collect(Collectors.toList());
    }
    //Example 4: Bir List'teki character sayisi 5 den az olan tum elemanlari tekrarsiz olarak kucuk harflerle
    // natural order da console'a yazdiran method'u olusturunuz.
    public static void getElementsLengthLessThanFiveWithUpperCase(List<String> myList) {
         myList.stream().
                 distinct().
                 filter(t->t.length()<5).
                 map(String::toLowerCase).
                 sorted().
                 forEach(Utils::printlnTheSameLineWithSpace);

    }
//Example 5: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada
    // console'a yazdiran method'u olusturunuz.

    public static void getElementsUpperCase(List<String> myList) {
        myList.stream().
                distinct().
                map(String::toUpperCase).
                sorted().
                forEach(Utils::printlnTheSameLineWithSpace);

    }
//Example 6: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina
// gore kucukten
    // buyuge siralayarak console'a yazdiran method'u olusturunuz.

    public static void printElementUniqueLowerCaseSortWithLength(List<String> myList){
        myList.stream().
                distinct().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length)).
                forEach(Utils::printlnTheSameLineWithSpace);
    }

}
