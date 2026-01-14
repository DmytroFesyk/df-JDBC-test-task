package mate.jdbc;

import java.util.*; import java.io.*;

public class myclass{

public static int X=0;
private String Name;

public myclass(String n){Name=n;}

public void DO_stuff(int a,int b){
    if(a==b) System.out.println("eq"); else System.out.println("neq");
    int t=42;
    List L=new ArrayList();
    L.add("1"); L.add(2);
    try{
        File f=new File("data.txt");
        if(!f.exists()) f.createNewFile();
        BufferedReader br=new BufferedReader(new FileReader(f));
        String s=null;
        while((s=br.readLine())!=null){
            if(s=="") {
                System.out.println("empty");
            }
        }
    }catch(Exception e){
        e.printStackTrace();
    }
}

public static void main(String[] args){
    myclass c=new myclass("bob");
    c.DO_stuff(1, 2);
    System.out.println(c.Name);
}}
