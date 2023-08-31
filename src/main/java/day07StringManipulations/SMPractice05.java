package day07StringManipulations;

public class SMPractice05 {
    public static void main(String[] args) {
        //Example  Bir String'deki tekrarsiz character'leri ekrana yan yana yazdiriniz.
        //           mehmet ==> ht
        //lastIndexOf("m") ==> m nin string deki son gorunumunun indexini verir.
        String name="mehmet";
        Boolean m=name.indexOf("m")==name.lastIndexOf("m");
        Boolean e=name.indexOf("e")==name.lastIndexOf("e");
        Boolean h=name.indexOf("h")==name.lastIndexOf("h");
        Boolean t=name.indexOf("t")==name.lastIndexOf("t");

        int t1=name.indexOf("t");
        int t2=name.lastIndexOf("t");

        System.out.println(t1+""+t2);


        String newName="";
        if(m)
            newName="m";
        if(e)
            newName=newName.concat("e");
        if(h)
            newName=newName.concat("h");
        if(t)
            newName=newName.concat("t");

        System.out.println(newName);

    }
}
