package example.hibernate.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.time.LocalDate;
import example.hibernate.entity.Category;


import example.hibernate.entity.Article;


public class AddArticle {

	public static void main(String[] args) {
		try(SessionFactory factory=HibernateUtils.getSessionFactory();
			Session session=factory.openSession()
				)
		{
			Article article=new Article(3,"Ajanta",Category.valueOf("SCULPTURE"),LocalDate.of(2025,02,03),"Indian");
		    Transaction tx=session.beginTransaction();
		    session.persist(article);
		    tx.commit();
		    System.out.println("Article added successfully");
		}catch(Exception e)
		{
			
		}
	
	}

}
