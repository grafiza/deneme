package day06SwitchTernary;

public class StringManipulations02 {
    public static void main(String[] args) {
        String s = "Learn Java 15000 money";

        //Ornek 1: "s" String'indeki "money" kelimesini "dollar" kelimesine ceviriniz.

        System.out.println(s);
        String newString=s.replace("money","dollar");
        System.out.println(newString);
        //Ornek 2: "s" String'indeki tum "e" harflerini siliniz

        String newString1=s.replace("e","");
        System.out.println(newString1);

        //rakamları * ile değiştir
String s3=s.replaceAll("[0-9]","*");
        System.out.println("s3 = " + s3);
//örnek 4: "s" String'indeki rakam sayisini bulunuz
        String s4=s.replaceAll("[^0-9]","");
        System.out.println(s4.length());

    }
}
