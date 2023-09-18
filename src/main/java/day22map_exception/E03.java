package day22map_exception;

public class E03 {
    public static void main(String[] args) {
        String s="Java";
        getCharFromString(s,4);
    }

    private static void getCharFromString(String s,int idx) {
        try {
            char ch=s.charAt(idx);
            System.out.println(ch);
        }catch (StringIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
            System.out.println("kontrollü");
        }

    }

}
