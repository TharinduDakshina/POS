package dao;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class OrderDAOImpl implements CrudDAO {

    @Override
    public boolean add(Object ob) throws SQLException, ClassNotFoundException{
        return false;
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
    public Object search(Object ob)throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<Object> getAll()throws SQLException, ClassNotFoundException {
        return null;
    }
}
