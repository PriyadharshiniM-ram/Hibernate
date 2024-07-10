package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		User u= em.find(User.class, 2);
		
		System.out.println(u);
	}

}
