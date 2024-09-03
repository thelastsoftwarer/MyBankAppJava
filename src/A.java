import java.io.*;
public class A implements Bank {
	private int faiz=20;
	private final String BankName;
	public  A() {
		BankName="A Bank";
	}
	public int interstrate() {
		return faiz;
	}
	public String getBankName() {
		return BankName;
	}

}
