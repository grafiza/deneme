package Practice05.inheritance02;

public class Corsa extends Opel{
    String hiz="corsa max 200 km/h yapar";
    String yakit="Corsa arabalar benzinli veya elektriklidir.";
    String model="Corsa";

    @Override
    protected void motor() {
        System.out.println("Corsa arabalar çevreci motor kullanır");
    }

    @Override
    protected void yakitTuketimi() {
        System.out.println("Corsa yaklaşık 5.6 lt yakıt tüketir");
    }
    protected void vitesSayisi(){
        System.out.println("Corsalar 5 viteslidir");
    };

    public static void main(String[] args) {
        Corsa arb1=new Corsa();
        System.out.println(arb1.hareket);//araba
        System.out.println(arb1.hiz);//corsa
        System.out.println(arb1.yakit);//corsa
        System.out.println(arb1.marka);//opel
        System.out.println(arb1.sirketMerkezi);//opel
        System.out.println(arb1.model);//corsa
        arb1.motor();//corsa

        Opel arb2=new Corsa();// bir opel objesi oluşturduk
        System.out.println(arb2.hareket);//araba
        System.out.println(arb2.hiz);//opel
        System.out.println(arb2.yakit);//araba
        System.out.println(arb2.marka);//opel
        System.out.println(arb2.sirketMerkezi);//opel
        arb2.motor();//Opel
        arb2.garanti();//opel
        arb2.yakitTuketimi();//corsa
        //arb2.vitesSayisi(); ==> hata verir
        //arb2.model(); ==> hata verir
        Araba arb3=new Corsa();
        System.out.println(arb3.hareket);//araba
        System.out.println(arb3.hiz); //araba
        System.out.println(arb3.yakit);//araba
        System.out.println(arb3.marka);//araba
        arb3.yakitTuketimi();//corsa
        arb3.motor();//corsa

        Araba arb4 =new Opel();
        System.out.println(arb4.hiz);//araba

        /*
        inheritance da variiable lar aramaya data türü ne ise ordan başlar, yoksa parent a bakılır ve ilk bulduğu yerden getirir

        inheritance da metotlar aramaya data türü ne ise oraan başlar, yoksa parenta bakılır, ilk bulduğunu getirmez
        constructor un olduğu classa kadar override edilmiş mi diye kontrol eder ve son bulduğunu getirir.

        arama her zaman  aşağıdan yukarı doğrudur. yani child dan parent a doğru
        ama override kontrol her zaman yukarıdan aşağı doğrudur
         */
    }
}
