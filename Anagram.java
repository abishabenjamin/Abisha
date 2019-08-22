import java.util.*;
public class MyClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        boolean s=Arrays.equals(c1,c2);
        if(s)
        System.out.println("Anagram");
        else
        System.out.println("Not Anagram");
    }
}
