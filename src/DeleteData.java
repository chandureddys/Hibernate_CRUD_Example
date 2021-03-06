import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    //creating seession factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    Transaction t=session.beginTransaction();  
	    
	    Customer c1=new Customer();
	    c1.setId(11);  
	    c1.setFirstName("sandeep");  
	    c1.setLastName("reddy");  
	      
	    session.delete(c1);;  
	      
	    t.commit();//transaction is committed  
	    session.close();  
	    System.out.println("succesfully deleted");
	      
		
	}

}
