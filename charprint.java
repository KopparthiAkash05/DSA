import java.util.*;
class charprint{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            System.out.println(ch);
        }
    }
}