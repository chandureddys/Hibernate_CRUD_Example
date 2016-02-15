import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    //creating seession factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
		Transaction tx=session.beginTransaction();  
		Query q=session.createQuery("update Customer set firstName=:n where id=:i");  
		q.setParameter("n","chandrasekhar");  
		q.setParameter("i",117);  
		  
		int status=q.executeUpdate();  
		System.out.println(status);  
		tx.commit();  
	}

}
