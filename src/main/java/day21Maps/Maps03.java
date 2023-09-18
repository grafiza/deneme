package day21Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Maps03 {
    public static void main(String[] args) {

        /*
        INTERVIEW SORUSU
         */
        //Example 1: Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!"  => I=1, like=3, you=1

        String s="I like you, like like!";
        s=s.replaceAll("\\p{Punct}","");
        String words[]=s.split(" ");
        System.out.println(Arrays.toString(words));
        HashMap<String, Integer> occ=new HashMap();
        int i=1;
        for (String w:words             ) {
            Integer numOfOccurance=occ.get(w);
                if(numOfOccurance==null)
                occ.put(w, 1);
                else
                    occ.replace(w,numOfOccurance+1);

            }
        System.out.println(occ);
    }

    }

