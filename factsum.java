import java.util.*;
class factsum{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Factorial: "+fact(n));
        System.out.print("Sum: "+sum(n));
    }
    static int fact(int n)
    {
        if(n==0||n==1) return 1;
        return n*fact(n-1);
    }
    static int sum(int n)
    {
        if(n==0||n==1) return n;
        return n+sum(n-1);
    }
}