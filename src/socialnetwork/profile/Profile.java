package socialnetwork.profile;

public class Profile {
	private String vorname;
	private String nachname;
	private String email; 
	private String bezStatus;
	private MayBeInt age;
	
	public Profile(String vorname, String nachname, String email,
			String bezStatus, MayBeInt age) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.email = email;
		this.bezStatus = bezStatus;
		this.age = age;
	}
	
	public void showAccountInfo(){
		System.out.println("username: "+ vorname +"."+ nachname);
		System.out.println("email: "+ email);
		System.out.println("relationship status: "+bezStatus);
		age.print();
		System.out.println();
	}
	
}
