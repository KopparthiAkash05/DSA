import java.util.*;
class RDstring{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String res="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(res.indexOf(ch)==-1) res+=ch;
        }
        System.out.println(res);
    }
}