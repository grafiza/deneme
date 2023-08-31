package day08_For_Loops;

public class ForLoops04 {
    public static void main(String[] args) {
        //ornek 3 Bir String'i ters ceviren kodu yaziniz
        //"Java" ==> "avaJ"

        String text="Java";
        String newText="";
        for (int i=text.length()-1;i>=0;i--){
        newText+=text.charAt(i);


        }
        System.out.println(newText);


        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578 ==> 5+7+8 = 20


        int sum = 0;
        for (int i = 578; i > 0; i = i / 10) {

            sum = sum + i % 10;

        }
        System.out.println(sum);

        //-----------------

        System.out.println("-------------");
        System.out.println("-------------\n");

        //Bir string teki tekrarsiz karakterleri veren kodu yaziniz
        //          mehmet ==> ht
String text1="mehmet";
String unique="";
for (int i=0;i<text1.length();i++){
    char ch=text1.charAt(i);
    if (text1.indexOf(ch)==text1.lastIndexOf(ch))
        unique+=ch;
        }
        System.out.println("unique = " + unique);



        int carpim=1;

        for (int i =7; i<10 ; i++) {

            carpim =  carpim * i;

        }
        System.out.println(carpim);

    }



}
