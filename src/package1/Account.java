package package1;

public class Account {
		String name;
		double bal;
		public Account(String name,double bal) {
			this.name=name;
			this.bal=bal;
		}
		public void displayBal(){
			System.out.println("Account Holder:"+name);
			System.out.println("Balance amount:"+bal);
		}
}