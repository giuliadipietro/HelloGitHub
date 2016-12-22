package socialnetwork.profile;

public class MayBeInt {
	private int data; 
	private int status;
	
	public MayBeInt(int data, int status) {
		this.data = data; this.status = status;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void print(){
	if (status == 1) {
		System.out.println("age: "+data);
	}
	else if (status == 2) {
		System.out.println("no age available");
	}
	else {
		System.out.println("status not valid");
	}
	}
}

