package day25Lambda;

import java.util.*;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(12, 9, 131, 14, 9, 10, 4, 12, 15));

        printEvenElemnts1(nums);
        printEvenElemnts2(nums);
        printSquareOddElements(nums);
        printCubeOfDistinctsOddElements(nums);
        System.out.println();
        printSumOfDistinctEvenElements(nums);
        printMultplyOfDistinctEvenElements(nums);
        System.out.println();
        getMaxValue1(nums);
        getMinValue1(nums);
        getMinValue2(nums);
        getMinValue3(nums);
        getMinValue4(nums);
        getMinGreaterThanSevenEven(nums);
    }

    private static void printSquareOddElements(List<Integer> nums) {
        System.out.println();
        nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                forEach(t -> System.out.print(t + " "));

    }

    //1) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran
    // method'u olusturunuz.(Structured)

    public static void printEvenElemnts1(List<Integer> nums) {
        for (Integer w : nums) {
            if (w % 2 == 0)
                System.out.print(w + " ");
        }
    }

    public static void printEvenElemnts2(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));
    }
    //2) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda  aralarina
    // bosluk koyarak yazdiran method'u olusturunuz.(Functional)
//3) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina
    // bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printCubeOfDistinctsOddElements(List<Integer> nums) {
        System.out.println();
        nums.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }

    //4)Bir list'teki "tekrarsiz" "CIFT " ELEMANLARIN "karelerinin" "toplamını"
    // hesaplayan method oluşturun
    public static void printSumOfDistinctEvenElements(List<Integer> nums) {
        int sum = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(0, (t, u) -> t + u);
        System.out.println(sum);

    }
    public static void printMultplyOfDistinctEvenElements(List<Integer> nums) {
        int sum = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(1, (t, u) -> t * u);
        System.out.println(sum);

    }
//6)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun

    public static void getMaxValue1(List<Integer> nums){
        int max=nums.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u?t:u);
        System.out.println();
        System.out.println(max);
    }

    //2. yol
    public static void getMaxValue2(List<Integer> nums){
        int max=nums.stream().distinct().reduce(nums.get(0),(t,u)->t>u?t:u);
        System.out.println();
        System.out.println(max);
    }
    //3. yol
    public static void getMaxValue3(List<Integer> nums){
        Integer max=nums.stream().distinct().sorted().reduce((t, u)->u).get();
        System.out.println();
        System.out.println(max);
    }

    //4. yol  best practice
    public static void getMaxValue4(List<Integer> nums){
        int max=nums.stream().distinct().sorted().reduce(Math::max).get();
        System.out.println();
        System.out.println(max);
    }

    // en küçük bulma

    public static void getMinValue1(List<Integer> nums){
        int min=nums.stream().distinct().sorted().reduce(Math::min).get();
        System.out.println();
        System.out.println(min);
    }

    // en küçük 2. yol
    public static void getMinValue2(List<Integer> nums){
        int min=nums.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t,u)->u).get();

        System.out.println(min);
    }
    // en küçük 3. yol
    public static void getMinValue3(List<Integer> nums){
        int min=nums.stream().distinct().sorted().reduce((t,u)->t).get();

        System.out.println(min);
    }
    // en küçük 3. yol
    public static void getMinValue4(List<Integer> nums){
        int min=nums.stream().distinct().sorted().reduce((t,u)->Math.min(t,u)).get();

        System.out.println(min);
    }
    //8)Verilen List'ten 7 den buyuk en kucuk cift sayi yi bulmak için bir method oluşturun
    // 12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi


    public static void getMinGreaterThanSevenEven(List<Integer> nums){
        int min=nums.
                stream().
                filter(t->t>7 && t%2==0).
                sorted().
                reduce(Math::min).
                get();
        // int min=nums.stream().filter(t->t>7 && t%2==0).sorted().findFirst().get; ilk datayı verir
        System.out.println(min);
    }
}
