public class Main {
    public static void main(String[] args) {
        int[] sayilar=new int[]{1,2,5,7,9,0};
        int aranacak=5;
        int sayac=0;
        int i;
        for(i=0;i<sayilar.length;i++)
        {
            if(sayilar[i]==aranacak)
            {
                sayac=1;
                break;
            }
        }
        if(sayac==0)
            System.out.println("Aranan deger bulunmamaktadır.");
        else
            System.out.println("Aranan deger " + (i+1) + ". elemandadir.");
    }
}