import java.util.*;
public class MyClass{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int a1[]=new int[n];
        int sum[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum[i]=a[i]+a1[i];
        
                System.out.println(sum[i]); 
}
        
}
}


