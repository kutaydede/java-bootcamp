package odev7;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Döngü Bitti");

        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }

        for (int j=1;j<=10;j++) {
            if (j %4==0){
                System.out.println(j);
            }

        }

        int a =0;
        while (a>=-10){
            System.out.println(a--);
        }

    }
}
