package com.xworkz.jpa.jpa_example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.jpa.jpa_example.dto.CosmeticsDTO;

public class CosmeticsTester {
	
	public static void main(String[] args) {
		
		//EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager entityManager = Persistence.createEntityManagerFactory("jpa").createEntityManager();
		entityManager.getTransaction().begin();
					//insert new record we  use persist 
			/*entityManager.persist(new CosmeticsDTO(3,"EyeLiner","waterProof",250.00,"jan-2023","sep-2024"));
		   // marge for update
		entityManager.merge(new CosmeticsDTO(3,"EyeLiner","waterProof",100.00,"jan-2023","sep-2024"));
											//find method for get
	        CosmeticsDTO dtoFromDb = entityManager.find(CosmeticsDTO.class,3);
	         entityManager.remove(dtoFromDb);
		
		
		/*Query query=entityManager.createQuery("select entity from CosmeticsDTO entity" ); //entity is full data1
		//CosmeticsDTO listFromDb=(CosmeticsDTO) query.getSingleResult();//to fetch single result
		List<CosmeticsDTO> listFromDb=query.getResultList();
		 System.out.println(listFromDb);*/
		//entityManager.getTransaction().commit();
		
		Query query=entityManager.createQuery("select cosmeticName from CosmeticsDTO entity where id =1");
						//down casting
		String data = (String) query.getSingleResult();
		
		System.out.println(data);
		
		
		
		Query query1=entityManager.createNamedQuery("getNameandType");
		List<Object[]> data1=(List<Object[]>) query1.getResultList();
		for (Object[] object : data1) {
			for (Object objects2 : object) {
				
			
			System.out.println(objects2);
			
		}
		}
		
		Query query2=entityManager.createNamedQuery("getNameAndPriceById");
		Object[] data2=(Object[]) query2.getSingleResult();
		for (Object object : data2) {
			System.out.println(object);
			
		}
		
	
	Query query3=entityManager.createNamedQuery("updateNameAndPriceById");
	query3.setParameter("name", "Lipstick");
	query3.setParameter("price", 100.00);
	query3.setParameter("id", 2);
	int update=query3.executeUpdate();
	System.out.println(update);
	entityManager.getTransaction().commit();	
			
		}
	
	
				
}

