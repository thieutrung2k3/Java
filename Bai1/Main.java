package Bai1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ManagerOfficer managerOfficer = new ManagerOfficer();
		while(true) {
			System.out.println("\n[1]. Them thong tin can bo vao danh sach.");
			System.out.println("[2]. Tim kiem can bo trong danh sach.");
			System.out.println("[3]. Hien thi thong tin danh sach");
			System.out.println("[4]. Thoat chuong trinh.");
			
			System.out.print("\nNhap lua chon cua ban: ");
			int n = sc.nextInt();
			sc.nextLine();
			switch(n) {
				case 1:{
					System.out.println("\n[a]. Them ky su.");
					System.out.println("[b]. Them cong nhan.");
					System.out.println("[c]. Them nhan vien.");
					System.out.println("-Nhan bat ki de quay lai.");
					System.out.print("\nNhap lua chon cua ban: ");
					String op = sc.nextLine();
					switch(op) {
						case "a":{
							System.out.print("\nNhap ho ten ky su: ");
							String name = sc.nextLine();
							System.out.print("Nhap tuoi ky su: ");
							int age = sc.nextInt();
							sc.nextLine();
							System.out.print("Nhap gioi tinh: ");
							String gender = sc.nextLine();
							System.out.print("Nhap dia chi: ");
							String address = sc.nextLine();
							System.out.print("Nhap nganh hoc: ");
							String major = sc.nextLine();
							Engineer engineer = new Engineer(name, age, gender, address, major);
							managerOfficer.addOfficer(engineer);
							break;
						}
						case "b":{
							System.out.print("Nhap ho ten cong nhan: ");
							String name = sc.nextLine();
							System.out.print("Nhap tuoi cong nhan: ");
							int age = sc.nextInt();
							sc.nextLine();
							System.out.print("Nhap gioi tinh: ");
							String gender = sc.nextLine();
							System.out.print("Nhap dia chi: ");
							String address = sc.nextLine();
							System.out.print("Nhap trinh do: ");
							int level = sc.nextInt();
							sc.nextLine();
							Worker worker = new Worker(name, age, gender, address, level);
							managerOfficer.addOfficer(worker);
							break;
						}
						case "c":{
							System.out.print("Nhap ho ten nhan vien: ");
							String name = sc.nextLine();
							System.out.print("Nhap tuoi nhan vien: ");
							int age = sc.nextInt();
							sc.nextLine();
							System.out.print("Nhap gioi tinh: ");
							String gender = sc.nextLine();
							System.out.print("Nhap dia chi: ");
							String address = sc.nextLine();
							System.out.print("Nhap cong viec: ");
							String job = sc.nextLine();
							Staff staff = new Staff(name, age, gender, address, job);
							managerOfficer.addOfficer(staff);
							break;
						}
					}
					break;
				}
					case 2:{
						System.out.print("\nNhap ten ban muon tim: ");
						String name = sc.nextLine();
						managerOfficer.searchOfficerByName(name).forEach(officer -> {
							System.out.println(officer.Output());
						});
						break;
					}
					case 3:{
						managerOfficer.showListInforOffiver();
						break;
					}
			}
		}
	}
}
