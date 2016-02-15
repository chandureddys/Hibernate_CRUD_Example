import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectData {

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
	    
	    Query query = session.createQuery("from Customer");
	    List<Customer> customers = query.list(); 
	    
	    for(Customer customer : customers)  
	    {  
	  System.out.println("id: "+customer.getId()+", First Name: "+customer.getFirstName()+", lastName: "+customer.getLastName());  
	    }  
	    t.commit();//transaction is committed  
	    session.close();  
	      
	    System.out.println("successfully showed");
		
		
		
	}

}
