package odev17;

public class Main {
    public static void main(String[] args) {
        int number = 6;
        int totol = 0;

        for (int i=1 ; i<number ; i++){
            if (number % i == 0) {
                totol = totol+i;
            }
        }
        if (totol == number){
            System.out.println(number + " : Mükemmel sayı");
        } else {
            System.out.println(number + " : Mükemmel sayı değildir");
        }
    }
}
