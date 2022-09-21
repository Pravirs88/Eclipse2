package abstraction;

public class MaharashtraBank extends AllDetails {
	public  void name(){
		
		System.out.println("my name is pravir");
	}
	public void mobileNo() {
		System.out.println("my moblie no is 8866105442");
	}
	public void Account2() {
		System.out.println("my account no is 233416551616");
	}
	
	public void aadharNo() {
		
		System.out.println("my aadhar no is 531688759591");
		
	}
	public static void main(String[] args) {
		MaharashtraBank b=new MaharashtraBank();
		b.name();
		b.mobileNo();
		b.Account2();
		b.aadharNo();
	}
}
