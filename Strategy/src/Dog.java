
public class Dog extends Animal{

	public Dog(String name,String sex) {
		super(name,sex);
		setCanSwim(new BadSwimer());
	}
	
}
