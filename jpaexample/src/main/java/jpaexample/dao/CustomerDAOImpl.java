package jpaexample.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpaexample.entities.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public void addCustomer(Customer customer) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaexample");
        EntityManager em = emf.createEntityManager();
        //Insert data in database using persist method
        em.getTransaction().begin();
        em.persist(customer); //Persist the customer object or customer entity instance
        em.getTransaction().commit();
	}

	@Override
	public Customer getCustomerById(Integer customerId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaexample");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Customer cust = em.find(Customer.class, customerId);
		return cust;
	}

}
