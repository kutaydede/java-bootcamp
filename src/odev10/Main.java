package odev10;

public class Main{
    public static void main(String[] args) {

        String[]ogrenciler = new String[4];

        ogrenciler[0]="Kutay";
        ogrenciler[1]="Turgay";
        ogrenciler[2]="Tülay";
        ogrenciler[3]="Mehmet";

        for (int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("++++++++++++++++++++++++");

        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
