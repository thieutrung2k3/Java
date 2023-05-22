package Exercise2;

public class Book extends Document{
	private String authorName;
	private int pageCount;
	public Book(String documentCode, String publisherName, String editionNumber, String authorName, int pageCount) {
		super(documentCode, publisherName, editionNumber);
		this.authorName = authorName;
		this.pageCount = pageCount;
	}
	
	@Override
	public String Output() {
		return "Book[" + documentCode + ", " + publisherName + ", " + editionNumber + ", " + authorName + ", " + pageCount + "]";
	}
}
