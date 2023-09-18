package Practice06;

public class C01Encapsulation {
    /*
    bir class olusturun
    private access mod sahip variablelar olusturun: isim, soyisim, yas seklinde
    parametreli ve parametresiz constructor olusturun
    bu variablelara ait getter setter methodlarını olusturun
    toString methodunu olusturun
     */


    private String isim;
    private String soyIsim;
    private int yas;

    public C01Encapsulation() {
    }

    public C01Encapsulation(String isim, String soyIsim, int yas) {
        if(isim.charAt(0)>='A' && isim.charAt(0)<='Z')
            this.isim = isim;
        else
            System.out.println("Lütfen ilk harfi büyük giriniz");
        this.soyIsim = soyIsim;
        if(yas>0)
        this.yas = yas;
        else
            System.out.println("Yaş değeri negatif olamaz!");

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        if(isim.charAt(0)>='A' && isim.charAt(0)<='Z')
            this.isim = isim;
        else
            System.out.println("Lütfen ilk harfi büyük giriniz");
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas>0)
        this.yas = yas;
        else
            System.out.println("Yaş değeri negatif olamaz!");
    }

    @Override
    public String toString() {
        return "C01Encapsulation{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", yas=" + yas +
                '}';
    }
}
