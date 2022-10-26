import java.util.Scanner;
class Sample
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 int r;
	 r=sc.nextInt();
	 float pi=3.14f,area;
	area=pi*r*r;
	 
	 System.out.println(area);
	 
	 sc.close();
  }

}