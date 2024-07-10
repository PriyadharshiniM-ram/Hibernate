package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchByPhone {
	
	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Query q =em.createQuery("select u from User u  order By phone Desc");
		
		List<User> l =q.getResultList();
		
		for (User u : l) {
			System.out.println(u);
		}
		
		
	}

}
