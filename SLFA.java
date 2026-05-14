import java.util.*;
class SLFA{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int mini=99999;
        int maxi=-99999;
        for(int i=0;i<n;i++)
        {
            if(a[i]<mini)
            {
                mini=a[i];
            }
            if(a[i]>maxi)
            {
                maxi=a[i];
            }
        }
        System.out.println("Minimum = "+mini);
        System.out.println("Maximum = "+maxi);
    
    }
}