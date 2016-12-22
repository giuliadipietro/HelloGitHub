//import com.sun.jndi.cosnaming.IiopUrl.Address;


public class Person {

	public String firstName;
	public String lastName;
	public int age;
	public int height;
	public int weight;
	public String hairColour;
	public Address address; 
	
	public void setAddress (String city, String zip, String street)
	{
		address = new Address();
		address.city = city;
		address.zip = zip;
		address.street = street;
	}
}
