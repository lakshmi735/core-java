class SuperMarket
{
	static String fruits[]={"Apple","Mango","Orange","Banana","Kiwi","Pineapple","Cherry","Grape","Strawberry","BlueBerry"};
	static String vegetables[]={"Potato","Tomato","Eggplant","Carrot","Mushroom","Radish","Cabbage","CauliFlower","Onion","Pumpkin"};
	static String chocolates[]={"Dairy Milk","5 Star","Milkybar","Kitkat","Galaxy","Snickers","Mars","Perk","Munch","Twix"};
	static String biscuits[]={"Oreo","Milk Bikis","Unibic","MarieLite","Parle-G","Happy Happy","Monaco","Bourbon","Good Day","Hide&Seek"};
	static String perfumes[]={"Fogg","Axe","Bella Veta","Skinn","Ossum","Luxury","Layyer Wattagirl","Engage","park Avenue","Denver"};
	static String clothes[]={"Raymond","Nike","Puma","Biba","Adidas","Reebok","Allen Solly","Levis","Zara","H&M"};
	static String groceries[]={"Salt","Sugar","Turmeric Powder","Jaggery","Red Chilli","Toor Dal","Basmati Rice","Rava","Maida","Vermicelli"};
	static String kitchenSet[]={"Coffe Maker","Toster","frying Pan","Peeler","Rolling Pin","Blender","Jar","Juicer","Apron","Bowl"};
	static String shampoo[]={"Loreal","Well Professionals","Matrix","Clinic Plus","Sunsilk","Head&Shoulder","Himalaya","Tresemme","Biolage","Garnier"};
	static String shoes[]={"Reebok","Jordan","Under Armour","Anta","New Balance","Peak","Bata","Redtape","Newton","Salomon"};
	static String dryFruits[]={"Almond","Apricot","Cashew Nut","Dates","Walnut","Raisins","Peanut","Pistachio","Sesame","oconut"};
	static String cosmetics[]={"Lipstick","Kajal","EyeLiner","Bindi","Foundation","EyeLashes","Maskara","Primer","Concealer","Nail Polish"};
	
	public static void getFruits()
	{
		System.out.println("the Length of the fruits are------"+fruits.length);
		System.out.println("-----------------------------------");
		for(int i=0;i<fruits.length;i++)
		{
			System.out.println(fruits[i]);
		}
	}
	public static void getVegetables()
	{
		System.out.println("the Length of the fruits are------"+vegetables.length);
		System.out.println("-----------------------------------");
		for(int i=0;i<vegetables.length;i++)
		{
			System.out.println(vegetables[i]);
		}
	}
	public static void getChocolates()
	{
	System.out.println("the Length of the chocolates are------"+chocolates.length);
		System.out.println("-----------------------------------");
		for(int i=0;i<chocolates.length;i++)
		{
			System.out.println(chocolates[i]);
		}
	}
	public static void getBiscuits()
	{
	System.out.println("the Length of the chocolates are------"+biscuits.length);
		System.out.println("-----------------------------------");
		for(int i=0;i<biscuits.length;i++)
		{
			System.out.println(biscuits[i]);
		}
	}
	public static void getPerfumes()
	{
	System.out.println("the Length of the chocolates are------"+perfumes.length);
		System.out.println("-----------------------------------");
		for(int i=0;i<perfumes.length;i++)
		{
			System.out.println(perfumes[i]);
		}
	}
	public static void getClothes()
	{
		System.out.println("the length of the clothes are------"+clothes.length);
		System.out.println("---------------------------------------");
		for(int i=0;i<clothes.length;i++)
		{
			System.out.println(clothes[i]);
		}
	}
	public static void getGroceries()
	{
		System.out.println("the length of the groceries are------ "+groceries.length);
		System.out.println("-------------------------------------");
		for(int i=0;i<groceries.length;i++)
		{
			System.out.println(groceries.length);
		}
	}
	public static void getKitchenSet()
	{
		System.out.println("the length of the kitchenSet set are------"+kitchenSet.length);
		System.out.println("--------------------------------------------");
		for(int i=0;i<kitchenSet.length;i++)
		{
			System.out.println(kitchenSet[i]);
		}
	}
	public static void getShampoo()
	{
		System.out.println("the length of the shampoo is......"+shampoo.length);
		System.out.println("-------------------------------------------");
		for(int i=0;i<shampoo.length;i++)
		{
			System.out.println(shampoo[i]);
			
		}
	}
	public static void getShoes()
	{
		System.out.println("the length of the shoes are------"+shoes.length);
		System.out.println("------------------------------------------");
		for(int i=0;i<shoes.length;i++)
		{
			System.out.println(shoes[i]);
		}
	}
	public static void getDryFruits()
	{
		System.out.println("the Length of the dryFriuts are------"+dryFruits.length);
		System.out.println("-----------------------------------");
		for(int i=0;i<dryFruits.length;i++)
		{
			System.out.println(dryFruits[i]);
		}
	}
	public static void getCosmetics()
	{
		System.out.println("the Length of the cosmetics are------"+cosmetics.length);
		System.out.println("-----------------------------------");
		for(int i=0;i<cosmetics.length;i++)
		{
			System.out.println(cosmetics[i]);
		}
		
	}
	
	public static void main(String lak[])
	{
		getFruits();
		getVegetables();
		getChocolates();
		getBiscuits();
		getPerfumes();
		getClothes();
		getGroceries();
		getKitchenSet();
		getShampoo();
		getShoes();
		getDryFruits();
		getCosmetics();

	
}
}