package dao;

import model.ItemDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class ItemDAOImpl implements CrudDAO {
    @Override
    public boolean add(Object ob) throws SQLException, ClassNotFoundException{
        return false;
    }

    @Override
    public boolean delete(Object ob)throws SQLException, ClassNotFoundException {
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

//    @Override
//    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException {
//        ArrayList<ItemDTO> allItems = new ArrayList<>();
//        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Item");
//        while (rst.next()) {
//            allItems.add(new ItemDTO(rst.getString("code"), rst.getString("description"), rst.getBigDecimal("unitPrice"), rst.getInt("qtyOnHand")));
//        }
//        return allItems;
//    }
//
//    @Override
//    public boolean deleteItem(String code) throws SQLException, ClassNotFoundException {
//        return CrudUtil.executeUpdate("DELETE FROM Item WHERE code=?", code);
//    }
//
//    @Override
//    public boolean saveItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
//        return CrudUtil.executeUpdate("INSERT INTO Item (code, description, unitPrice, qtyOnHand) VALUES (?,?,?,?)", dto.getCode(), dto.getDescription(), dto.getUnitPrice(), dto.getQtyOnHand());
//    }
//
//    @Override
//    public boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
//        return CrudUtil.executeUpdate("UPDATE Item SET description=?, unitPrice=?, qtyOnHand=? WHERE code=?", dto.getDescription(), dto.getUnitPrice(), dto.getQtyOnHand(), dto.getCode());
//    }
//
//
//    @Override
//    public boolean ifItemExist(String code) throws SQLException, ClassNotFoundException {
//        return CrudUtil.executeQuery("SELECT code FROM Item WHERE code=?", code).next();
//    }
//
//    @Override
//    public String generateNewID() throws SQLException, ClassNotFoundException {
//        ResultSet rst = CrudUtil.executeQuery("SELECT code FROM Item ORDER BY code DESC LIMIT 1;");
//        if (rst.next()) {
//            String id = rst.getString("code");
//            int newItemId = Integer.parseInt(id.replace("I", "")) + 1;
//            return String.format("I%03d", newItemId);
//        } else {
//            return "I001";
//        }
//    }
}
