
public class SportsCar extends Car{
	public String lights;
	public SportsCar(String engine,String wheels,String lights) {
		
		super(engine,wheels);
		this.lights= lights;
		
	}
	
	public String start() {
		//"{lights} are shining, {engine} is on and {wheels} are running!"
		return (this.lights + "are shining, " + super.engine + " is on and " + super.wheels + " are running!");
	}

}
