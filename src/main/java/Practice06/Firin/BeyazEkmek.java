package Practice06.Firin;

public abstract class BeyazEkmek implements Ekmek{
    // beyaz ekmek üretimi yok. bu nedenle metotları kullanmayacağımız için
    // abstract yaptık

    @Override
    public void un() {
        System.out.println("Beyaz ekmekler %59 un içerir");
    }

    @Override
    public void su() {
        System.out.println("Beyaz ekmekler %38 su içerir");
    }

    @Override
    public void maya() {
        System.out.println("Beyaz ekmekler %1,5 maya içerir");
    }
    public abstract void sekil();


}
