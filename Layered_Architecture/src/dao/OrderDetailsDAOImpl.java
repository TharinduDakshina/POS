package dao;

import model.OrderDetailDTO;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class OrderDetailsDAOImpl implements CrudDAO<OrderDetailDTO, String> {

    @Override
    public boolean add(OrderDetailDTO orderDetailDTO) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean delete(String s) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(OrderDetailDTO orderDetailDTO) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public OrderDetailDTO search(String s) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<OrderDetailDTO> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }
}
