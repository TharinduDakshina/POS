package dao;

import model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public interface CustomerDAO {
    ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException;

    boolean addCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException;

    boolean updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException;

    boolean ifCustomerExist(String id) throws SQLException, ClassNotFoundException;

    boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException;

    String generateNewID() throws SQLException, ClassNotFoundException;
}
