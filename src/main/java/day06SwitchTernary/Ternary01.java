package day06SwitchTernary;

public class Ternary01 {
    public static void main(String[] args) {
        //Example 1: Bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //           -4 ==> -1*-4        4 ==> 4        0 ==> 0
        
        int num=4;
        int mutlak=num<0?num*-1:num;
        System.out.println("mutlak = " + mutlak);


        //Example 2: Iki sayinin isareti ayni ise bu
// sayilari carpan,
//isaretleri farkli ise "Farkli isaretli
// sayilari carpamiyorum"
// mesaji veren kodu yaziniz.

        int a=55;
        int b=3;
        Object compare=(a>0 && b>0) ||(a<0 && b<0)?a*b:"Bu sayıları çarpamam yiğenim";
        System.out.println("compare = " + compare);
//Object java da butun Non-primitive (classlarin) ortak parent(baba) idir (==>Hz. Adem gibidir)
        //Object in parenti yoktur.
        //farkli data tipleri icin ortak bir variable olusturmak istediginizde data type olarak object kullaniriz,

    }
}

