package Practice05.inheritance02;

public class Opel extends Araba{
    String hiz="Opel arabalar max 220 km/h yapar";
    String marka="Opel";
    String sirketMerkezi="Almanya";

    @Override
    protected void motor() {
        System.out.println("Opel in motorları fena değil");
    }
    protected void garanti(){
        System.out.println("opel arabalar 2 yıl garantilidir.");
    }

}
