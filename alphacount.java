import java.util.*;
class alphacount{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int c=0;
        String str=s.next();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.toLowerCase().charAt(i);
            if(ch>='a' && ch<='z')
            {
                c++;
            }
        }
        System.out.print("Alphabet count: "+c);
    }
}