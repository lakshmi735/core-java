class AirportTester
{
	public static void main(String a[])
	{
		System.out.println("the main method is started....");
		Scanner scanner=new Scanner(System.in);
		Sytem.out.println("Enter the size");
		int size=scanner.nextInt();
		Airport airport=new Airport(size);
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the Id");
			int id=scanner.nextInt();
			System.out.println("Enetr the Terminal name");
			String name=scanner.next();
			System.out.println("Enter the Terminal Number");
			int terminalNo=scanner.nextInt();
		
		Terminal terminal=new Terminal(id,name,terminalNo);
		
		airport.add(terminal);
		}
		airport.getTermainal();
		System.out.println("the main method is ended....");
	}
}