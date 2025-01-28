public class Book extends TangibleAsset{
	private String isbn;
	public Book(String name, int price, String colour, String isbn){
		super(name, price, colour);
		this.isbn = isbn;
		System.out.println(this.name);
	}
	public String getIsbn(){return this.isbn;}
}

