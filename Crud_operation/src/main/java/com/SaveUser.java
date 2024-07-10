package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveUser {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		 EntityTransaction et =em.getTransaction();
		 
		 User u= new User();
		 u.setId(3);
		 u.setFirstName("Hari");
		 u.setLastName("M");
		 u.setEmail("hari@gmail.com");
		 u.setPassword("1234");
		 u.setPhone(987658767);
		 
		 et.begin();
		 em.persist(u);
		 et.commit();
		 
		 System.out.println("DATA SAVED......");
		 
		 
	}

}
