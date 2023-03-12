import java.util.Scanner;

class ATM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("which bank's card[1.SBI | 2.ICICI]: ");
		int cardType = sc.nextInt();

		Bank bank = null;

		switch(cardType){
			case 1:
				bank = new SBI();
				break;
			case 2:
				bank = new ICICI();
				break;
			default:
				System.out.println("CARD READ ERROR ...... TRY AGAIN");
				System.exit(0);
		}

		System.out.println("\n================= WELCOME TO " + bank.getClass().getName().toUpperCase()+" BANK =================\n");
		bank.deposit(1000f);
		bank.withdraw(500f);
		bank.gstCalculation();

		Bank.method();
		
	}
}
