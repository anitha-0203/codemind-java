13/08/2022
 1)Program to implement simple calculator by using switch case.
Input:
12 15
+ ---> Addition
- ---> Substraction
* ---> Mutiplication
/ ---> Division
% ---> Modulus
Enter your Choice
+

output:
27
_________________________________________________________________________________________

Switch
      until 1.4version the allow types for the switch argument are byte,short,char,int
but from 1.5 version on words the corresponding wrapper classes (Byte,short,Character,
Integer) and "enum" types also allowed.

-->Curly braces are mandatory.(except switch casse in all remaining cases curlu=y 
braces are optional.
-->Both cases and default are optional.
-->Every statement inside switch

CASE LABLE
1)should be compile time constant.
2)expression also allowed but should be compile time constant expression.
3)value should be with in the range of switch argument type.
4)duplicate case lable are not allowed.
_________________________________________________________________________________________
nested

syntex:
=========
      if(condition1)
      {
         if(condition2)
         {
           
         }
         else
         {
         }
      }
      else
      {
        if(condition3)
        {
        }
        else
        {
        }
      }

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

18/08/2022

For loop:
  For (initialization;condition;incr/der)
  {
   //block of statements
  }
Looping Statement:
These are the statements used to execute a block of statement repeatedly for some number
of times.
1)for
2)while
3)do while 
 
1)for loop:
   for (initialization;condition;incr/der)
  {
   //block of the loop
  }
_________________________________________________________________________________________
import java.util.Scanner;
class Loop1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String name;
name=sc.nextLine();
int i;
for(i=1;i<=10;i=i+1)
{
System.out.println(name);
}
System.out.println("Task Completed");
sc.close();
}
} 
_________________________________________________________________________________________

import java.util.Scanner;
class Loop2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i;
for(i=1;i<=100;i=i+1)
{
System.out.println(i);
}
System.out.println("Task Completed");
sc.close();
}
} 
_________________________________________________________________________________________

import java.util.Scanner;
class Loop3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);                    
int i;
for(i=1;i<=100;i=i+1)
{
if(i%2==1){
System.out.println(i);
}
}
System.out.println("Task Completed");
sc.close();
}
} 
_________________________________________________________________________________________

import java.util.Scanner;
class Loop4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i;
for(i=1;i<=100;i=i+1)
{
if(i%2==1 || i%3==0)
System.out.println(i+" ");
}
System.out.println("Task Completed");
sc.close();
}
} 
_________________________________________________________________________________________

import java.util.Scanner;
class Loop5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int i;
for(i=1;i<=12;i=i+1)
{
System.out.println("5 X "+i+" = "+(5*i));
}
System.out.println("Task Completed");
sc.close();
}
} 
_________________________________________________________________________________________

import java.util.Scanner;
class Loop6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i;
for(i=1;i<=100;i=i+1)
{
if(i%2==1 || i%3==0)
System.out.println(i+" ");
}
}
System.out.println("Task Completed");
sc.close();
}
} 
_________________________________________________________________________________________
import java.util.Scanner;
class SumofNumbers1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
for(int i=1;i<=n;i++)
{
sum=sum+i*i*i;
}
System.out.println(sum);
sc.close();
}
}
_________________________________________________________________________________________

import java.util.Scanner;
class SumofNumber2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
for(int i=1;i<=n;i++)
{
sum=sum+i*i*i;
}
System.out.println(sum);
sc.close();
}
}
_________________________________________________________________________________________

import java.util.Scanner;
class Loop
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
for(int i=1;i<=n;i++)
{
sum=sum+(int)Math.pow(i,3);
}
System.out.println(sum);
sc.close();
}
} 
_________________________________________________________________________________________

import java.util.Scanner;
class Loop
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int prod=1;
for(int i=2;i<=n;i=i++)
{
prod=prod*1;
}
System.out.println(prod);
sc.close();
}
} 
------------------------------------------------------------------------------------------------------------------------------------------------

20/08/2022

LCM
import java.util.Scanner;
class LCM
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,max,lcm;
a=sc.nextInt();
b=sc.nextInt();
if(a>=b)
max=a;
else
max=b;
for(int i=max; ;i++)
{
   if(i%a==0 && i%b==0)
    {
      lcm=i;
      break;
    }
}
System.out.println(lcm);
sc.close();
}
}
_________________________________________________________________________________________

GCD
import java.util.Scanner;
class Sample
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int a,b,min,gcd=0;
      a=sc.nextInt();
      b=sc.nextInt();
      if(a<b)
      min=a;
      else
      min=b;
      for(int i=min;i>0;i--)
      {
          if(a%i==0 && b%i==0)
          {
             gcd=i;
             break;
          }
      }
      System.out.println(gcd);
      sc.close();
   }
}
-------------------------------------------------------------------------------------------------------------------------------------------------

25/08/2022

import java.util.Scanner;
class MethodsDemo
{
public static void add(int x,int y)
{
int c;
c=x+y;
System.out.println(c);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
add(a,b);
System.out.println("Completed");
}
}
_________________________________________________________________________________________

import java.util.Scanner;
class MethodsDemo
{
public static void add(int x,int y)
{
int c;
c=x+y;
System.out.println(c);
}
public static int sum(int x,int y)
{
return(x+y);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
add(a,b);
c=sum(a,b);
System.out.println(c);
System.out.println("Completed");
}
}
_________________________________________________________________________________________

import java.util.Scanner;
class FactorCount
{
public static int findFactor(int n)
{
int count=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
     count++;
}
return count;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,result;
n=sc.nextInt();
result=findFactor(n);
System.out.println(result);
}
}
_________________________________________________________________________________________

FACTOR COUNT

import java.util.Scanner;
class FactorCount
{
    public static int findFactor(int x)
    {
        int sum=0;
        for(int i=1;i<=x/2;i++)
        {
            if(x%i==0)
                 sum=sum+i;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,result;
        n=sc.nextInt();
        result=findFactor(n);
        System.out.println("True");
        else
        System.out.println("False");
    }
}
_________________________________________________________________________________________

COUNT DIVISOR

import java.util.Scanner;
class FactorCount
{
    public static int findDivisor(int m,int n,int k)
    {
        int count=0;
        for(int i=m;i<=n;i++)
        {
            if(i%k==0)
                 count++;
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int start,end,k,result;
        start=sc.nextInt();
        end=sc.nextInt();
        k=sc.nextInt();
        result=findDivisor(start,end,k);
        System.out.println(result);
    }
}
