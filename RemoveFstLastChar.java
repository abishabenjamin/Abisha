import java.util.*;
public class MyClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.length()<=2){
            System.out.print(s);
        }
        else{
            for(int i=0;i<s.length();i++){
            }
                System.out.print(s.substring(1,s.length()-1));
            
        }
    }
}
