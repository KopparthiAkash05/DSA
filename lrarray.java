import java.util.*;
class lrarray{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            b[i]=a[i];
        }
        int k=s.nextInt();
        k=k%n;
        reverse(a,0,k-1);
        reverse(a,k,n-1);
        reverse(a,0,n-1);
        System.out.print("Left rotation: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        reverse(b,0,n-1);
        reverse(b,0,k-1);
        reverse(b,k,n-1);
        System.out.println();
        System.out.print("Right rotation: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
    }

    static void reverse(int a[], int start, int end){
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    
}