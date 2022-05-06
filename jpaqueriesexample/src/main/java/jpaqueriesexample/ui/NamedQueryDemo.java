package jpaqueriesexample.ui;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import jpaqueriesexample.entities.AirFlight;

public class NamedQueryDemo {
	private static EntityManagerFactory EMF=null;
	private static EntityManager em=null;
	
	public static void main(String[] args) {
		try {
			EMF=Persistence.createEntityManagerFactory("jpaqueriesexample");
			em=EMF.createEntityManager();
			
			Query q1= em.createNamedQuery("allFlights");
			List<AirFlight> airFlights=q1.getResultList();
			System.out.println(airFlights);
			
			System.out.println("-------------------------");			
			TypedQuery<AirFlight> q2= 
					em.createNamedQuery("flightsToChennai", AirFlight.class);
			List<AirFlight> flightsToChennai= q2.getResultList();
			System.out.println(flightsToChennai);
			
			AirFlight airFlight = new AirFlight("3","6E","Indigo","DELHI","PUNE",Date.valueOf(LocalDate.now().plusDays(1)),Date.valueOf(LocalDate.now().plusDays(2)),Date.valueOf(LocalDate.now()),1);
			em.getTransaction().begin();
			em.persist(airFlight);
			em.getTransaction().commit();
			
		}catch(PersistenceException e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			em.close();
			EMF.close();
		}
		

	}

}
