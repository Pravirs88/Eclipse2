package abstraction;

public class IcicBank extends AllDetails {
	public  void name1(){
		
		System.out.println("my name is pravir");
	}
	public void mobileNo2() {
		System.out.println("my moblie no is 8866105442");
	}
	public void account1() {
		System.out.println("my account no is 233414656245");
	}
	
	public void aadharNo() //abstracted from alldetails class
	{
		System.out.println("my aadhar no is 531688759591");
		
	}
	public static void main(String[] args) {
		IcicBank n=new IcicBank();
		n.name1();
		n.mobileNo2();
		n.account1();
		n.aadharNo();
	}
	
}
