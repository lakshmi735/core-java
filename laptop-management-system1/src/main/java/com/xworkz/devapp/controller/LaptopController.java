package com.xworkz.devapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.xworkz.devapp.dto.LaptopDTO;
import com.xworkz.devapp.service.LaptopService;



@Controller

@RequestMapping("/")
public class LaptopController {
	
	
	@Autowired
	LaptopService service;
	
	//@RequestMapping(value="/registerLaptop", method=requestMethod.POST)
	
	@PostMapping("/registerLaptop")
	public String registerLaptop(@ModelAttribute LaptopDTO dto, HttpServletRequest req) {
		//@ModelAttribute helps to convert from fields into object
		System.out.println("inside controller's registerLaptop method");
		if(dto!=null) {
			
			
			service.validateAndSave(dto);
			req.setAttribute("nm", dto.getCompanyName());
			return "success";
		}
		return "failure";
		
	}
	
	@GetMapping("/listofLaptops")
	public String getAllLaptops(LaptopDTO dto, HttpServletRequest req) {
		System.out.println("Inside getAllLaptops method");
		
		List<LaptopDTO> dtos=service.getAllLaptopsSer();
		
		req.setAttribute("laptops", dtos);
		
		return "success";
	} 
	
	@GetMapping("/searchByCompanyName")
	public String searchByCompanyName(@RequestParam("companyName") String companyName, HttpServletRequest req) {
		System.out.println("Inside searchByCompanyName");
		
		List<LaptopDTO> dtos=service.getByCompanyNameSer(companyName);
		
		req.setAttribute("laptops", dtos);
		
		return "success";
		
	}
	
	@GetMapping(value = "/update/{laptopId}") //{laptopId} is a path variable
	public String updateLaptop(@PathVariable("laptopId") int id, HttpServletRequest req) {
		System.out.println("Inside updateLaptop method");
		
		LaptopDTO dto=service.getLaptopByIdSer(id);
		req.setAttribute("laptop", dto);
		RedirectView view=new RedirectView();
		view.setUrl(req.getContextPath()+"/");
		
		return "update_laptop";
		
	}
	
	@PostMapping(value = "/updatelaptop")
	public String update(@ModelAttribute LaptopDTO dto, HttpServletRequest req) {
		System.out.println("Inside update method");
		
		service.updateLaptopByIdSer(dto);
		req.setAttribute("laptop", dto);
		
		return "success";
		
	}
	@GetMapping(value = "/delete/{laptopId}") //{laptopId} is a path variable
	public RedirectView deleteById (@PathVariable("laptopId") int id, HttpServletRequest req) {
		System.out.println("Inside DeleteLaptop method");
		
		List<LaptopDTO> dto=service.deleteById(id);
		
		req.setAttribute("laptop", dto);
		
		RedirectView view=new RedirectView();
		System.out.println("delete by id");
		view.setUrl(req.getContextPath());
		view.setUrl(req.getContextPath() + "/listofLaptops");
		
		return view;
		
	}
}