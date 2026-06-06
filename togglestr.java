import java.util.*;
class togglestr{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String res="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                res+=Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch))
            {
                res+=Character.toUpperCase(ch);
            }
            else 
            {
                res+=ch;
            }
        }
        System.out.print(res);
    }
}