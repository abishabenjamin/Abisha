import java.util.*;
public class Hashset{
    public static void main(String args[]){
        HashSet<String> hs=new HashSet();
        hs.add("abi");
        hs.add("kavi");
        hs.add("jayanthi");
        hs.add("benjamin");
        hs.add("abi");

        Iterator i=hs.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
