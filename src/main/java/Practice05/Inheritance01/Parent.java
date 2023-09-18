package Practice05.Inheritance01;

public class Parent {
    // Parent class'da isim, soyisim adında static variable olusturalım,
    // method1 ve method2 adında static methodlar olusturalım
    // yas adında instance variable olusturalım
    // method3 ve method4 adında instance methodlar olusturalım
    // olusturdugumuz variable ve methodları Child class'dan extends(inharitance) ederek cagıralım
    public static String isim="Zafer";
    public static String soyisim="Kanbur";
    public int yas=16;
    public static void method1(){
        System.out.println("Parent class static method 1");
    }
    public static void method2(){
        System.out.println("Parent class static method 2");
    }

    public void method3(){
        System.out.println("Parent class instance method 3");
    }
    public void method4(){
        System.out.println("Parent class instance method 4");
    }
}
