package Exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors; 

public class QuanLySach {
	public List<Document> documents;
	
	public QuanLySach() {
		this.documents = new ArrayList<>();
	}
	
	public void addDocument(Document document) {
		this.documents.add(document);
	}
	public void showListForDocuments() {
		this.documents.forEach(o -> System.out.println(o.Output()));
		System.out.println("\n");
	}
	
	public boolean removeDocumentByDocumentCode(String documentCode) {
		Document document = this.documents.stream().filter(o -> o.getDocumentCode().equals(documentCode)).findFirst().orElse(null);
		if(document == null) {
			return false;
		}
		this.documents.remove(document);
		return true;
	}
	public List<Document> searchDocumentByName(String publisherName){
		return this.documents.stream().filter(o -> o.getPublisherName().contains(publisherName)).collect(Collectors.toList());
	}
}
