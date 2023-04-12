package com.jsp.vehicle.chassis;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAll {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "select c from Chassis c";
		Query query = entityManager.createQuery(sql);
		List<Chassis> chassis = query.getResultList();
		for (Chassis chassis2 : chassis) {
			System.out.println("============================================================");
			System.out.println("Chassis ID          : " + chassis2.getId());
			System.out.println("Chassis Chassis_No  : " + chassis2.getChassis_no());
			System.out.println("Chassis Vehicle     : " + chassis2.getVehicle());
		}

	}
}
