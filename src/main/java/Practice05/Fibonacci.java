package Practice05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayı:");
        int sayi=scan.nextInt();
        fibonacci(sayi);

    }

    private static void fibonacci(int sayi) {
        List<Integer> arr=new ArrayList<>();
        arr.add(0);
        arr.add(1);
        int seri=0;
        for (int i = 1; i < sayi-1; i++) {
            seri=arr.get(i-1)+arr.get(i);
            arr.add(seri);
        }
        System.out.println(arr);
    }
}
