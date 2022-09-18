package odev14;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String mesaj = ("    Bugün hava çok güzel  ");

        String yenimesaj = mesaj.replace(' ','-');
        System.out.println( yenimesaj);
        System.out.println(mesaj.substring(2,5));

        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());


    }
}
