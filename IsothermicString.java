import java.util.*;
public class MyClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
String s=sc.next();
String s1=sc.next();
int count=0,count1=0;
for(int i=0;i<s.length()-1;i++)
{
if(s.charAt(i)==s.charAt(i+1))
{
count++;
}
}
for(int i=0;i<s1.length()-1;i++)
{
if(s1.charAt(i)==s1.charAt(i+1))
{
count1++;
}
}
if(count==count1)
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
    }
}
