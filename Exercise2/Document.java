package Exercise2;

public class Document {
	protected String documentCode;
	protected String publisherName;
	protected String editionNumber;
	
	public Document(String documentCode, String publisherName, String editionNumber) {
		this.documentCode = documentCode;
		this.publisherName = publisherName;
		this.editionNumber = editionNumber;
	}
	public String getDocumentCode() {
		return documentCode;
	}
	public String Output() {
		return null;
	}
	public String getPublisherName() {
		return publisherName;
	}
}
