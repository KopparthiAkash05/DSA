import java.util.*;
class allsubsetsstr{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        subsets(str,"",0);
    }
    static void subsets(String str,String cur,int i)
    {
        if(i==str.length())
        {
            System.out.print("\""+cur+"\"");
            return;
        }
        subsets(str,cur+str.charAt(i),i+1);
        subsets(str,cur,i+1);
    }
}