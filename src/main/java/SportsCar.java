
public class SportsCar extends Car{
	public String lights;
	public SportsCar(String engine,String wheels,String lights) {
		
		super(engine,wheels);
		this.lights= lights;
		
	}
	
	public String start() {
		//"{lights} are shining, {engine} is on and {wheels} are running!"
		return (lights + " are shining, " + engine + " is on and " + wheels + " are running!");
	}
	
	public String speedOn() {
		//"{engine} is overload and {wheels} are super running!"
		return (engine + " is overload and " + wheels + " are super running!");
	}

}
