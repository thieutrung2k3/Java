package Bai1;

public class Worker extends Officer {
	private int level;
	
	public Worker(String name, int age, String gender, String address, int level) {
		super(name, age, gender, address);
		this.level = level;
	}
	@Override
	public String Output() {
		return "Worker{\n" + "Name: " + name + "\nAge: " + age + "\nGender: " + gender
				+ "\nAddress: " + address + "\nLevel: " + level + " \n}";
	}
}
