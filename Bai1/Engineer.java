package Bai1;

public class Engineer extends Officer{
	private String major;
	public Engineer(String name, int age, String gender, String address, String major) {
		super(name, age, gender, address);
		this.major = major;
	}
	
	@Override
	public String Output() {
		return "Engineer{\n" + "Name: " + name + "\nAge: " + age + "\nGender: " + gender
				+ "\nAddress: " + address + "\nMajor: " + major + " \n}";
	}
}
