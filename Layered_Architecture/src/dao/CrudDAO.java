package dao;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public interface CrudDAO {
    public boolean add(Object ob) throws SQLException, ClassNotFoundException;
    public boolean delete(Object ob)throws SQLException, ClassNotFoundException;
    public boolean update(Object ob)throws SQLException, ClassNotFoundException;
    public Object search(Object ob)throws SQLException, ClassNotFoundException;
    public ArrayList<Object> getAll()throws SQLException, ClassNotFoundException;
}
