package com.xworkz.spring.teashop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@Component
@ToString
@NoArgsConstructor
public class Tea {
	@Autowired
	private List<Category> category;

}
