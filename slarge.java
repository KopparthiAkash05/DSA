import java.util.*;
class slarge{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int f=Integer.MIN_VALUE;
        int se=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]>f)
            {
                se=f;
                f=a[i];
            }
            else if(a[i]>se && a[i]!=f) {
                se=a[i];
            }
        }
        System.out.print("Second Largest: "+se);
    }
}