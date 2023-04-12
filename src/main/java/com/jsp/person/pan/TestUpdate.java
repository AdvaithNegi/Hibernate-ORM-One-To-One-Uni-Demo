package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person = entityManager.find(Person.class, 5);
		person.setName("IDK");
		person.setEmail("IDK@mail.com");
		person.setGender("Male");
		person.setDob("17th August");

		Pan pan = entityManager.find(Pan.class, 5);
		pan.setName("IDK");
		pan.setPan_no("idk1708");

		entityTransaction.begin();
		entityManager.merge(person);
		entityManager.merge(pan);
		entityTransaction.commit();

	}
}
