package day08_For_Loops;

public class ForLoops03 {
    //example 2 :Verilen bir String'de kucuk harfleri console'a yazmayiniz
    //"Pwd12?Ab" ==> P12?A


    public static void main(String[] args) {


        String text = "erRwaQafsafsdfFSD";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                continue;
            } else{
                System.out.print(ch);}
        }
        System.out.println("\n");
    }
}
