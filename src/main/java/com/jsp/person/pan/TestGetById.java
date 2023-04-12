package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Pan pan = entityManager.find(Pan.class, 1);

		System.out.println("Pan ID     : " + pan.getId());
		System.out.println("Pan Name   : " + pan.getName());
		System.out.println("Pan Pan_no : " + pan.getPan_no());
		System.out.println("Pan Person : " + pan.getPerson());
	}
}
