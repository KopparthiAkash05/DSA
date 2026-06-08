import java.util.*;
class countwords{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int c=1;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==' ')
            {
                c++;
            }
        }
        System.out.print("Word count: "+c);
    }
}