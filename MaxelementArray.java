
      import java.util.*;
public class MaxelementArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        
    for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
    }
       int m = a[0];
    for(int i=0;i<a.length;i++){
         if(a[i]>m){
         m=a[i];
         }
    }
System.out.print(m);

}
}




