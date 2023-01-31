package com.vaishali.model;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {
	
	public static void main(String[] args) {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

		MetadataSources mds = new MetadataSources(registry);

		Metadata md = mds.getMetadataBuilder().build();

		SessionFactory sessionFactory = md.getSessionFactoryBuilder().build();


}
}