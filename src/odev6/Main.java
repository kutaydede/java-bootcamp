package odev6;

public class Main {
    public static void main(String[] args) {
        char grade ='A';

        switch (grade){
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;

            case 'B':
                System.out.println("Gayet iyi : Geçtiniz");
                break;

            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;

            case 'D':
                System.out.println("Fena değil : Geçtiniz");
                break;

                case 'F':
                System.out.println("Malesef kaldınız");
                break;
            default:
                System.out.println("Geçersiz not");
        }
    }
}
