package com.jsp.vehicle.chassis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Chassis chassis = entityManager.find(Chassis.class, 1);

		System.out.println("Chassis ID          : " + chassis.getId());
		System.out.println("Chassis Chassis_No  : " + chassis.getChassis_no());
		System.out.println("Chassis Vehicle     : " + chassis.getVehicle());

	}
}
