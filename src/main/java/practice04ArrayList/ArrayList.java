package practice04ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        // Verilen bir array'den tekrar eden elemanları silip
        // tekrarsız elemanlardan olusan bir array haline donusturun
        //  int arr[]={1,2,2,3,4,4,5};

        int [] arr1={1,2,2,3,4,4,5};
        List<Integer> arr2=new java.util.ArrayList<>();
        for (Integer w:arr1             ) {
            if(!arr2.contains(w))
                arr2.add(w);
        }
        System.out.println(arr2);
        int []newArray=new int[arr2.size()];
        for (int i = 0; i < arr2.size(); i++) {
            newArray[i]=arr2.get(i);
        }
        System.out.println(Arrays.toString(newArray));

arr1=newArray;// eleman sayısını değiştirmek
        System.out.println("arr : "+Arrays.toString(arr1));

        //List<Integer> arr2=new ArrayList<>();
        //for (Integer w:arr1             ) {
        //    if(!arr2.contains(w))
        //        arr2.add(w);
        //}
        //System.out.println(arr2);
        //int [] brr=new int[arr2.size()];
        //for (int i = 0; i < arr2.size(); i++) {
        //    brr[i]=arr2.get(i);
        //}
        //System.out.println(Arrays.toString(arr1));
        //System.out.println(Arrays.toString(brr));
    }
}
