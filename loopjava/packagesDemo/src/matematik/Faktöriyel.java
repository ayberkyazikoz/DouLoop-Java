package matematik;

public class Faktöriyel {
    public static int hesapla(int x)
    {
        int sonuc=1;
        for(int i=1;i<=x;i++)
        {
            sonuc*=i;
        }
        return sonuc;
    }
}
