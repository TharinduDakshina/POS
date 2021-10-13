package dao;

import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public interface CrudDAO {
    public boolean add(Object ob);
    public boolean delete(Object ob);
    public boolean update(Object ob);
    public Object search(Object ob);
    public ArrayList<Object> getAll();
}
