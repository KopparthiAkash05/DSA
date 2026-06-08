import java.util.*;
class maxsubarraysum{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=s.nextInt();
        int max=a[0];
        int curr=a[0];
        for(int i=0;i<n;i++)
        {
            curr=Math.max(a[i],curr+a[i]);
            max=Math.max(max,curr);
        }
        System.out.print("Maximum Subarray Sum: "+max);
    }
}