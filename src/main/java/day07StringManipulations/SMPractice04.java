package day07StringManipulations;

public class SMPractice04 {
    public static void main(String[] args) {
        //Ornek : Bir string'in belirli bir karakterinden baslayarak belirli bir karaktere kadar tum
        // karakterleri dynamic olarak aliniz
        //abc@gmail.com ===> gmail
        //indexOf("@") methodu parantez icine yazilan characterin ilk gorunumunun indexini verir

        String mail="abc@gmail.com";

        String newMail1=mail.substring(4,9);
        System.out.println(newMail1);


        int startIndex=mail.indexOf("@")+1;
        int endIndex=mail.indexOf(".");

        String newMail2=mail.substring(startIndex,endIndex);
        System.out.println(newMail2);

    }
}
