
package nanthahoban.AirlineTicketBookingSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CustomerDAO {
    
    public static void addCustomer(Customer customer){
        
    Connection con;
    PreparedStatement pst;
    
           try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_ticket_booking_db","root","");
            pst = con.prepareStatement("insert into customer(id,firstname,lastname,dob,nic,passport,gender,contact,address)values(?,?,?,?,?,?,?,?,?)");
            
            pst.setString(1, customer.getId());
            pst.setString(2, customer.getFirstName());
            pst.setString(3, customer.getLastName());
            pst.setString(4, customer.getDOB());
            pst.setString(5, customer.getNIC());
            pst.setString(6, customer.getPassport());
            pst.setString(7, customer.getGender());
            pst.setString(8, customer.getContact());
            pst.setString(9, customer.getAddress());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Customer Registered.....");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
