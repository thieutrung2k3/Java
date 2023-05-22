package Exercise2;

public class NewPaper extends Document{
	private int publicationDate;
	
	public NewPaper(String documentCode, String publisherName, String editionNumber, int publicationDate){
		super(documentCode, publisherName, editionNumber);
		this.publicationDate = publicationDate;
	}
	@Override
	public String Output() {
		return "Newspaper[" + documentCode + ", " + publisherName + ", " + editionNumber + ", " + publicationDate + "]";
	}
}
