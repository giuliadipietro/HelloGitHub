
public class MaxMustermann {

	public static void main(String[] args) {
		
		Person max = new Person();
		max.firstName = "Max";
		max.lastName = "Mustermann";
		max.age = 39;
		max.height = 170;
		max.weight = 87;
		max.hairColour = "brown";
		max.setAddress("Graz", "8010", "Mandellstrasse"); 

		
		System.out.println("Hello, my name is" + " " + max.firstName + " " + max.lastName + ". I am " + max.age + " years old. "
				+ "I am " + max.height + " centimetres tall and weight " + max.weight + " kilos. My hair colour is " + max.hairColour + ". I live in " + max.address.city+".");
		
		/*System.out.printf("Hello, my name is %s %s. I am %d years old. I am %d centimetres tall and weight %d kilos. My hair colour is %s.",
				max.firstName, max.lastName, max.age, max.height, max.weight, max.hairColour);*/
		
	
		
	}

}
