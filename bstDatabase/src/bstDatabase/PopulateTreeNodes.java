package bstDatabase;

import java.io.IOException;

@SuppressWarnings("unused")
public class PopulateTreeNodes {

	private static Tree database;
	
	public PopulateTreeNodes() throws Exception{
		String[] data = Utilities.fileToStringArray("datacitystate.csv");
		Account[] accounts = new Account[data.length];
		for (int i = 0; i < data.length; i++) {
			accounts[i] = new Account(data[i]);
		}
		database = new Tree(accounts[0]);
		for (int i = 1; i <= accounts.length - 1; i++) {
			// System.out.println("inserting \"" + accounts[i].toString()+"\"");
			database.insertNode(database.root, accounts[i]);
		}
		Account a = new Account(111111111, "Hamm", "Bacon", 4356289513L,
				"hammbacon@utahcorp.com", "21 N 1260 E", 84720, "password", 3,
				27, 1992, "Human Resources");

		database.insertNode(database.root,a);
		System.out.println(database.getNode(111111111).getAccount().toString());
		database.insertNode(database.root, new Account(123456789, "Robinson", "Sean", 4355555050L, "seanrobinson@utahcorp.com", "100 N 321 E", 84720, "P@$$w0rD", 4,20,1994, "Tech Support" ));
		System.out.println(database.getNode(123456789).getAccount());
		
	}
	
	public static void main(String[] args) throws Exception {
//		long startTime = System.currentTimeMillis();
//		String[] data = Utilities.fileToStringArray("datacitystate.csv");
//		Account[] accounts = new Account[data.length];
//
//		for (int i = 0; i < data.length; i++) {
//			accounts[i] = new Account(data[i]);
//		}
//
//		Tree database = new Tree(accounts[0]);
//		for (int i = 1; i <= accounts.length - 1; i++) {
//			// System.out.println("inserting \"" + accounts[i].toString()+"\"");
//			database.insertNode(database.root, accounts[i]);
//		}
//
//		System.out.println(Utilities.runtime(startTime));
//
//		Account a = new Account(111111111, "Hamm", "Bacon", 4356289513L,
//				"hammbacon@utahcorp.com", "21 N 1260 E", 84720, "password", 3,
//				27, 1992, "Human Resources");
//
//		database.insertNode(database.root,a);
//		System.out.println(database.getNode(111111111).getAccount());
//		
//		
//		System.out.println(database.getNode(181242337).getAccount().toString());
//		database.deactivateNode(181242337);
//		System.out.println(database.getNode(181242337).getAccount().toString());
		new PopulateTreeNodes();
		System.out.println(database.getNode(111111111).getAccount());
	}
	
	public Account getAccount(int ssn){
		return database.getNode(ssn).getAccount();
	}
}
