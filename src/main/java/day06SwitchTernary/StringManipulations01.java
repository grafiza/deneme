package day06SwitchTernary;

public class StringManipulations01 {
    public static void main(String[] args) {
        String s="Java is easy";
        int num=s.length();// karakter sayısı
        System.out.println("num = " + num);


        // ilk ve son karakteri bul

        char ilk=s.charAt(0);
        char son=s.charAt(s.length()-1);
        System.out.println("ilk karakter "+ilk);
        System.out.println("son karakter "+son);

        String ilkDort=s.substring(0,4);
        System.out.println("İlk dört karakter : "+ilkDort);//Java
        String x=s.substring(5,7);
        System.out.println(x);//is

        String y=s.substring(8);
        System.out.println(y);

        Boolean isExist=s.contains("easy");
        System.out.println(isExist);

        Boolean isExist1=s.contains("Easy");// harf duyarlılığı
        System.out.println(isExist1);

        Boolean ilkHarf=s.startsWith("J");//true
        boolean sonHarf=s.endsWith("y");//false
        
        boolean kont=s.endsWith("easy");
        System.out.println("kont = " + kont);
        
        



    }
}
