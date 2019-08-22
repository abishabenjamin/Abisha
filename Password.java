import java.util.*;
public class MyClass {
   public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       boolean flag=false;
       int count=0,count1=0;
       a:
       if(str.length()>=8&&str.length()<=10)
       {
          for(int i=0;i<str.length();i++)
          {
           int asc=(int)str.charAt(i);
           if(asc>=48&&asc<=57||asc>=65&&asc<=90||asc>=97&&asc<=122)
           {
               ++count;
           }
          }
       if(count==str.length())
           {
               for(int i=0;i<str.length();i++)
               {
                 int asc=(int)str.charAt(i);
                 if((asc>=65&&asc<=90)||(asc>=47&&asc<=58))
                 {
                     count1++;
                 }
               }
                 if(count1>=2)
                 {
                    flag=true;
                    break a;
                  }
               }
          }
       if(flag==true)
       {
           System.out.println("Valid Password");
       }
       else
       {
           System.out.println("Invalid Password");
       }
   }
}
