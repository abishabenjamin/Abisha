import java.util.*;
public class MyClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Set<String> se=new LinkedHashSet<String>();
        for(int i=0;i<s.length();i++){
            String s1=s.substring(i,i+1);
            se.add(s1);
            
        }
        System.out.println(se);
    }
}
