
public class Principal {

	public static void main(String[] args) {
		Animal dog = new Dog("Dante", "male");
		Animal fish = new Fish("Dante", "male");
		Animal javali = new Javali("Dante", "male");
		
		System.out.println(dog.getCanSwim());
		System.out.println(fish.getCanSwim());
		System.out.println(javali.getCanSwim());
		
		dog.setCanSwim(new CantSwim());
		System.out.println("-------------------------------------------------------");
		System.out.println(dog.getCanSwim());
	}

}
