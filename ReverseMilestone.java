import java.util.*;
public class  MyClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();    
        String s1="";
        String s2="";
        String s3="";
        String s4="";
        String a[]=s.split("\\s");
        for(int i=0;i<a.length&&n!=0;i++){
          int n1=(n%10)-1;
            if(a[n1].length()%2 == 0){
                s1=a[n1].substring(a[n1].length()/2);
                s2=a[n1].substring(0,(a[n1].length()/2));
                StringBuilder sb=new StringBuilder(s2);
                sb=(sb.reverse());
                s1=s1+sb;
                
            }
            else{
                s3=a[n1].substring(a[n1].length()/2);
                s4=a[n1].substring(0,(a[n1].length()/2)+1);
                StringBuilder sb1=new StringBuilder(s4);
                sb1=sb1.reverse();
                s3=s3+sb1;
            }
         n=n/10;
        }
        System.out.println(s1+" "+s3);
    }
}
