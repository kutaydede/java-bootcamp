package methods2;

public class Main {
    public static void main(String[] args) {
        int toplam = topla(1,3,5,7,9,11);
        System.out.println(toplam);
    }
    public static int topla(int... sayilar){
        int toplam = 0;
        for (int sayi:sayilar){
            toplam += sayi;
        }
        return toplam;
    }
}
