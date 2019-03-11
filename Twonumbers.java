import java.util.Scanner;
public class Twonumbers{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int q=sc.nextInt();
    for(int i=n;i<=q;i++){
        if(i%2!=0){
            n=i;
        
         System.out.print(n + " ");
        }
    }
   
  
  }
}
