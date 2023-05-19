package Bai1;

public class Staff extends Officer{
	private String job;
	
	public Staff(String name, int age, String gender, String address, String job) {
		super(name, age, gender, address);
		this.job = job;
	}
	@Override
	public String Output() {
		return "Worker{\n" + "Name: " + name + "\nAge: " + age + "\nGender: " + gender
				+ "\nAddress: " + address + "\nJob: " + job + " \n}";
	}
}
