package methods;

public class Main {
    public static void main(String[] args) {
          sayibulmaca();
    }
    public static void sayibulmaca(){
        int [] sayilar = new int[]{1, 3, 5, 7, 9};
        int aranacak = 5;
        boolean varMi = false;

        for (int sayi : sayilar){
            if (sayi == aranacak){
                varMi = true;
                break;
            }

        }
        String mesaj = "";
        if (varMi){
           mesajVer(aranacak + " : Sayısı mevcuttur");

        }
        else {
            mesajVer(aranacak + " : Sayısı mevcut değildir");
        }

    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
