import java.util.*;
class rvowels{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String res="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
            {
                res+=ch;
            }
        }
        System.out.print(res);
    }
}