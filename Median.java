import java.util.Scanner;
public class Median 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
       
        n = s.nextInt();
        int a[] = new int[n];
        int b=0;
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            b =a[i]+ b;
          
        }
        System.out.print(b/n);
    }
}

