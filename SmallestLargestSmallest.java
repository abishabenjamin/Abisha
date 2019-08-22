import java.util.*;
public class MyClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        if(s.length()<=s1.length()){
            System.out.print(s+s1+s);
        }
        else{
            System.out.print(s1+s+s1);
        }
    }
}
