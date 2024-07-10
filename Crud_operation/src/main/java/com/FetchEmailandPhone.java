package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchEmailandPhone {
	
	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em =emf.createEntityManager();
		
		Query q =em.createQuery("select u.email,u.phone from User u");
		List<Object[]> l =q.getResultList();
		
		for (Object[] o : l) {
			System.out.println("Email ="+o[0]+"    phone ="+o[1]);
			
		}
	}

}
