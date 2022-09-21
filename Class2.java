package inheritance;

public class Class2 extends Class1{
public void Pravir(int a,int b) 
  {
	System.out.println("I have done BE from pune university");
  }

   public void Pravir(float c) 
   {
	   System.out.println("I have knowledge about Crane maintanance");
	  
   }
   
   public static void main(String[] args)    
   {
	   Class1 n=new Class2();//first have to done upcasting
	   Class2 s=(Class2) n;    //downcasting
	 s.Pravir();
	 s.Pravir(0);
	 s.Pravir(0, 0);
	 s.Pravir(2.5f);
	 Class1.pravir3();
}
}
