import java.util.*;
class anagram{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str1=s.next();
        String str2=s.next();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char a1[]=str1.toCharArray();
        char a2[]=str2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.equals(a1,a2))
        {
            System.out.println("Anagram");
        }
        else System.out.println("Not a anagram");
    }
}