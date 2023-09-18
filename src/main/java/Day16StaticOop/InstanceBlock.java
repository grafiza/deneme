package Day16StaticOop;

public class InstanceBlock {
//instance block tum constructor larda bir kod calistirmaniz gerektiginde kullanilir
    //instance block tekrari önler

    public int year;

    public InstanceBlock() {

    }
    public InstanceBlock(int year) {

        this.year = year;
    }
// Burası instance block. tüm constructorlarda otoamtik çalışır
    {
        System.out.println("Hello world");
    }
}
