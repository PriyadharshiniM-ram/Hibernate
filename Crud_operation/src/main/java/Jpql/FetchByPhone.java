package Jpql;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.User;



// for named parameter
public class FetchByPhone {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\tENTER THE PHONE NUMBER");
		long phone=sc.nextLong();
		
		Query q=em.createQuery("select u from User u where u.phone= :ph");
		q.setParameter("ph", phone);
		
		User u =(User)q.getSingleResult();
		
		System.out.println(u);
	}

}
