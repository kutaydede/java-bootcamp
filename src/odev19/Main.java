package odev19;

public class Main {
    public static void main(String[]args){
        int[] sayilar = new int[]{0,2,4,6,8};
        int aranacak =(6);
        boolean varMi = false;

        for (int sayi : sayilar){
            if (sayi == aranacak){
                varMi = true;
            }
        }
        if (varMi){
            System.out.println(aranacak + " : Bu sayı mevcuttur");
        }
        else {
            System.out.println(aranacak + " : Bu sayı mevcut değildir");
        }
    }
}
