package day22map_exception;

public class E04 {
    public static void main(String[] args) {
        String [] dizi={"j","a","v","a"};
        print(dizi,7);
    }

    private static void print(String[] s,int i) {
        try {
            System.out.println(s[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }
}
