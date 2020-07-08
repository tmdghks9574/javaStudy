import java.util.Arrays;
import java.util.Scanner;

public class Study {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] argc) {
        int T;
        T = scan.nextInt();
        while(T > 0)
        {
            int n,m;
            n = scan.nextInt();
            m = scan.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];
            for(int i = 0; i < n; i++)
                arr1[i] = scan.nextInt();
            for(int i = 0; i < m; i++)
                arr2[i] = scan.nextInt();

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int i = 0, j = 0;
            while(i != n && j != m)
            {
                if(arr1[i] > arr2[j])
                    j++;
                else if(arr1[i] < arr2[j])
                    i++;
                else
                    j++;
            }
            if(i == n)
                System.out.println("B");
            else if(j == m)
                System.out.println("S");
            else
                System.out.println("C");
            T--;
        }
    }
}