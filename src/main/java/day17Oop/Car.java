package day17Oop;

public class Car extends Vehicle{
    public Car(){
super();
        //this("model");
        System.out.println("Car 1");
    }
    public Car(String make){
        super();
        System.out.println("Car 2");
    }
    public String model="Accord";
    public int km=25000;
}
