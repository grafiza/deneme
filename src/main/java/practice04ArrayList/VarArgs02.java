package practice04ArrayList;

public class VarArgs02 {
    public static void main(String[] args) {
        /*
        Bir okuldaki ogrencilerden ders secmesi isteniyor.
        Alınann ders saati sayısının 12'yi gecmemesi isteniyor.
        Buna gore;
        Asagida ders saatleri verilen derslerden istediginiz kadar secin.
        Sectiginiz bu derslerin saatleri toplamı 12'yi gecerse "Limiti astiniz";
        12'yi gecmezse "Islem basariyla tamamlandi" mesajini veren bir method olusturunuz
        Matematik :4 saat
        Geometri : 2 saat
        Fizik : 3 saat
        Kimya : 3 saat
        Biyoloji : 3 saat
        Edebiyat : 2 saat
        Tarih : 2 saat
        Cografya : 2 saat

         */
        int matematik =4;
        int geometri=2;
        int fizik=3;
        int kimya=3;
        int biyoloji=3;
        int edebiyat=2;
        int tarih=2;
        int cografya=2;

        dersSecimi(matematik,fizik,kimya,biyoloji);

    }

    private static void dersSecimi(int...dersler) {
        int toplam=0;
        for (Integer w:dersler             ) {
            toplam+=w;
        }
        if(toplam>12)
            System.out.println("Toplam kredi:"+toplam+"\nLimiti aştınız");
        else
            System.out.println("Toplam kredi:"+toplam+"\nİşlem başarıyla kaydedildi");
    }

}
