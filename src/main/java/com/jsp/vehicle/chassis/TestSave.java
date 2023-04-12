package com.jsp.vehicle.chassis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Vehicle vehicle = new Vehicle();
		vehicle.setName("Ertiga");
		vehicle.setBrand("Maruti");
		vehicle.setColor("Grey");
		vehicle.setPrice(800000);

		Chassis chassis = new Chassis();
		chassis.setChassis_no("MSEA8181");
		chassis.setVehicle(vehicle);

		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityManager.persist(chassis);
		entityTransaction.commit();

	}
}
