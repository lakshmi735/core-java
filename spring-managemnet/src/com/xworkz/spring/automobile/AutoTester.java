package com.xworkz.spring.automobile;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.automobile.Automobile;
import com.xworkz.spring.automobile.SpareParts;
import com.xworkz.spring.kantisweets.Kanti;
import com.xworkz.spring.restuarant.Foods;
import com.xworkz.spring.restuarant.Restuarant;

import com.xworkz.spring.springconfi.SpringConfiguration;
import com.xworkz.spring.teashop.Category;
import com.xworkz.spring.teashop.Tea;


public class AutoTester{
	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Automobile  automobile = app.getBean(Automobile.class);
		List<SpareParts> sp=new SpringConfiguration().getSpareParts();
		automobile.setParts(sp);
		System.out.println(automobile);
		
		
		
		Kanti kanti=app.getBean(Kanti.class);
		System.out.println(kanti);
		
		Restuarant restuarant=app.getBean(Restuarant.class);
		List<Foods> list  = new SpringConfiguration().getFoods();
		restuarant.setFoods(list);
		System.out.println(restuarant);
		
		Tea tea=app.getBean(Tea.class);
		List<Category> ca=new SpringConfiguration().getCategories();
		tea.setCategory(ca);
		System.out.println(tea);
		
	}
}