package day17Oop;

public class Vehicle {
    /*
    Child classdan bir object olusturdugunuzda constructorlar
    en ustteki parent classtan baslatilarak alta doğru calistiriliri

    child class taki constructor dan parent class taki cons.a gidebilmek
    için super() kullanılır
    Parent class ta birden fazla constructor varsa
    istenilen constructor super() ifadesinin içne yazılan parametre ile seçilebilir.

    Aynı class içindeki cons.iarı seçmek için this() kullanılır
    birden fazla cons. varsa this() parantezi içine gerekli parametre yazılır
    super() ifadesi isteğe bağlı yazılır. ama okunur olması için yazılması tavsiye edilir

    super() ve this() ifadeleri constructor içinde
    her zaman ilk satırda olmalıdır
    super() ve this() ifadeleri constructor içinde sadece bir kez kullanılır

    Inheritance da variable ve metotları çağırmak için this veya super kullanılır

    this aynı class içindeki variable ve metotları çağırmak için
    super parent class içindeki  variable ve metotları çağırmak için kullanılır





     */



    public Vehicle(){
        this(1000);
        System.out.println("Vehicle 1");
    }
    public Vehicle(int price){

        System.out.println("Vehicle 2");
    }
}
