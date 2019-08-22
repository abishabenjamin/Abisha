import java.util.*;
public class MyClass{
    Vector<Object> a=new Vector<Object>();
    void printAll(){
    a.add("abi");
    a.add("kavi");
    a.add("athira");
    a.add(23);
    a.add(90.44);
    a.add(9847385);
    Iterator it=a.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }
    Enumeration e=a.elements();
    while(e.hasMoreElements()){
        System.out.println(e.nextElement());
    }
    }
    public static void main(String args[]){
     MyClass mc=new MyClass();
     mc.printAll();
    }
}


