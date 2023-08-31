package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class VarArgs {
    public static void main(String[] args) {
        int toplam=topla(44,3,2,54,3);
        System.out.println(toplam);
    }
    public static int topla(int... a) {
        int sum = 0;
        for (Integer w:a) {
            sum+=w;
        }
        return sum;
    }
//1) Bir method parantezinde birden fazla varargs kullanilmaz
    //2) Bir method parantezinde birden fazla parametre kullanilacaksa Varargs en sonda olmalidir


    //Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
    //Bu yapiya Varargs diyoruz
    //Varargs arka planda Array yapisini kullanir

    //toplama islemi yapan bir method olusturun
}
