
public class Bruch {
	
	private int zähler;
	private int nenner;
	
	public Bruch(int zähler, int nenner) {
		this.zähler = zähler;
		this.nenner = nenner;
	}
	public int getZähler() {
		return zähler;
	}
	public int getNenner() {
		return nenner;
	}
	
	public void print() {
		System.out.println(zähler + " / "+ nenner);
	}
	
	public double toDecimal() {
		return (double)zähler / (double)nenner;
	}
	
//	public Bruch multiplicate(Bruch b2) {
//		int zähler = this.zähler * b2.getZähler();
//		int nenner = this.nenner * b2.getNenner();
//		return new Bruch;
//	}
	
}
