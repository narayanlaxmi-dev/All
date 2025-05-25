
package example.hibernate.utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import example.hibernate.entity.Article;

public class HibernateUtils {

	public static SessionFactory getSessionFactory()
	{
		Configuration conf=new Configuration();
		Properties hibernateProperties=new Properties();
		hibernateProperties.put("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
		hibernateProperties.put("hibernate.connection.url","jdbc:mysql://localhost:3306/cdac" );
		hibernateProperties.put("hibernate.connection.username", "root");
		hibernateProperties.put("hibernate.connection.password","password" );
		hibernateProperties.put("hibernate.show_sql", "true");
		hibernateProperties.put("hibernate.hbm2ddl.auto","update" );
		conf.setProperties(hibernateProperties);
		Class<Article> entityClass=Article.class;
		conf.addAnnotatedClass(entityClass);
		SessionFactory factory=conf.buildSessionFactory();
		return factory;
		
	}
	{
		
	}

}
