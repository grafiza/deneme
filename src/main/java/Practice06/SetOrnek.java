package Practice06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOrnek {
    // Verilen bir array'den tekrar eden elemanları silip
    // unique elemanlardan olusan bir array haline donusturen method olusturun
    // int arr[]={1,2,2,3,4,4,5};
    public static void main(String[] args) {


        int arr[] = {1, 2, 2, 3, 4, 4, 5, 2, 0, 6, 4};
arr=benzersizYap(arr);

    }

    private static int[] benzersizYap(int[] arr) {
        Set<Integer> tekrarsizSet=new HashSet<>();
        for (Integer w:arr) {
            tekrarsizSet.add(w);
        }
        System.out.println(tekrarsizSet);
        int[] newArray=new int[tekrarsizSet.size()];
        int idx=0;
        for (Integer w:tekrarsizSet             ) {
            newArray[idx]=w;
            idx++;
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }


}
