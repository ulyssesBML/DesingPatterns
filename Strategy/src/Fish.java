
public class Fish extends Animal{

		public Fish(String name,String sex) {
			super(name, sex);
			setCanSwim(new NaturalSwimer());
		}
	
}
