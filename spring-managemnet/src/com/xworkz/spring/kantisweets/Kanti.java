package com.xworkz.spring.kantisweets;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@Component
@NoArgsConstructor
@Data
public class Kanti {
	
	
	
	@Autowired
	private List<Sweets> sweet;

}
