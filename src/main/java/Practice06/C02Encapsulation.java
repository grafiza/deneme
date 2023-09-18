package Practice06;

public class C02Encapsulation  {
    //Ali, Can, 25 ozelliklerine sahip bir obje olusturunuzz ve yazdırınız
    //objenin yasını 30 olarak guncelleyin
    //parametresiz cons kullanarak 2. bir obje olusturun
    //Ayse, Yilmaz, 40 degerlerini atayın
    //yas ı -5 olarak guncelleyin
    //yas negatif deger alamayacak sekilde set methodunu guncelleyin
    //isim kucuk harfle baslamayacak sekilde set methodunu guncelleyin
    //isim kucuk harfle baslamayacak sekilde parametreli constructoru guncelleyin
    public static void main(String[] args) {
        C01Encapsulation std=new C01Encapsulation("Ali","Can",25);
        System.out.println(std.getIsim());
        System.out.println(std.getSoyIsim());
        System.out.println(std.getYas());
        System.out.println(std);// toString metodunu over ride ettiğimiz için objeyi yazdırdı. Yoksa referans yazacaktı

        std.setYas(30);;
        System.out.println(std.getYas());

        C01Encapsulation std1=new C01Encapsulation();
        std1.setIsim("ayşe");
        std1.setSoyIsim("Yılmaz");
        std1.setYas(40);

        System.out.println(std1);
        std1.setYas(-5);



    }

}
