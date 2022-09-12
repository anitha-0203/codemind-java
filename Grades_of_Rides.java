import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int hurl,spin,speed;
        hurl=s.nextInt();
        spin=s.nextInt();
        speed=s.nextInt();
        if(hurl>50&&spin>60&&speed>100)
        {
            System.out.println("10");
        }
        else if(hurl>50&&spin>60)
        {
            System.out.println("9");
        }
        else if(spin>60&&speed>100)
        {
            System.out.println("8");
        }
        else if(hurl>50&&speed>100)
        {
            System.out.println("7");
        }
        else if(hurl>50||spin>60||speed>100)
        {
            System.out.println("6");
        }
        else
        {
            System.out.println("5");
        }
    }
}