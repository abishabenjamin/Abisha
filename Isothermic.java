import java.util.*;
public class MyClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        Map<Character,Character> m=new HashMap<Character,Character>(0);
        boolean b=true;
        if(s1.length()==s2.length()){
            if(s1.equals(s2)){
                System.out.println(b);
            }
        else{
            for(int i=0;i<s1.length();i++){
                char c1=s1.charAt(i);
                char c2=s2.charAt(i);
                if(m.containsKey(c1)){
                    if(m.get(c1)!=c2){                                       
                    b = false;
                    break;
                    }
                }
                else {
                    if(m.containsKey(c2)){
                    b = false;
                    break;
                }
                else{
                    m.put(c1,c2);
                    b = true;
                }
            }
        }
        if(b){
            System.out.print(b);
        }
        else{
            System.out.println(b);
        }
        }
        }
        else{
            System.out.println(b);
        
}
    }
}
