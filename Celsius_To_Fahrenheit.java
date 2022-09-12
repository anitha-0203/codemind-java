import java.util.Scanner;
class Demo
{
    public static void main(String args[])
    {
        int C;
        Scanner sc=new Scanner(System.in);
        C=sc.nextInt();
        float F=(float)(9*C)/5+32;
        System.out.format("%.2f",F);
    }
}