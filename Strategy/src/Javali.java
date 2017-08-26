
public class Javali extends Animal {
	
	public Javali(String name,String sex) {
		super(name, sex);
		setCanSwim(new CantSwim());
	}

}
