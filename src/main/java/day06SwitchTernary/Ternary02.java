package day06SwitchTernary;

public class Ternary02 {
    public static void main(String[] args) {
        //Example : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz
        int sayi=-591;
        sayi=Math.abs(sayi);
        String control=(sayi>99 && sayi<1000)?"üç basamaklı":"üç basamaklı değil";
        System.out.println(sayi+" " + control);
    }
}
