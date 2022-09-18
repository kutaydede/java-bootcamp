package odev15;

public class Main {
    public static void main(String[] args) {
        int number = 13;
        boolean isPrime = true;
        int kalan = number;

        if (number<2){
            System.out.println("Geçersiz sayı");
        }
        for (int i =2;i<=number;i++){
            if (number % 2==0){
                isPrime = false;
            }
        }
        if (isPrime){
            System.out.println( "Sayı asaldır.");
        }
        else {
            System.out.println("Sayı asal değildir.");
        }
    }
}
