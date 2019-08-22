
public class Truck extends Car{
	public String payload;
	public Truck(String engine,String wheels,String payload) {
		super(engine,wheels);
		this.payload = payload;
	}
	
	
	public String start() {
		//"tips, {engine} is on and {wheels} are running!"
		return ("tips, " + engine + "is on and " + wheels + " are running!");
	}
	
	public String load() {
		//"{payload} is loading goods"
		return (payload + " is loading goods");
	}
}
