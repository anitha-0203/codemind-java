import java.util.*;
class Pattern
{
   public static void main(String args[])
   {
       int i,j,n;
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter the no of lines");
        n=sc.nextInt();
        for(i=n;i>=1;i--)
        {
             for(j=1;j<=i;j++)
             {
                  System.out.print((char)(i+64)+" ");
             }
             System.out.println("");
        }
   }
} 
