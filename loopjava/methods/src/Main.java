public class Main {
    public static void main(String[] args) {
        int sayi=5;
        System.out.println(iterativefact(sayi)+" ");
        System.out.println(recursivefact(sayi));
    }
    public static int iterativefact(int sayi)
    {
        int fact=1;
        for(int i=2;i<=sayi;i++)
        {
            fact*=i;
        }
        return fact;
    }
    public static int recursivefact(int sayi)
    {
        if(sayi<=1)
            return 1;
        return (sayi*recursivefact(sayi-1));
    }
}//iterative ve recursive faktöriyel hesabı yapan fonksiyonlar