package day21Maps;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {
        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 77);
        stdAges.put("Veli", 38);
        stdAges.put("Tom", 76);
        stdAges.put("Brad", 58);
        stdAges.put("Can", 58);
        stdAges.put("Can", 28);// bu değer görünür ama tavsiye edilmez
        System.out.println(stdAges);

        stdAges.replace("Can",19);// değiştirmek için bunu kullan
        System.out.println(stdAges);

        stdAges.replace("Can",19,41);
        System.out.println(stdAges);
stdAges.putIfAbsent("Zafer",43); // yoksa ekler
        System.out.println(stdAges);
        System.out.println(stdAges.get("Zafer")+"wewq");// get metodu aranan key  eğer map te varsa value sunu verir
        System.out.println(stdAges.get("zafer"));// harf duyarlı yoksa null verir

        System.out.println(stdAges.getOrDefault("Zafer", 0));//43
        System.out.println(stdAges.getOrDefault("zafer", 0));// yok ise istenen değer yani 0 verir. sona 53 yazsaydık 53 verecekti
        System.out.println(stdAges.containsValue(43)); // aranan değerin olup olmadığını kontrol eder
        System.out.println(stdAges.containsKey("Can")); // aranan değerin olup olmadığını kontrol eder
        System.out.println(stdAges.containsKey("can")); // aranan değerin olup olmadığını kontrol eder . harf duyarlı

        stdAges.remove("Can"); // key kullanarak entry silmeye yarar
        System.out.println(stdAges);

        stdAges.remove("Ali",77);// her ikisi de eşleşirse siler
        System.out.println(stdAges);
    }
}
