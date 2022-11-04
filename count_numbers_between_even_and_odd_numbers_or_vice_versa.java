import java.util.*;
class main
{
    public static void main(String args[])
    {
        int n,k,l=0,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
       for(int i=0;i<n-2;i++)
    {
     if(((a[i]%2)==0))
     {
         if(((a[i+2]%2)!=0))
     {
         count++;
     }
     }
     if(((a[i]%2)!=0))
     {
         if(((a[i+2]%2)==0))
     {
         count++;
     }
    }
    }
        System.out.print(count);
    }
}