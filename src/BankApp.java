import java.io.*;
public class BankApp {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String bankName;

		while (true) {
		    try {
		        System.out.print("Enter the name of Bank from where you want to take a loan amount (A, B, or C): ");
		        bankName = br.readLine().toUpperCase(); // Küçük harf de girilse büyük harfe çevir

		        if (bankName.equals("A") || bankName.equals("B") || bankName.equals("C")) {
		            break;
		        } else {
		            System.out.println("Please enter a valid bank name (A, B, or C)!");
		        }
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}

	System.out.print("\n");  
	System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");  
	  
	String loanName=br.readLine();  
	AbstractFactory bankFactory = chooseProcess.getFactory("Bank");  
	Bank b=bankFactory.getBank(bankName);  
	
	System.out.print("\n");  
	System.out.print(" the interest rate for "+b.getBankName()+ " and your rate is : "+Integer.toString(b.interstrate()));  
	  
	double rate=b.interstrate();  
	System.out.print("\n");  
	System.out.print("Enter the loan amount you want to take: ");  
	  
	double loanAmount=Double.parseDouble(br.readLine());  
	System.out.print("\n");  
	System.out.print("Enter the number of years to pay your entire loan amount: ");  
	int years=Integer.parseInt(br.readLine());  
	  
	System.out.print("\n");  
	System.out.println("you are taking the loan from "+ b.getBankName());  
	  
	AbstractFactory loanFactory = chooseProcess.getFactory("Loan");  
	           Loan l=loanFactory.getLoan(loanName);  
	           l.getInterestRate(rate);  
	           l.calculateLoanPayment(loanAmount,years);  

	}

}
