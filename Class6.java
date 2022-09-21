package Multilevel;

public class Class6 extends Class5 {
public void method5() 
    {
	int a=90,b=10;int devide;
	devide=a/b;
	System.out.println("Division of values " +devide);
    }
       public void method6(int a,int b) 
       {
    	   int mod;
    	   mod= a%b;
    	   System.out.println("modulo of values "+ mod);
       }
       public static void main(String [] args) 
          {
    	   Class6 s= new Class6 ();
    	   s.mehod1();
    	   s.method2(17,18 );
    	   s.method3(4.9f);
    	   s.method4(10.6f, 11.0f);
    	   s.method5();
    	   s.method6(12, 15);
          }
}
