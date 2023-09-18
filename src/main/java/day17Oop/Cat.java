package day17Oop;

public class Cat extends Animal{
    public void meow(){
        System.out.println("Cats meow");
    }

    @Override //override annotation override kurallarını java tarafından kontrol edilmesini sağlıyor
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink");
    }
}
