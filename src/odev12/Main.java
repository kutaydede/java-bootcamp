package odev12;

public class Main {
    public static void main(String[] args) {
        String sehirler[][] = new String[3][3];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Kocaeli";
        sehirler[1][0] = "Samsun";
        sehirler[1][1] = "Ordu";
        sehirler[1][2] = "Giresun";
        sehirler[2][0] = "Ankara";
        sehirler[2][1] = "Konya";
        sehirler[2][2] = "Kırıkkale";

        for (int i = 0; i<=2; i++){
            System.out.println("+++++++++++++");
            for (int j = 0; j<=2; j++){
                System.out.println(sehirler[i][j]);
            }
        }

    }
}
