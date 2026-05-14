import java.util.*;
class removedup{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int j=0;
        int l=1;
        for(int i=1;i<n;i++)
        {
            if(a[i]!=a[j])
            {
                j++;
                a[j]=a[i];
                l++;
            }
        }
        for(int i=0;i<=j;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("Length of array is "+l);
        
    }
}