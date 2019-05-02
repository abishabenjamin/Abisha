import java.util.Scanner;
public class Amstrong{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rem=0;
int sum=0;
int num;
num=n;
while(n != 0){
rem=n%10;
sum=sum+(rem*rem*rem);
n=n/10;
}
if(sum==num){
System.out.println("yes");
}
else{
System.out.println("no");
}
}
}
