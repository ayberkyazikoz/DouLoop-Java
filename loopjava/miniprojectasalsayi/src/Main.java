import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi;
        int sayac=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz:");
        sayi = input.nextInt();
        if(sayi == 1)
        {
            System.out.println("Girilen sayı asal değildir.");
            return;
        }
        for(int i = 2; i < sayi; i++)
        {
            if(sayi == 2)
                break;
            else if(sayi % i == 0)
            {
                sayac++;
                break;
            }
        }
        if(sayac == 0)
            System.out.println("Girilen Sayı asaldır.");
        else
            System.out.println("Girilen sayı asal değildir.");
    }
}