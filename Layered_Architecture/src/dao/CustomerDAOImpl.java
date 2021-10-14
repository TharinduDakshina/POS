package dao;

import model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/

public class CustomerDAOImpl implements CrudDAO {
    @Override
    public boolean add(Object dto) throws SQLException, ClassNotFoundException {
        CustomerDTO d = (CustomerDTO) dto;
        return CrudUtil.executeUpdate("INSERT INTO Customer (id,name, address) VALUES (?,?,?)", d.getId(), d.getName(), d.getAddress());
    }

    @Override
    public boolean delete(Object ob) throws SQLException, ClassNotFoundException{
        return false;
    }

    @Override
    public boolean update(Object ob) throws SQLException, ClassNotFoundException{
        return false;
    }

    @Override
    public Object search(Object ob) throws SQLException, ClassNotFoundException{
        return null;
    }

    @Override
    public ArrayList<Object> getAll()throws SQLException, ClassNotFoundException {
        return null;
    }

//    @Override
//    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException {
//        ArrayList<CustomerDTO> allCustomers = new ArrayList();
//        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer");
//        while (rst.next()) {
//            allCustomers.add(new CustomerDTO(rst.getString("id"), rst.getString("name"), rst.getString("address")));
//        }
//        return allCustomers;
//    }
//
//    @Override
//    public boolean addCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {
//        return CrudUtil.executeUpdate("INSERT INTO Customer (id,name, address) VALUES (?,?,?)", dto.getId(), dto.getName(), dto.getAddress());
//    }
//
//    @Override
//    public boolean updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {
//        return CrudUtil.executeUpdate("UPDATE Customer SET name=?, address=? WHERE id=?", dto.getName(), dto.getAddress(), dto.getId());
//    }
//
//    @Override
//    public boolean ifCustomerExist(String id) throws SQLException, ClassNotFoundException {
//        return CrudUtil.executeQuery("SELECT id FROM Customer WHERE id=?", id).next();
//    }
//
//    @Override
//    public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException {
//        return CrudUtil.executeUpdate("DELETE FROM Customer WHERE id=?", id);
//    }
//
//    @Override
//    public String generateNewID() throws SQLException, ClassNotFoundException {
//        ResultSet rst = CrudUtil.executeQuery("SELECT id FROM Customer ORDER BY id DESC LIMIT 1;");
//        if (rst.next()) {
//            String id = rst.getString("id");
//            int newCustomerId = Integer.parseInt(id.replace("C", "")) + 1;
//            return String.format("C%03d", newCustomerId);
//        } else {
//            return "C001";
//        }
//    }
}
