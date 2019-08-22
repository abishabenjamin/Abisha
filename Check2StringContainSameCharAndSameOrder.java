import java.util.*;
public class MyClass
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
      Set<Character> se1=new LinkedHashSet<Character>();
      Set<Character> se2=new LinkedHashSet<Character>();
        for(int i=0;i<s1.length();i++){
            se1.add(c1[i]);
        }
        for(int j=0;j<s2.length();j++){
            se2.add(c2[j]);
        }
        if(se1.equals(se2)){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}
