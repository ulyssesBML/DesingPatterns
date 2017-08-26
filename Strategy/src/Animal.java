
public abstract class Animal {

	public Animal(String name,String sex) {
		setName(name);
		setSex(sex);
	}
	
	private String name;
	private String sex;
	
	private Swim canSwim;
	
	//sets
	public void setName(String name) {
		this.name = name;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setCanSwim(Swim canSwim) {
		this.canSwim = canSwim;
	}
	
	//gets
	public String getName() {
		return name;
	}
	public String getSex() {
		return sex;
	}
	public Swim getCanSwim() {
		return canSwim;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
}
