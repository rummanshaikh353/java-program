class BookDetails 
{
	int bookCode=101;
	String bookName="c-lang";
	String bookAuthor ="B_swamy";
	int bookPrice=200;
	int bookQty=2;

	void getBookDetails()
	{
		System.out.println("Book code is  "+bookCode);
		System.out.println("Book Name is  "+bookName);
                                   System.out.println("Book Author is  "+bookAuthor);
                                    System.out.println("Book Price is  "+bookPrice);
                                   System.out.println("Book Quantity is "+bookQty);


	}
	public static void main(String[] args) 
	{
	  BookDetails bd=new BookDetails();
	  bd.getBookDetails();
	}
}
