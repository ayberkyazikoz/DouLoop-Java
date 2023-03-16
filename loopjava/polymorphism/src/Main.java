public class Main {
    public static void main(String[] args) {
        OgrenciKrediManager ogrenciKrediManager=new OgrenciKrediManager();
        System.out.println(ogrenciKrediManager.hesapla(1000));
        BaseKrediManager baseKrediManager=new BaseKrediManager();
        System.out.println(baseKrediManager.hesapla(1000));


    }
}