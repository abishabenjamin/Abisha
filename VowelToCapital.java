import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        int count=0;
        for(int i=0;i<s.length();i++){
            int c=(int)s.charAt(i);
            if(c==97 || c==101 || c==105 || c==111 || c==117){
                count=c-32;
               s=s.replace(s.charAt(i),(char)count);  
               
            
        
       
    }
        }
         System.out.print(s+ " ");
    }
}





