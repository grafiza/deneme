package day09Loops;
import java.util.Scanner;
public class WhileLoop_InterviewSorusu {
    public static void main(String[] args) {
        //Example 2: Belirli bir tamsayının palindrom olup olmadığını
        // kontrol eden kodu yazın
        //           Palindrome: 121 <==> 121
        //           123321 <==> 123321

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");

        int num=scan.nextInt();
        String textNum=String.valueOf(num);
        String reversed="";
        int n=textNum.length()-1;
        while(n>=0){
            reversed+=textNum.charAt(n);
            n--;
        }
        System.out.println(reversed);
        if(textNum.equals(reversed))
            System.out.println("polindrom");
        else
            System.out.println("Polindrom değil");


    }
}
