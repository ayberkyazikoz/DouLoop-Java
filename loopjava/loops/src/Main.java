public class Main {
    public static void main(String[] args) {
        int dizi[]={1,2,3,4};

        for(int i=0;i<4;i++)
            System.out.println(dizi[i]+" ");

        System.out.println("\n");
        int j=0;
        while(j<4)
        {
            System.out.println(dizi[j]+" ");
            j++;
        }
        /*do while ile while'ın farkı do while da bir kere komutlar yapılır
        ve sonra döngü kontrolleri başlar.*/
    }
}