package Jpql;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.User;

public class FetchByEmail {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em =emf.createEntityManager();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE EMAIL");
		String email=sc.next();
		
		Query q=em.createQuery("Select u from User u where u.email=?1");// for position parameter
		q.setParameter(1, email);
		
		User u =(User) q.getSingleResult();
		
		System.out.println(u);
	}

}
