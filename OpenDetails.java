package interface123;

public class OpenDetails implements IdbiBank {

	
	public void account() {
		System.out.println("this is icici bank account");
		
	}

	public void usrId() {
	System.out.println("My user id is Pravir88");
		
	}


	public void account1() {
		System.out.println("my account is open for idbi bank account");
		
	}

	public void userId1() {
	System.out.println("my user id is GoDaddy");
		
	}
	public static void main(String[]args) 
	{
		OpenDetails n=new OpenDetails();
		n.account();
		n.usrId();
		n.account1();
		n.userId1();
	}
	

}
