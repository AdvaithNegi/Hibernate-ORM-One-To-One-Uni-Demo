package com.jsp.person.pan;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAll {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "select p from Pan p";
		Query query = entityManager.createQuery(sql);
		List<Pan> pans = query.getResultList();
		for (Pan pan : pans) {
			System.out.println("===================================");
			System.out.println("Pan ID     : " + pan.getId());
			System.out.println("Pan Name   : " + pan.getName());
			System.out.println("Pan Pan_no : " + pan.getPan_no());
			System.out.println("Pan Person : " + pan.getPerson());
		}
	}

}
