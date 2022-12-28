class Fridge
{
	String brandName;
	double price;
	String color;
	String capacity;
	
	public Fridge(String bNmae,double pce,String clr,String cty)
	{
		brandName=bNmae;
		price=pce;
		color=clr;
		capacity=cty;
	}
public void toStore()
{
	System.out.println("toStore");
}	
}



//this is constructor program
//Fridge is constructor having no return type(void) 
//Fridge(parameter are passed)