package day09Loops;

public class WhileLoop01 {
    public static void main(String[] args) {
        /*
        //for loop
        for (baslangic degeri ; loop calisma kurali ; artirma / azaltma) {
            calisacak kodlar
        }

        //while loop

        baslangic degeri

        while(loop calisma kurali){
            calisacak kodlar
            artirma / azaltma
        }
        */

        //Example 1: 3'den 6'ya kadar tamsayilari console'a yazdiriniz
        //1 yol for loop
        for (int i = 3; i < 7; i++) {
            System.out.println(i);
        }



        //2. yol while loop

        int i = 3;

        while (i < 7) {

            System.out.println(i);

            i++;
        }
    }
}
