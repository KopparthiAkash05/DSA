import java.util.*;
class csubarraytarget{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int tar=s.nextInt();
        boolean f=false;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=a[j];
                if(sum==tar)
                {
                    System.out.println("Subarray found from index "+i+" to "+j);
                    f=true;
                    break;
                }
            }
            if(f) break;
        }
        if(!f) System.out.println("No subarray sum for target");
    }
}