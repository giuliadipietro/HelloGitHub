
public class Bruch {
	
	private int z�hler;
	private int nenner;
	
	public Bruch(int z�hler, int nenner) {
		this.z�hler = z�hler;
		this.nenner = nenner;
	}
	public int getZ�hler() {
		return z�hler;
	}
	public int getNenner() {
		return nenner;
	}
	
	public void print() {
		System.out.println(z�hler + " / "+ nenner);
	}
	
	public double toDecimal() {
		return (double)z�hler / (double)nenner;
	}
	
//	public Bruch multiplicate(Bruch b2) {
//		int z�hler = this.z�hler * b2.getZ�hler();
//		int nenner = this.nenner * b2.getNenner();
//		return new Bruch;
//	}
	
}
