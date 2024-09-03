
public class C implements Bank{
	private final String BankName;
	private int faiz=40;
	public  C() {
		BankName="C Bank";
	}
	public String getBankName() {
		return BankName;
	}
	public int interstrate() {
		return faiz;
	}
}
