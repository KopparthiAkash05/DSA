import java.util.*;
class freqchar{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        HashMap<Character,Integer> n=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(n.containsKey(ch))
            {
                n.put(ch,n.get(ch)+1);
            }
            else
            {
                n.put(ch,1);
            }
        }
        for(char ch:n.keySet())
        {
            System.out.println(ch+": "+n.get(ch));
        }
    }
}