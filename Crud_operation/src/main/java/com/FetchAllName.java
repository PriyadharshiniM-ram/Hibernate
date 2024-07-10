package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllName {
	
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em =emf.createEntityManager();
		
		Query q=em.createQuery("select u.firstName  from User u");
		
		List<String>  list=q.getResultList();
		
		System.out.println(list);
		
//		
//		List<String>  list=q.getResultList();
//	
//	for (String u : list) {
//		System.out.println(u);
//	}
		
		
		
		
	}

}
