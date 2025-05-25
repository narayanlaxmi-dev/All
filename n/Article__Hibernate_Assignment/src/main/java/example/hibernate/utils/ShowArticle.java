package example.hibernate.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import example.hibernate.entity.Article;

public class ShowArticle {
	
	
		public static void main(String[] args) {
			try(SessionFactory factory=HibernateUtils.getSessionFactory();
					Session session=factory.openSession()
						){
				Class <Article> entityType=Article.class;
				Object id=1;
				Article foundArticle=session.find(entityType, id);
				if(foundArticle!=null)
				{
				System.out.println("Found Article"+foundArticle);
				}
				else
					System.out.println("Article Does Not Exists!!!");
				}catch(Exception e)
				{
					e.printStackTrace();
				}


}
}
