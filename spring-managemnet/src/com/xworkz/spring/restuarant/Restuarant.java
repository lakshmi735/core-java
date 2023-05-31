package com.xworkz.spring.restuarant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@Component
@Getter
@Setter
@NoArgsConstructor
public class Restuarant {
	
	
	   @Autowired
		private List<Foods> foods;

}
