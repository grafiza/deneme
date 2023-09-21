package day26Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("MustafaX");
//        removeIfLengthGreaterThanFive(myList);
//
//        removeIfStartsWithZOrEndsWithF(myList);
        //removeIfStartsWithZOrEndsWithF2(myList);
        removeIfElementsContainsX(myList);
    }

    //1) Character sayisi 5'ten fazla olan elemanları silen bir method oluşturun.
    public static void removeIfLengthGreaterThanFive(List<String> myList) {
        myList.removeIf(t -> t.length() > 5);
        System.out.println(myList);
    }
    //2 ) 'Z' ile başlayan yada 'f' ile biten elemanları silen bir method oluşturun.

    //1. yol
    public static void removeIfStartsWithZOrEndsWithF(List<String> myList) {
        myList.removeIf(t -> t.charAt(0) == 'Z' || t.charAt(t.length() - 1) == 'f');
        System.out.println(myList);
    }

    //2. yol
    public static void removeIfStartsWithZOrEndsWithF2(List<String> myList) {
        myList.removeIf(t -> t.startsWith("Z") || t.endsWith("f"));
        System.out.println(myList);
    }

    public static void removeIfElementsContainsX(List<String> myList) {
        myList.removeIf(t -> t.contains("X"));
        System.out.println(myList);
    }

}
