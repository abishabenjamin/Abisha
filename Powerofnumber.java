import java.util.Scanner;
public class Powerofnumber {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();
        int a=1;
        while(e!=0){
            a=a*n;
            e--;
        }
            System.out.println(a);

    }
}
