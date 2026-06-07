import java.util.*;
class FNRchar{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        for(int i=0;i<str.length();i++)
        {
            int c=0;
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    c++;
                }
            }
            if(c==1)
            {
                System.out.println("First non-repeating character:"+str.charAt(i));
                return;
            }
        }
        System.out.println("No non-repeating character found.");
    }
}