import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String a[]=s.split("\\s");
    String str=" ";
    for(int i=0;i<a.length;i++){
  str=a[i].substring(0,1).toUpperCase()+a[i].substring(1)+" ";
//   str=Character.toUpperCase(a[i].charAt(0)) + (a[i].substring(1)) + " ";
       
    
        System.out.print(str);
    }
    
    }
}
