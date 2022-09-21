package hirarchical;

public class Class9 extends Class7 {
	Class9(){                               //constructor inherits from super class only in constructor and it is top in class,no need to create obj
		super();
		System.out.println("my surname is salunkhe");
		
	}
public void method11() 
   {
	System.out.println("Enter valid date");
    }
public void method12() 
  {
	System.out.println("enter from mumbai to vishakhapattanam");	
  }
public void method13() 
  {
	
	System.out.println("book ticket for simhadri expresss");
	
  
  }

public static void main(String [] args) 
  {
	 Class9 m=new  Class9();
	 m.method7();
	 m.method8(9);
	 m.method14();
	 m.method11();
	 m.method12();
	 m.method13();
	
	 
  }
}
