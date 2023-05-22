package Exercise2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuanLySach documentList = new QuanLySach();
		
		while(true) {
			System.out.println("[1]. Them moi tai lieu");
			System.out.println("[2]. Xoa tai lieu theo ma tai lieu.");
			System.out.println("[3]. Hien thi thong tin ve tai lieu.");
			System.out.println("[4]. Tim kiem tai lieu theo loai.");
			System.out.println("[5]. Thoat khoi chuong trinh.");
			System.out.print("\nNhap lua chon cua ban: ");
			int n = sc.nextInt();
			sc.nextLine();
			switch(n) {
				case 1:{
					System.out.println("[a]. Sach");
					System.out.println("[b]. Tap chi");
					System.out.println("[c]. Bao");
					System.out.print("\nNhap lua chon: ");
					String option = sc.nextLine();
					switch(option) {
						case "a":{
							System.out.print("Nhap ma tai lieu: ");
							String documentCode = sc.nextLine();
							System.out.print("Nhap nha xuat ban: ");
							String publisherName = sc.nextLine();
							System.out.print("Nhap so phat hanh: ");
							String editionNumber = sc.nextLine();
							System.out.print("Nhap ten tac gia: ");
							String authorName = sc.nextLine();
							System.out.print("Nhap so trang: ");
							int pageCount = sc.nextInt();
							sc.nextLine();
							Book book = new Book(documentCode, publisherName, editionNumber, authorName, pageCount);
							documentList.addDocument(book);
							break;
						}
						case "b":{
							System.out.print("Nhap ma tai lieu: ");
							String documentCode = sc.nextLine();
							System.out.print("Nhap nha xuat ban: ");
							String publisherName = sc.nextLine();
							System.out.print("Nhap so phat hanh: ");
							String editionNumber = sc.nextLine();
							System.out.print("Nhap so phat hanh: ");
							String issueNumber = sc.nextLine();
							System.out.print("Nhap thang phat hanh: ");
							String publicationMonth = sc.nextLine();
							Magazine magazine = new Magazine(documentCode, publisherName, editionNumber, issueNumber, publicationMonth);
							documentList.addDocument(magazine);
							break;
						}
						case "c":{
							System.out.print("Nhap ma tai lieu: ");
							String documentCode = sc.nextLine();
							System.out.print("Nhap nha xuat ban: ");
							String publisherName = sc.nextLine();
							System.out.print("Nhap so phat hanh: ");
							String editionNumber = sc.nextLine();
							System.out.print("Nhap ngay phat hanh: ");
							int publicationDate = sc.nextInt();
							sc.nextLine();
							NewPaper newPaper = new NewPaper(documentCode, publisherName, editionNumber, publicationDate);
							documentList.addDocument(newPaper);
							break;
						}
					}
					System.out.println("\n");
					break;
				}
				case 2:{
					System.out.print("\nNhap ma tai lieu can xoa: ");
					String documentCode = sc.nextLine();
					documentList.removeDocumentByDocumentCode(documentCode);
					documentList.showListForDocuments();
					break;
				}
				case 3:{
					System.out.print("\nThong tin tai lieu: ");
					documentList.showListForDocuments();
					break;
				}
				case 4:{
					System.out.print("\nNhap loai ban muon tim: ");
					String publisherName = sc.nextLine();
					documentList.searchDocumentByName(publisherName).forEach(document ->{
						System.out.println(document.Output());
					});
					break;
				}
				case 5:{
					return;
				}
			}
		}
	}
}
