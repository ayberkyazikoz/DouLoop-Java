public class Main {
    public static void main(String[] args) {
        String str = "AyBeRk YaZıKoZ";
        char letter;
        for(int i=0; i<str.length(); i++)
        {
            letter=str.charAt(i);
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
            {
                letter += 32;
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
                letter -=32;
            }
            System.out.print(letter);
        }
    }
}//küçük harfi büyük büyük harfi küçük yapar(ascii tablosuna göre)