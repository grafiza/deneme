package day07StringManipulations;

public class SMPractice03 {
    public static void main(String[] args) {
        //Example 2: Verilen ismin ilk isiminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        //           "    ali cAN   " ==> AC
        //trim() methodu bir string in bas ve sonundaki space characterlerini siler, aradaki space leri silmez
        //split() methodu bir string i istedigimiz characterden parcalamaya yarar.
        
        String name="    ali cAN   ";
        char firstCase=name.trim().toUpperCase().charAt(0);
        char secondCase=name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("newName = " + firstCase+secondCase);

    }
}
