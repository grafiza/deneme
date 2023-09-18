package day21Maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Maps04 {
    public static void main(String[] args) {
        Hashtable<String, Integer> ogrenciNotlari=new Hashtable<>();

        ogrenciNotlari.put("Ali",78);
        ogrenciNotlari.put("Veli",78);
        ogrenciNotlari.put("Serkan",78);
        ogrenciNotlari.put("Tolga",78);
        ogrenciNotlari.put("Zafer",78);
        ogrenciNotlari.put("Ceyhan",78);
        ogrenciNotlari.put("Ali",78);
        ogrenciNotlari.put("Ali",78);
        ogrenciNotlari.put("Ali",78);


        TreeMap<String,Integer> countryPopulation=new TreeMap<>();

        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Italy",40000000);
        countryPopulation.put("Korea",40000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Brasil",88000000);
        countryPopulation.put("Mexico",88000000);
        System.out.println(countryPopulation);


        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 77);
        stdAges.put("Veli", 38);
        stdAges.put("Tom", null);
        stdAges.put(null, null);
        stdAges.put(null, 58);
        System.out.println(stdAges);
    }
}
