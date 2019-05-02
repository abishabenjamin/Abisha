import java.util.Scanner;
public class Armstrong2intervals {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int n = n1 + 1; n < n2; ++n) {
            int dig = 0;
            int sum = 0;
            int num = n;
            while (num != 0) {
                num /= 10;
                ++dig;
            }

            num = n;

            while (num != 0) {
                int rem = num % 10;
                sum += Math.pow(rem, dig);
            num /= 10;
            }

            if (sum == n)
                System.out.print(n + " ");
        }
    }
}


