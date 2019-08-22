import java.util.*; 

public class MyClass 
{
 
   public static void main(String args[])
{
       
 Scanner sc=new Scanner(System.in);
 
       String s=sc.nextLine();
       
 StringBuffer sb=new StringBuffer(s);
     
   sb.reverse();
       
 String ss=sb.toString();
      
  if(s.equals(ss)){
         
   System.out.print("palindrom");
  
      }
    
    else{
   
         System.out.print("not palindrom");
    
   }
   
 }

}


