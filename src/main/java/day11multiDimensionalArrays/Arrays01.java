package day11multiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        // Interview Sorusu
//Example 1: [0, 2, 3, 0, 12, 0]
// sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]
        int numbers[]={0,2,3,0,12,0};
        int num2[]=new int[numbers.length];
        int i=0;
        for (int w:numbers
             ) {
            if(w!=0) {
                num2[i] = w;
                i++;
            }
        }
        System.out.println(Arrays.toString(num2));
        //iki arrayin esit olabilmesi icin ayni indexte ayni elemanlarin bulunmasi gerekir

        int [] arr =new int[3];
        arr[0]=2;
        arr[1]=1;
        arr[2]=3;

        int [] brr =new int[3];
        brr[0]=2;
        brr[1]=3;
        brr[2]=1;

        boolean result = Arrays.equals(arr,brr);
        System.out.println(result);
    }
}
