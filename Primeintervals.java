import java.util.Scanner;
public class Primeintervals{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
while(a<b){
boolean c=false;
for(int i=2;i<a/2;i++){
if(a%i==0){
c=true;
break;
}
}
if(!c)
System.out.print(a+" ");
a++;

}
}
}
