package abstractClass;

public abstract class Animal {
	public String kind;
	
	Animal(){}
	
	public void breathe() {
		System.out.println("Breathe()");
	}
	
	public abstract void sound();
}
