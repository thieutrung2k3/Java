package Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ManagerOfficer {
	private List<Officer> officers;
	
	public ManagerOfficer() {
		this.officers = new ArrayList<>();
	}
	
	public void addOfficer(Officer officer) {
		this.officers.add(officer);
	}
	
	public void showListInforOffiver() {
		this.officers.forEach(o -> System.out.println(o.Output()));
	}
	public List<Officer> searchOfficerByName(String name) {
		 return this.officers.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
	}
	
}
