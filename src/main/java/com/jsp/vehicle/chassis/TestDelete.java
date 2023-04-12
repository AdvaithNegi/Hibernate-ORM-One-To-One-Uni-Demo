package com.jsp.vehicle.chassis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDelete {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Chassis chassis = entityManager.find(Chassis.class, 5);
		Vehicle vehicle = entityManager.find(Vehicle.class, 5);

		entityTransaction.begin();
		entityManager.remove(vehicle);
		entityManager.remove(chassis);
		entityTransaction.commit();

	}
}
