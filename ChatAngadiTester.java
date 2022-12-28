class ChatAngadiTester
{
	public static void main(String a[])
	{
		System.out.println("the main method started......");
		
		String chatName[]={"PaniPuri", "Masal Puri", "Goobi"};
		ChatAngadi chat = new ChatAngadi(1,"AAN Chats",chatName);
		chat.displayDetails();
		ChatAngadi chat2 = new ChatAngadi(2,"Chats Adda",chatName);
		chat2.displayDetails();
		
		System.out.println("the main method ended......");
	}
}