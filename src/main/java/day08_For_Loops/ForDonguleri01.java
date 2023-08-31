package day08_For_Loops;

public class ForDonguleri01 {
    public static void main(String[] args) {
        // Ekrana 5 kere Hi yazdırın

        for(int i=1;i<=5;){
            System.out.println("xzxzHi");
            i++;
        }
// soru: 11'den 14'e kadar olan tamsayıları ekrana yazdıran kod

        System.out.println("-----------------");
        for (int i=11;i<15;i++)
        {
            System.out.print(i+" ");
        }


        System.out.println("");
        System.out.println("-----------------");
        // Example 3: 40 'dan 23'e kadar çift tamsayıları ekrana yazdıran kodu

for(int i=40;i>22;i-=2){
    System.out.println(i);
}


        System.out.println("-----------------");

        int sum = 0;
        for (int i = 578; i > 0; i = i / 10) {

            sum = sum + i % 10;

        }
        System.out.println(sum);
    }
}
