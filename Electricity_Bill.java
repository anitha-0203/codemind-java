import java.util.Scanner;
class Bill
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String id,name;
        int a;
        double bill;
        id=sc.nextLine();
        name=sc.nextLine();
        a=sc.nextInt();
        if(a>0&&a<200)
        {
            bill=(a*1.2);
        }
        else if(a>=200&&a<400)
        {
            bill=(a*1.5);
        }
        else if(a>=400&&a<600)
        {
            bill=(a*1.8);
        }
        else
        {
            bill=(a*2);
        }
        if(bill>400)
        {
            System.out.printf("%.2f",(bill+(bill*0.15)));
        }
        else
        {
            System.out.printf("%.2f",(bill+100));
        }
    }
}