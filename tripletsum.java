import java.util.*;
class tripletsum{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int target=s.nextInt();
        Arrays.sort(a);
        boolean f=false;
        for(int i=0;i<n-2;i++)
        {
            int l=i+1;
            int r=n-1;
            while(l<r)
            {
                int sum=a[i]+a[l]+a[r];
                if(sum==target)
                {
                    System.out.println("("+a[i]+", "+a[l]+", "+a[r]+")");
                    f=true;
                    l++;
                    r--;
                }
                else if(sum<target) l++;
                else r--;
            }
        }
        if(!f) System.out.println("No triplets found");
        
    }
}