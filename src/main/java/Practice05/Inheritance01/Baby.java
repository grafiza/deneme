package Practice05.Inheritance01;

public class Baby extends Child{
    int kilo=45;

    public static void main(String[] args) {
        method1();
        method2();
        System.out.println(isim);
        System.out.println(soyisim);
        Baby baby=new Baby();
        baby.method3();
        baby.method4();
        System.out.println(baby.yas);
        System.out.println(baby.kilo);

        Child child=new Child();
        System.out.println(child.yas);

    }
}
