package com.darcoo.Config;   

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Environment;

	
	public class EmpConfiguration {
	
		    public static SessionFactory getSessionFactory() {

		     

		            Properties properties = new Properties();
		            
		            
		            properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		    		properties.put(AvailableSettings.JAKARTA_JDBC_DRIVER, "com.mysql.cj.jdbc.Driver");
		            properties .put(Environment.JAKARTA_JDBC_URL,"jdbc:mysql://localhost:3306/hibernate");
		            properties .put(Environment.JAKARTA_JDBC_USER, "root");
		            properties .put(Environment.JAKARTA_JDBC_PASSWORD, "root");
		            properties .put(Environment.HBM2DDL_AUTO, "create"); // table create
		            properties .put(Environment.SHOW_SQL, "true");
		            properties .put(Environment.FORMAT_SQL, "true");
		            
		           

//		            StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(properties ).build();
//		            Metadata metadata = new MetadataSources(ssr).addAnnotatedClass(com.darcoo.entity.Employee.class).getMetadataBuilder().build();
//		            SessionFactory sessionFactory = metadata.buildSessionFactory();
//		            
//		            return sessionFactory;

		            return new MetadataSources(new StandardServiceRegistryBuilder().applySettings(properties ).build())
		            	.addAnnotatedClasses(com.darcoo.entity.Employee.class,com.darcoo.entity.Address.class)
//				        .addAnnotatedClass(com.darcoo.entity.Address.class)
				        .getMetadataBuilder().build().buildSessionFactory();
		            
		            
		            
		    }	
}

