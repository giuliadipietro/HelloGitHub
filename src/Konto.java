
public class Konto {
	
	private String owner;
	private int balance = 0;

public void setOwner(String owner) {
	this.owner = owner;
}
public void getMoney(int amount){
	int oldBalance = getBalance();
	if(oldBalance-amount < 0) {
		System.out.println("computer says no.");
	} else {
		setBalance(oldBalance-amount);
		System.out.println("yippeee");
	}
}

public void addMoney(int amount) {
	int oldBalance = getBalance();
	setBalance(oldBalance + amount);
	System.out.println("your current balance is: "+this.balance);
}

public int getBalance() {
	return this.balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}

public static void main(String[] args) {
	Konto jakub = new Konto();
	jakub.setOwner("Jakub");
	jakub.addMoney(50);
	jakub.getMoney(60);
	jakub.getMoney(30);
	jakub.screamsOn("Giulia");
}

public void screamsOn(String onWhom){
	System.out.println(this.owner + " screams on " + onWhom);
}
}