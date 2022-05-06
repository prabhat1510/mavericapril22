package jpaqueriesexample.onetooneuni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneUI {
	private static EntityManagerFactory EMF=null;
	private static EntityManager em=null;
	
	public static void main(String[] args) {
		EMF=Persistence.createEntityManagerFactory("jpaqueriesexample");
		em=EMF.createEntityManager();
		/**Student student= em.find(Student.class, 1);
		System.out.println(student.getStudentId()+","+student.getName());
		Address address = student.getAdddress();
		System.out.println(address.getCity());
		
		Student stud = new Student();
		stud.setName("Joe Biden");
		
		Address add = new Address();
		add.setCity("Ahmedabad");
		add.setState("Gujarat");
		add.setStreet("Khao Gali");
		add.setZipCode("421");
		
		//inject address into student
		stud.setAdddress(add);
		
		em.getTransaction().begin();
		//persist only student, no need to persist Address explicitly
		em.persist(stud);
		em.getTransaction().commit(); **/
		/***Address add1 = new Address();
		add1.setAddressId(2);**/
		
		/**
		em.getTransaction().begin();
		Address add1 = em.find(Address.class, 2);
		em.remove(add1);
		em.getTransaction().commit();
		**/
		//Cascade operation successful in case of one student and one address 
		/**em.getTransaction().begin();
		Student student1 = em.find(Student.class, 9);
		em.remove(student1);
		em.getTransaction().commit();
		**/
		em.getTransaction().begin();
		Student student1 = em.find(Student.class, 2);
		em.remove(student1);
		em.getTransaction().commit();
	}

}
