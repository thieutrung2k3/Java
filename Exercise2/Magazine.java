package Exercise2;

public class Magazine extends Document{
	private String issueNumber;
	private String publicationMonth;
	public Magazine(String documentCode, String pulisherName, String editionNumber, String issueNumber, String publicationMonth) {
		super(documentCode, pulisherName, editionNumber);
		this.issueNumber = issueNumber;
		this.publicationMonth = publicationMonth;
	}
	@Override
	public String Output() {
		return "Magazine[" + documentCode + ", " + publisherName + ", " + editionNumber + ", " + issueNumber + ", " + publicationMonth + "]";
	}
}
