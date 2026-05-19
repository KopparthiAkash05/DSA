import java.util.*;
class EOarray{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int c1=0,c2=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                c1++;
            }
            else c2++;
        }
        System.out.println("Even: "+c1);
        System.out.print("Odd: "+c2);
    }
}