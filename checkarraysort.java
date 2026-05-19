import java.util.*;
class checkarraysort{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int c=0;
        for(int i=1;i<n;i++)
        {
            if(a[i]<a[i-1])
            {
                c++;
            }
        }
        if(c==0) System.out.println("It is sorted array");
        else System.out.println("It is not a sorted array");
    }
}