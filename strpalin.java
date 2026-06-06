import java.util.*;
class strpalin{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int l=0;
        int r=str.length()-1;
        boolean palin=true;
        while(l<r)
        {
            if(str.charAt(l)!=str.charAt(r))
            {
                palin=false;
                break;
            }
            l++;
            r--;
        }
        if(palin) System.out.print("Palindrome");
        else System.out.print("Not palindrome");
    }
}