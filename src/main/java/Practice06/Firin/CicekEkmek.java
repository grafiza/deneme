package Practice06.Firin;

public class CicekEkmek extends BeyazEkmek{
    @Override
    public void sekil() {
        System.out.println("Çiçek ekmek çiçek şeklindedir");
    }

    @Override
    public void tuz() {
        System.out.println("Çiçek ekmek %1,5 tuz içerir");
    }
}
