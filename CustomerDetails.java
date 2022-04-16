class CustomerDetails

{

	int custId=1;
	String custName="saif";
	long balance=456;
	String accType="savings";
	int houseNo=2;
	String sName="shaikh";
	String city="pune";
	long pinCode =414001l;
	String mailId="saif@gmail.com";
	long phoneNO= 8788409522l;


	void getCustomerDetails()
	{
		System.out.println("Customer ID is "+custId);
        System.out.println("Customer Name is "+custName);
        System.out.println("Balance is "+balance);
        System.out.println("Account Type is "+accType);
        System.out.println("House No is "+houseNo);
        System.out.println("SirName is "+sName);
        System.out.println("City is "+city);
        System.out.println("Pincode is "+pinCode);
        System.out.println("Mail Id  "+mailId);
        System.out.println("Phone No is "+phoneNO);
                        

	}

	public static void main(String[] args) 
	{
		CustomerDetails cd=new CustomerDetails();
		cd.getCustomerDetails();
	}
}
