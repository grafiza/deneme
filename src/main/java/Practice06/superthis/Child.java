package Practice06.superthis;

public class Child extends Parent{
    // Parent isminde bir class olusturunuz
    // Child class'ı, Parent class'a extends ediniz
    // Child class'da parametresiz, tek parametreli ve iki parametreli obje olusturunuz.
    // super() constructor'u kullanarak Parent' den ekran cıktısı alınız

    public Child(){
        System.out.println("Child class parametresiz constructor");
    }
    public Child(int a){
        super(34,4);
        System.out.println("Child class tek parametreli constructor");
    }
    public Child(int a,int b){
        this(15);
        System.out.println("Child class iki parametreli constructor");
    }

    public static void main(String[] args) {
        //Child child=new Child();
        Child child1=new Child(34);
        Child child2=new Child(34,3);

    }
}
