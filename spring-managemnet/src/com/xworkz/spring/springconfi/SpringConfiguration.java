package com.xworkz.spring.springconfi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import com.xworkz.spring.automobile.SpareParts;
import com.xworkz.spring.kantisweets.Sweets;
import com.xworkz.spring.restuarant.Foods;
import com.xworkz.spring.teashop.Category;

@Configuration
@ComponentScan("com.xworkz.spring")
public class SpringConfiguration {
	@Bean
	public List<SpareParts> getSpareParts(){
		
	List<SpareParts> list=new ArrayList<SpareParts>();
	
	list.add(new SpareParts(1,"Battery","metal",150));
	list.add(new SpareParts(2,"Glow plug","metal",252));
	list.add(new SpareParts(3,"radiator","steel",225));
	list.add(new SpareParts(4,"Transmission","steel",200));
	list.add(new SpareParts(5,"Automotive oil","metal",160));
	list.add(new SpareParts(6,"axle","metal",150));
	list.add(new SpareParts(7,"Bearing","metal",175));
	list.add(new SpareParts(8,"clutch","metal",250));
	list.add(new SpareParts(9,"Enginoil","steel",130));
	list.add(new SpareParts(10,"Muffler","metal",221));
	list.add(new SpareParts(11,"jack","steel",253));
	list.add(new SpareParts(12,"Solenoid","steel",190));
	list.add(new SpareParts(13,"piston","metal",100));
	list.add(new SpareParts(14,"Radiator","metal",120));
	list.add(new SpareParts(15,"Tire","Rubber",210));
     return list;
}

    @Bean
	public List<Foods> getFoods(){
    	
    	List<Foods> food=new ArrayList<Foods>();
    	food.add(new Foods(1,"Puliogere","Indian"));
    	food.add(new Foods(2,"Bisibele bath","Indian"));
    	food.add(new Foods(3,"Palav","Indian"));
    	food.add(new Foods(4,"Noddles","Chinese"));
    	food.add(new Foods(5,"Ramen","KOrean"));
    	food.add(new Foods(6,"Fish","Indian"));
    	food.add(new Foods(7,"Biryani","Indian"));
    	food.add(new Foods(8,"pizza","german"));
    	food.add(new Foods(9,"momos","China"));
    	food.add(new Foods(10,"Aloo parota",""));
    	food.add(new Foods(11,"Idli","indian"));
    	food.add(new Foods(12,"poori","indian"));
    	food.add(new Foods(13,"masala dosa","indian"));
    	food.add(new Foods(14,"pongal","indian"));
    	food.add(new Foods(15,"suji","KOrean"));
    	return food;
    }

	@Bean
	@Order(1)
	public Sweets getSweets() {
		return new Sweets(1,"mysurepak");
	}
	@Bean
	@Order(2)
	public Sweets getSweets1()
	{
		return new Sweets(2, "Gulab jamun");
	}
	@Bean
	@Order(3)
	public Sweets getSweets2()
	{
		return new Sweets(3, "Jalebi");
	}
	@Bean
	@Order(4)
	public Sweets getSweets3()
	{
		return new Sweets(4, "Kheer");
	}
	@Bean
	@Order(5)
	public Sweets getSweets4()
	{
		return new Sweets(5, "Laddu");
	}
	@Bean
	@Order(6)
	public Sweets getSweets5()
	{
		return new Sweets(6, "Peda");
	}
	@Bean
	@Order(7)
	public Sweets getSweets6()
	{
		return new Sweets(7, "Rasgulla");
	}
	@Bean
	@Order(8)
	public Sweets getSweets7()
	{
		return new Sweets(8, "Barfi");
	}
	@Bean
	@Order(9)
	public Sweets getSweets8()
	{
		return new Sweets(9, "Halva");
	}
	@Bean
	@Order(10)
	public Sweets getSweets9()
	{
		return new Sweets(10, "Rasmalai");
	}
	@Bean
	@Order(11)
	public Sweets getSweets10()
	{
		return new Sweets(11, "Kalakand");
	}
	@Bean
	@Order(12)
	public Sweets getSweets11()
	{
		return new Sweets(12, "Besan ladoo");
	}
	@Bean
	@Order(13)
	public Sweets getSweets12()
	{
		return new Sweets(13, "kaju barfi");
	}
	@Bean
	@Order(14)
	public Sweets getSweets13()
	{
		return new Sweets(14, "Malpoa");
	}
	@Bean
	@Order(15)
	public Sweets getSweets14()
	{
		return new Sweets(15, "Badusha");
	}
	@Bean
	public List<Category> getCategories(){
		List<Category> list = new ArrayList<Category>();
		
		list.add(new Category(1, "tea", 12));
		list.add(new Category(2, "coffee", 12));
		list.add(new Category(3, "greentea", 15));
		list.add(new Category(4, "blackcoffee", 15));
		list.add(new Category(5, "badham milk", 12));
		list.add(new Category(6, "sandwich", 35));
		list.add(new Category(7, "buttermilk", 10));
		list.add(new Category(8, "lemonjuice", 20));
		list.add(new Category(9, "mangomilkshake", 40));
		list.add(new Category(10,"Biscuit",5));
		list.add(new Category(11,"Boost",15));
		list.add(new Category(12,"Fries",75));
		list.add(new Category(13,"IceCReam",45));
		list.add(new Category(14,"bread",10));
		list.add(new Category(15,"blacktea",10));
		
		
		return list;
	}


}
