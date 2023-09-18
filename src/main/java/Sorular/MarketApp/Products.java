package Sorular.MarketApp;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private List<String> products=new ArrayList<>();
    {
        this.products.add("00,Domates,2.10");
        this.products.add("01,Patates,3.20");
        this.products.add("02,Biber,1.50");
        this.products.add("03,Soğan,2.30");
        this.products.add("04,Havuç,3.10");
        this.products.add("05,Elma,1.20");
        this.products.add("06,Muz,1.90");
        this.products.add("07,Çilek,6.10");
        this.products.add("08,Kavun,4.30");
        this.products.add("09,Üzüm,2.70");
        this.products.add("10,Limon,0.50");
    }
    private List<String>sepet=new ArrayList<>();



   public void setSepet(List<String> sepet) {
       this.sepet = sepet;
   }



   public String urunAdiGetir(Integer id){
       return this.products.get(id).split(",")[1];
   }


   public boolean hesapla(List<String>sepet,double odenenTutar){
       double birimFiyat;
       double miktar;
       double toplamFiyat=0;
       System.out.println("Ürün ID\t\tÜrün Adı\t\tBirim Fiyatı\t\t"+"Miktar");
       for (String w:this.sepet         ) {
           int urunID=Integer.valueOf(w.split(",")[0]);
           birimFiyat=Double.valueOf(products.get(urunID).split(",")[2]);
           miktar=Double.valueOf(w.split(",")[2]);
           String urunAdi=w.split(",")[1];
           toplamFiyat+=birimFiyat*miktar;

           System.out.println(urunID+"\t\t\t"+urunAdi+"\t\t\t"+birimFiyat+"\t\t\t\t\t"+miktar);
       }

       System.out.println("Toplam \t\t\t:"+toplamFiyat);
       if(toplamFiyat>odenenTutar){
           System.out.println("Ödenen Tutar\t:"+odenenTutar);
           if (odenenTutar>0 && odenenTutar<toplamFiyat)
               System.out.println("Yetersiz Ödeme, lütfen tekrar deneyiniz");
           return false;

       }else{

           System.out.println("Ödenen Tutar\t:"+odenenTutar);
           System.out.println("Para Üstü\t\t:"+(odenenTutar-toplamFiyat));
           System.out.println("Teşekkürler. Yine Bekleriz");
           return true;
       }

    }
}