import java.util.*;
class linearsearch{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.print("Enter your key:");
        int key=s.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==key)
            {
               System.out.print(i);
               c++;
               break;
            }
        }
        if(c==0)
        {
            System.out.print("-1");
        }
        
    }
}