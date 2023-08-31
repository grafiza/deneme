package day07StringManipulations;

public class SMPractice06 {
    public static void main(String[] args) {
        //Example  Bir banka kartının son 4 hanesi hariç tüm hanelerini '*' kullanarak görünmez yapın
        //           1234 6789 1234 6789 ==> **** **** **** 6789
        
        String hesapNo="1234 6789 1234 6789";
        String newHesapNo=hesapNo.substring(0,15).replaceAll("[0-9]","*");
        String sonString=hesapNo.substring(hesapNo.length()-4);
        System.out.println("newHesapNo = " + newHesapNo+""+sonString);



    }
}
