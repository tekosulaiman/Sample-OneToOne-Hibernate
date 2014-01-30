package test;

import model.UserDetails;
import model.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import resources.HibernateUtil;

/**
 * @author tombisnis@yahoo.com
 */
public class TestOneToOne {
    public static void main(String[]args){
        UserDetails userDetails = new UserDetails();
        userDetails.setUserName("Tom");
        
        Vehicle vehicle = new Vehicle();
        vehicle.setVihicleName("Tom Vehicle");
        
        /*One To One*/
        userDetails.setVehicle(vehicle);

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        session.save(userDetails);
        session.save(vehicle);
        session.getTransaction().commit();
    }
}