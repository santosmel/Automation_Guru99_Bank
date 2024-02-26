package guru99BankTest;

public class MainProcGuru99Bank {
	
	public static void main(String[] args) {
		
		AddCustGuru99Bank addCustGuru99BankObj = new AddCustGuru99Bank();
		addCustGuru99BankObj.invokeBrowser();
		addCustGuru99BankObj.verifyLoginToGuru99();
		addCustGuru99BankObj.AddCust();
		addCustGuru99BankObj.CloseBrowser();
		
	}

}
