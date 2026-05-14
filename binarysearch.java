import java.util.*;
class binarysearch{
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
        int key=s.nextInt();
        int c=0;
        while(f<=l)
        {
            if(a[f]==key)
            {
                System.out.print("It is found at index of "+f);
                c++;
                break;
            }
            else if(a[f]<key)
            {
                f++;
            }
            else {
                l--;
            }
        }
        if(c==0)
        {
            System.out.print("it is not found");
        }
        
    }
}