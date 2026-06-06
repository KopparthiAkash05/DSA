import java.util.*;
class reversestring{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            System.out.print(ch);
        }
    }
}