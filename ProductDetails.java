class ProductDetails 
{

	int prodcode=101;
	long prodprice=500l;
	int  prodQty=5;
	   void getProductDetails(){
     System.out.println(prodcode);
     System.out.println(prodprice);
	 System.out.println(prodQty);

	   }
	public static void main(String[] args) 
	{
      ProductDetails pd=new ProductDetails();
	  pd.getProductDetails();
	}
}
