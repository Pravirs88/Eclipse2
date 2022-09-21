package interface123;

public class Encapulation {

	
	private int balance;
	
	public int getballance() //getter  method
	{
		return balance;
		
	}
	public void setballance(int balance)  ///setter method
	{
		this.balance=balance;

	}
	public static void main(String[] args) {
		 Encapulation gs=new  Encapulation();
		 gs.setballance(10000);   ////setting value in balance
		System.out.println(gs.getballance()); ////getting value of balance
	}
	
}
