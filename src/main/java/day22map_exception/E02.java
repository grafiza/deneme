package day22map_exception;

public class E02 {
    public static void main(String[] args) {
        String s="1234a";
        convertStringToInt(s);

    }
    public static void convertStringToInt(String s){
        try{
            int number=Integer.valueOf(s);
            System.out.println(number+1);
        }catch (NumberFormatException e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        
    }
}
