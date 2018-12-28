import java.io.*;
import java.util.*;

public class MyClass {
    public static String eq="#";
    
    public static void check(String s1,String s2)
    {
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        int i=0,j=0;
        String t="";
        if(ch1[0]==ch2[0])
        {
            while(i<ch1.length && ch1[i]==ch2[i])
            {
                t=t+ch1[i];
                i++;
            }
        }
        if(t.length()>eq.length()) eq=t;
    }
    
    public static String find(String str)
    {
        String[] temp=new String[str.length()];
        for(int i=0;i<temp.length;i++)
          temp[i]="";
        
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            for(int j=i;j<ch.length;j++)
            {
                temp[i]=temp[i]+ch[j];
            }
        }
        Arrays.sort(temp);
        
        int i=0;
        while(i<temp.length-1)
        {
            check(temp[i],temp[i+1]);
            i++;
        }
        
        /*for(i=0;i<temp.length;i++)
        {
            System.out.println(temp[i]);
        }*/
        return eq;
    }
    
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s=find(str);
        System.out.println( s);
    }
}
