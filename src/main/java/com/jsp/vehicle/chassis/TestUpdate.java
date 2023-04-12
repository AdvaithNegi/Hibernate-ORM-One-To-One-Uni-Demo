package com.jsp.vehicle.chassis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Vehicle vehicle = entityManager.find(Vehicle.class, 4);
		Chassis chassis = entityManager.find(Chassis.class, 4);

		vehicle.setBrand("BMW");
		vehicle.setName("X1");
		vehicle.setColor("Blue");
		vehicle.setPrice(4500000);

		chassis.setChassis_no("xbmwx45");
		chassis.setVehicle(vehicle);

		entityTransaction.begin();
		entityManager.merge(vehicle);
		entityManager.merge(chassis);
		entityTransaction.commit();

	}
}
