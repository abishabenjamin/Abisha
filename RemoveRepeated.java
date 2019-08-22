import java.util.*;
public class MyClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] s1=s.split("\\s");
        for(int i=0;i<s1.length;i++){
            if(s1[i]!=null){
                for(int j=i+1;j<s1.length;j++){
                    if(s1[i].equals(s1[j])){
                        s1[j]="";
                    }
                }
                           System.out.println(s1[i]);
            }
        }
       
    }
}

	

		
			
		
