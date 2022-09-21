package interface123;

public class Encapsulation2 {
private String Name;
private long AccountNo;
private String EmailId;
public String getName() {
	return Name;
}

public void setName(String Name) {
	this.Name = Name;
}

final public long getAccountNo() {
	return AccountNo;
}

public void setAccountNo(long AccountNo) {
	this.AccountNo=AccountNo;
}

public String getEmailId() {
	return EmailId;
}
public void setEmailId(String EmailId) {
	this.EmailId = EmailId;
}
	
	public static void main(String[] args) {
		Encapsulation2 bs=new Encapsulation2();
		bs.setName("PRAVIR SALUNLHE");
		bs.setAccountNo(12345678888888L);
		bs.setEmailId("salunkhe.pravir88@gmail.com");
		System.out.println(bs.getName()+" " +bs.getEmailId()+" " +bs.getAccountNo());
	}
	




	
}
