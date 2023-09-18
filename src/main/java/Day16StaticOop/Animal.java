package Day16StaticOop;

public class Animal {
      /*
    OOP conceptin 4 tane prensibi vardir
    1) Inheritance
    2) Polymorphism
    3) Encapsulation
    4) Abstraction

        1) Inheritance
        ozellikleri bir classtan diger classlara alan bir kavramdir, bunun javadaki karsiligi sudur:
        siz bir class olusturacasiniz ama daha once olusturulmus bir class sizin istediginiz ozelliklerin bircogunu kapsiyor
        o zaman yeni olusturdugunuz classi ozelliklerini kullanmak istediginiz class a child yapmalisiniz

        1) Inharitance in faydalari
            a) Code tekrarlarindan kurtuluruz
            b) Code tamiri(maintenance) kolay olur
            c) Chilt class lari daha atomic yapmis oluruz
        2) Bir classi baska bir classin child classi yapmak icin extends keyword kullanilir
        3) Child class objectleri Parent Class dan method ve variable lari kullanabilirler
        4) Parent class objectleri chlid class dan method ve variable lari kullanamazlar


     */

    public void eat(){
        System.out.println("Animals eat..");
    }
    public void drink(){
        System.out.println("Animals drink..");
    }


}
