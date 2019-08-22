import java.util.*;
public class OTPGenerator{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    long number=sc.nextLong();
    String account=sc.next();
    String one=account.substring(0,2);
    String s1=Long.toString(number);
    String two=s1.substring(0,1);
    int three=0,sum=0,sum1=0;
    int five=0;
for(int i=0;i<5;i++){
    int value=Integer.parseInt(s1.substring(i,i+1));
     sum+=value;
}
three=((sum/10)+(sum%10));
String four=name.substring(0,1);
for(int i=5;i<10;i++){
       int value1=Integer.parseInt(s1.substring(i,i+1));
        sum1+=value1;
}
five=((sum1/10)+(sum1%10));
String six=name.substring(name.length()-1);
String seven=s1.substring(s1.length()-1);
 System.out.println(one+two+three+four+five+six+seven);
}
    
}
