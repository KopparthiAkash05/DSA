import java.util.*;
class Reverse{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int f=0,l=a.length-1;
        while(f<l)
        {
            int temp=a[f];
            a[f]=a[l];
            a[l]=temp;
            f++;
            l--;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}