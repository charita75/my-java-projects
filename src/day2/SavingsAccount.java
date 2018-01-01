package day2;

class BankAccount 
{
	public void CurrentAccount (String acName, int acNo) 
	{
		System.out.println("The name of account holder is " +acName);
		System.out.println("The account number is " +acNo);
		
	}

	public void CurrentAccount (String acName, int acNo, int SSN) 
	{
		System.out.println("The name of account holder is " +acName);
		System.out.println("The account number is " +acNo);
		System.out.println("The last four digits of SSN is " +SSN);
	}

	public void withdrawAmnt(int amnt) 
	{
		System.out.println("The amount withdrawn is " +amnt);
	}
	public void remAmnt()
	{
		float total = 20000;
		System.out.println("The final total is " + total);
	}
}

class SavingsAccount extends BankAccount 
{
	public void withdrawAmnt(int amnt, int interest) 
	{
		int balance = amnt - interest;
		System.out.println("The amount withdrawn is " +balance);
	}
	public void remAmnt()
	{
		int total = 10000;
		System.out.println("The total after interest is " +total);
	}

	public static void main(String args[]) 
	{

		 SavingsAccount sa = new SavingsAccount();
		 //BankAccount ba = new BankAccount();
		 sa.CurrentAccount("Charita", 1234);
		 sa.CurrentAccount("John", 5678, 9000);
		 sa.withdrawAmnt(1000);
		 sa.remAmnt();
		 
		 sa.withdrawAmnt(2000, 20);
		 sa.remAmnt();
		 
	 }
}
