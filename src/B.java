
public class B implements Bank {
	private  int faiz=30;
	private final String BankName;
	public  B() {
		BankName="B Bank";
	}
	public int interstrate() {
		return faiz;
	}
	public String getBankName() {
		return BankName;
	}
}
