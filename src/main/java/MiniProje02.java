import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MiniProje02 {


/*

    Kullanıcıdan aldığınız bir sayi kadar satır ve sütun sayısına sahip alttaki rastgele 0 ve 1'lerden oluşan matriksi yazdırın.

    Input: 10

    Output:
            1 0 0 1 1 0 0 0 1 1
            0 0 1 0 1 0 1 0 0 0
            0 1 0 1 0 0 0 0 0 1
            1 1 1 0 0 0 0 1 1 1
            1 1 0 1 1 1 0 1 0 0
            1 0 0 0 1 1 0 0 0 0
            0 0 1 0 0 0 0 1 1 1
            1 1 0 1 0 1 0 0 1 0
            0 0 1 0 0 0 0 1 1 0
            1 1 1 0 0 1 1 1 1 0

 */


    public static void main(String[] args) {

        int p;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of the matrix dimension:");
        p = obj.nextInt();



        Random r=new Random();
        int[][] a=new int[p][p];
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<p;j++)
            {
                a[i][j]=r.nextInt(2);
                System.out.print(a[i][j]+"\t");
            }

            System.out.print("\n");
        }


    }
}