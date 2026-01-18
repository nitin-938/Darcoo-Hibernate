package com.darcoo.Config;

	import java.util.Properties; 
	import org.hibernate.SessionFactory;
	import org.hibernate.boot.Metadata;
	import org.hibernate.boot.MetadataSources;
	import org.hibernate.boot.registry.StandardServiceRegistry;
	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
	import org.hibernate.cfg.Environment;

	import com.darcoo.entity.Employee;

	
	public class EmpConfiguration {
	
		    public static SessionFactory getSessionFactory() {

		     

		            Properties properties = new Properties();

		            properties .put(Environment.JAKARTA_JDBC_URL,"jdbc:mysql://localhost:3306/hibernate");
		            
		            properties .put(Environment.JAKARTA_JDBC_USER, "root");
		            properties .put(Environment.JAKARTA_JDBC_PASSWORD, "root");
		            properties .put(Environment.HBM2DDL_AUTO, "update"); // table create
		            properties .put(Environment.SHOW_SQL, "true");
		            properties .put(Environment.FORMAT_SQL, "true");
//
//		            StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(properties ).build();
//		            Metadata metadata = new MetadataSources(ssr).addAnnotatedClass(com.darcoo.entity.Employee.class).getMetadataBuilder().build();
//		            SessionFactory sessionFactory = metadata.buildSessionFactory();
		            
//		            return sessionFactory;

		            
//		            single line method chaining
		            
		           return new MetadataSources(new StandardServiceRegistryBuilder().applySettings(properties ).build()).addAnnotatedClass(com.darcoo.entity.Employee.class).getMetadataBuilder().build().buildSessionFactory();
		            
		            
		            
		            
		    }	
}
