package day22map_exception;

public class E07 {
    public static void main(String[] args) {
        printAge(43);
        printAge(-43);
    }

    private static void printAge(int age) {
        if(age<0){
            throw new IllegalArgumentException("age not be negative");

        }
        else
            System.out.println(age);
    }

}
