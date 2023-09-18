package Practice05.Inheritance01;

public class Child extends Parent{
int yas=10;

    public static void main(String[] args) {
        Parent.method1();
        method1();
        method2();
        System.out.println(isim);
        isim="zafer";
        soyisim="kanbur";
        System.out.println(isim+" "+soyisim);
        Child c=new Child();
        c.yas=12;
        System.out.println(c.yas);
        c.method3();
        c.method4();
        Parent p=new Parent();
        System.out.println(p.yas);
        p.method3();
        p.method4();
    }
}
