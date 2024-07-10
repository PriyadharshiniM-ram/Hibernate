package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchByEmail {
	
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		
	    Query q    =    em.createQuery("select u from User u where u.email='priya@gmail.com'");
	    
	    Object o =q.getSingleResult();
	    
	    User u =(User)o;
	    
	    System.out.println(u);
	    
	}

}
