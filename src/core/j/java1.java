package core.j;

import java.util.Scanner;

public class java1 
{
double p,t,r;
double si, ci;
java.util.Scanner s;
   void input()
   {   s=new Scanner(System.in);
	   System.out.println("Enter principal Amount");
	   p=s.nextDouble();
	   System.out.println("Enter no of years");
	   t=s.nextDouble();
	   System.out.println("Enter Rate of Interest");
	   r=s.nextDouble();
	   
   }
   void compute()
   {    si=(p*t*r)/100;
        ci=p*Math.pow(1+(r/100), t);
   }
   void display()
   {
	   System.out.println("Simple Interest is:"+si);
	   System.out.println("Compound Interest is:"+ci);
	   
   }
      

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        java1 j=new java1();
        j.input();
        j.compute();
        j.display();
        
	}

}
