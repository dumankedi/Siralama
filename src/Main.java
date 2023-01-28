import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("İlk sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b = input.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        c = input.nextInt();
        if (a > b && a > c) {
            if (b > c) {
                System.out.println("Sıralama: " + a + ">" + b + ">" + c);
            } else {
                System.out.println("Sıralama: " + a + ">" + c + ">" + b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("Sıralama: " + b + ">" + a + ">" + c);
            } else {
                System.out.println("Sıralama: " + b + ">" + c + ">" + a);
            }
        }
        else{
            if(a>b){
                System.out.println("Sıralama: " + c + ">" + a + ">" + b);
            }
            else{
                System.out.println("Sıralama: " + c + ">" + b + ">" + a);
            }
        }
    }
}