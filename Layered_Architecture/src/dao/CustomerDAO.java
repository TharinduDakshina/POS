package dao;

import model.CustomerDTO;

import java.sql.SQLException;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public interface CustomerDAO extends CrudDAO<CustomerDTO, String> {
    boolean ifCustomerExist(String id) throws SQLException, ClassNotFoundException;
    String generateNewID() throws SQLException, ClassNotFoundException;
}
