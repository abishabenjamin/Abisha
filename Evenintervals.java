import java.util.Scanner;
public class Evenintervals{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=0;
int d=a+1;
for(int i=d;i<b;i++){
if(i%2==0){
c=i;
System.out.print(c + " ");
}
}
}
}
