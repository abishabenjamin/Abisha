import java.util.Scanner;
public class Prime{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  boolean b=false;
  for(int i=2;i<n/2;i++){
  if(n%i==0){
  b=false;
  break;
  }
  }
  if(!b){
  System.out.println("yes");
  }
  else{
  System.out.println("no");
  }
  }
  }
