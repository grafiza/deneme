package day08_For_Loops;

public class ForLoops02 {
    public static void main(String[] args) {
        //Example 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        //           "I love Java" ==> "I love J"
        String text="I love Java";
        for (int i =0;i<text.length();i++){
            char ch=text.charAt(i);
            if (ch=='a')
                break;
            System.out.print(ch);

        }
        int toplam=0;
        int adet=0;
        for(int i=1;i<1001;i++){
            if(i%5==0 && i%7!=0){
                System.out.print(i+",");
                toplam=toplam+i;
                adet++;
            }
        }
        System.out.println("\n"+adet+" adet");
        System.out.println("Toplam"+toplam);
    }
}
