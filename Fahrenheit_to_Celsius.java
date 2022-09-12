import java.util.Scanner;
class Demo
{
    public static void main(String args[])
    {
        int F;
        Scanner sc=new Scanner(System.in);
        F=sc.nextInt();
    float C=(float)(F-32)*5/9;
        System.out.format("%.2f",C);
    }
}