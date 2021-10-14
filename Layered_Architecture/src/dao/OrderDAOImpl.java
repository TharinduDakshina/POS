package dao;

import model.OrderDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class OrderDAOImpl implements CrudDAO<OrderDTO, String> {


    @Override
    public boolean add(OrderDTO dto) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("INSERT INTO `Orders` (oid, date, customerID) VALUES (?,?,?)", dto.getOrderId(), dto.getOrderDate(), dto.getCustomerId());
    }

    @Override
    public boolean delete(String s) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(OrderDTO orderDTO) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public OrderDTO search(String oid) throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.executeQuery("SELECT oid FROM `Orders` WHERE oid=?", oid);
        rst.next();
        return new OrderDTO(rst.getString("oid"), LocalDate.parse(rst.getString("date")), rst.getString("customerID"));
    }

    @Override
    public ArrayList<OrderDTO> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }
}
