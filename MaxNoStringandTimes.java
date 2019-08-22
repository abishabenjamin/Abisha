import java.util.*;
public class MyClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count1=0;
        String c="";
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.substring(i,i+1).equals(s.substring(j,j+1))){
                    count++;
                    if(count>count1){
                        count1=count;
                        c=s.substring(i,i+1);
                    }
                    }   
            }
        }
                    System.out.print(count1+" "+c);
    }
}
