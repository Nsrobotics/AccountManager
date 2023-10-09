package src;

public class AccountManager {

	private static AccountManager instance; // (creates Singleton instance but does not give it a value)

	private AccountManager(){

    } 
    
    public static AccountManager getInstance() {

		if (instance == null) { //(conditional. if there is no instance, then instantiate a new one.)
			instance = new AccountManager();
		}

	    return instance; //(return the instance :->)

	}

    public void openAccount(String acctName, String acctNum, AccountType type) {
        
    }
}