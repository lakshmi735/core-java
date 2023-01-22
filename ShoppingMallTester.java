class ShoppingMallTester
{
	public static void main(String a[])
	{
		System.out.println("the main method started");
		
		ShoppingMall mall=new ShoppingMall();
		Shop shop=new Shop(1,"Fastract","Malleswaram",3);
		
		mall.include(shop);
		mall.getShop();
		System.out.println("the main method ended");
	}
}