package reCapDemo;

public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.Toplam(5,6);
        System.out.println(sonuc);

        DortIslem dortIslem2 = new DortIslem();
        int sonuc2 = dortIslem.Carp(5,6);
        System.out.println(sonuc2);
    }
}
