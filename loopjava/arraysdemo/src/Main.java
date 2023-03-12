public class Main {
    public static void main(String[] args) {
        int table[][] = new int[3][3];
        for(int i = 0; i < 3 ; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(i == j)
                {
                    table[i][j] = 2;
                }
                else if(i - j == 1 || j - i == 1)
                {
                    table[i][j] = 1;
                }
                else
                    table[i][j] = 0; //köşegene yakın sayıları büyük olan matris
            }
        }
        for(int i = 0; i < 3 ; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }

    }
}