package com.xworkz.jpa.jpa_example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.jpa.jpa_example.dto.HospitalDTO;

public class HospitalTester {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		// entityManager.persist(new
		// HospitalDTO(3,"Pulse","KurubaraHalli",8899568956L));
		// entityManager.merge(new
		// HospitalDTO(3,"PulseHospital","KurubaraHalli",8899568956L));
		// entityManager.getTransaction().commit();

		Query query = entityManager.createNamedQuery("getNameById");
		String dto = (String) query.getSingleResult();
		System.out.println(dto);
		System.out.println("------------------------------");

		Query query1 = entityManager.createNamedQuery("getNameAndNumber");
		List<Object[]> listOfData = (List<Object[]>) query1.getResultList();
		for (Object[] hospitalDTO : listOfData) {
			for (Object hospitalDTO2 : hospitalDTO) {
				System.out.println(hospitalDTO2);

			}
			System.out.println("------------------------------");
		}

		Query query2 = entityManager.createQuery("select hospitalName from HospitalDTO entity where id =:id");
		query2.setParameter("id", 3);
		String dto1 = (String) query2.getSingleResult();
		System.out.println(dto1);

		Query query3 = entityManager.createNamedQuery("updateNameById");
		query3.setParameter("name", "essential");

		query3.setParameter("id", 3);
		int update = query3.executeUpdate();
		System.out.println(update);
		entityManager.getTransaction().commit();

	}
}
