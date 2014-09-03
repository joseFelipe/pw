package br.senai.sc.ti20131n.pw.introducaojpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("introducaojpa_pu");
		
		entityManagerFactory.close();

	}

}
