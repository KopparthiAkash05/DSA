import java.util.*;
class indicesfindsum{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int sum=s.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]+a[j]==sum)
                {
                    System.out.print("Indices: "+i+","+j);
                    return;
                }
            }
          
        }
          System.out.print("-1");
    }
}