package day21Maps;

import java.util.*;

public class Maps01 {
    public static void main(String[] args) {
        HashMap<String,Integer>countryPopulation=new HashMap<>();
        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Italy",40000000);
        countryPopulation.put("Korea",40000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Brasil",88000000);
        countryPopulation.put("Mexico",88000000);
        System.out.println(countryPopulation);

        System.out.println(countryPopulation.get("Italy"));
        System.out.println(countryPopulation.keySet());
        Set<String> keys=countryPopulation.keySet();
        System.out.println(keys);

        Collection<Integer> values=countryPopulation.values();
        System.out.println(values);

        //Example 1: countryPopulation map'indeki ulkelerin nufuslarinin ortalamsi nedir?

        double toplam=0;
        for (Integer w:values             ) {
            toplam+=w;
        }
        double ortalama=toplam/values.size();
        System.out.println(ortalama);


        Set<Map.Entry<String,Integer>> entries=countryPopulation.entrySet();
        System.out.println(countryPopulation.entrySet());
        System.out.println(entries);

        //Example 2: countryPopulation Map'indeki ulkelerin isimlerinin character
        // sayisi ile nufuslarinin
        //toplamini bulunuz.
        int toplam1=0;
        for (Map.Entry<String,Integer> w:entries             ) {
            toplam1+=w.getKey().length()+ w.getValue();
        }
        System.out.println(toplam1);
    }
}
