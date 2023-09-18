package day20Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {
        // interview sorusu
        // öğrenci e-mail adreslerini natural order'da sıralanmış olarak depolayınız

        long t1=System.nanoTime();
        System.out.println(t1);
        // 1. yol
        TreeSet<String> emails=new TreeSet<>();
        emails.add("abc@gmail.com");
        emails.add("xyz@gmail.com");
        emails.add("yandex@gmail.com");
        emails.add("kama@gmail.com");
        emails.add("werabc@gmail.com");
        emails.add("zaswe@gmail.com");
        System.out.println(emails);
        long t2=System.nanoTime();
        System.out.println(t2);
        //2. yol

        HashSet <String> emailsHs=new HashSet<>();
        emailsHs.add("abc@gmail.com");
        emailsHs.add("xyz@gmail.com");
        emailsHs.add("yandex@gmail.com");
        emailsHs.add("kama@gmail.com");
        emailsHs.add("werabc@gmail.com");
        emailsHs.add("zaswe@gmail.com");
        System.out.println(emailsHs);
        TreeSet<String> emailHsTs=new TreeSet<>(emailsHs);
        System.out.println(emailHsTs);
        long t3=System.nanoTime();
        System.out.println(t3);
    }
}
