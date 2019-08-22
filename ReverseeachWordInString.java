import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner  sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s[]=str.split("\\s");
        for(int i=0;i<s.length;i++)
        {
            StringBuffer sb=new StringBuffer(s[i]);
            sb.reverse();
            System.out.print(sb+" ");
        }
      
    }
}
