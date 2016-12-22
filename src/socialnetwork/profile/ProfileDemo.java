package socialnetwork.profile;

public class ProfileDemo {	
	
	public static void main(String[] args) {
		Profile gianni = new Profile("Gianni","Peppe","g.peppe@gmail.com","single", new MayBeInt(20, 2));
		gianni.showAccountInfo();
		
		Profile giulia = new Profile("Giulia","Di Pietro", "giuliadptr@gmai.com", 
				"in a relationship", new MayBeInt(25, 1));
		giulia.showAccountInfo();
	}

}
