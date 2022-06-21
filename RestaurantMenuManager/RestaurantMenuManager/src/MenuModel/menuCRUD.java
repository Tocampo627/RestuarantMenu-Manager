
package MenuModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class menuCRUD {
    
 ///// defining connection variables
    final private String jdbcURL= "jdbc:mysql://localhost:3306/menumanager";
    final private String jdbcUserName = "root";
    final private String jdbcPassword = "";
    
 ////  SQL statement variables
    private static final String INSERT_DISH_SQL = "INSERT INTO dish" + 
            " (DishName, DishCost, CuisineType, Spicy, LimitedTimeDate) VALUES " +
            " (?, ?, ?, ?, ?);";
    private static final String SELECT_DISH_BY_ID = "select DishID, DishName, DishCost, CuisineType, Spicy, LimitedTimeDate from dish where DishID =?";
    private static final String SELECT_ALL_DISH = "select * from dish";
    private static final String DELETE_DISH_SQL = "delete from dish where DishID = ?;";
    private static final String UPDATE_DISH_SQL = "update dish set DishName = ?, DishCost= ?, CuisineType= ?, Spicy= ?, LimitedTimeDate= ? where DishID = ?;";
 /// Empty Constructor????   
    public menuCRUD(){
        
    }
 ///// connection
   protected Connection getConnection(){
       Connection conn = null; 
        
        try{
            conn= DriverManager.getConnection(jdbcURL,jdbcUserName,jdbcPassword);
            if(conn!= null){
                System.out.println("Connection to database was successful");
            }
        }
        catch(SQLException e){
            System.out.println("Connection to database failed");
            e.printStackTrace();
        }
        
        return conn;
    }  
 ///Insert Method
    public void insertDish(Menu dish){
        
        try{
          
            Connection conn = getConnection();
            PreparedStatement prepStmt = conn.prepareStatement(INSERT_DISH_SQL);
            prepStmt.setString(1, dish.getDishName());
            prepStmt.setDouble(2, dish.getDishCost());
            prepStmt.setString(3, dish.getCuisineType());
            prepStmt.setString(4, dish.getSpicy());
            prepStmt.setString(5, dish.getLimitedTimeDate());
            prepStmt.executeUpdate();
        }
        catch(SQLException e){
            printSQLException(e);
        }
        
    }
 //// Selection Method based on ID 
    public Menu selectDish(int DishID){
        Menu menu = null;
        
        try(Connection conn = getConnection(); 
            PreparedStatement prepStmt = conn.prepareStatement(SELECT_DISH_BY_ID);)
               
        {  
         prepStmt.setInt(1, DishID);
         
         ResultSet rs = prepStmt.executeQuery();
         
         while(rs.next()){
             String DishName = rs.getString("DishName");
             double DishCost = rs.getDouble("DishCost");
             String CuisineType= rs.getString("CuisineType");
             String Spicy= rs.getString("Spicy");
             String LimitedTimeDate= rs.getString("LimitedTimeDate");
            menu = new Menu(DishID, DishName, DishCost, CuisineType, Spicy, LimitedTimeDate);
         }
        }
        catch(SQLException e){
          printSQLException(e);  
        }
        return menu;
    }
 //// Selectin ALL Menu Items    
    public List <Menu> selectAllDish(){
        List<Menu> menu = new ArrayList<>();
        try(Connection conn = getConnection(); 
            PreparedStatement prepStmt = conn.prepareStatement(SELECT_ALL_DISH);){
            ResultSet rs= prepStmt.executeQuery();
            
             while(rs.next()){              
             int DishID= rs.getInt("DishID");
             String DishName = rs.getString("DishName");
             double DishCost = rs.getDouble("DishCost");
             String CuisineType= rs.getString("CuisineType");
             String Spicy= rs.getString("Spicy");
             String LimitedTimeDate= rs.getString("LimitedTimeDate");
             menu.add(new Menu(DishID, DishName, DishCost, CuisineType, Spicy, LimitedTimeDate));
        }     
 
        }
        
        catch(SQLException e){
          printSQLException(e);  
        }
        return menu;
    }
    
    public boolean deleteDish(int DishID) throws SQLException{
        boolean rowDeleted; // default value is false
        try(Connection conn = getConnection(); 
            PreparedStatement prepStmt = conn.prepareStatement(DELETE_DISH_SQL);){
            prepStmt.setInt(1, DishID);
            rowDeleted = prepStmt.executeUpdate()>0;
        }
        return rowDeleted;
    }
    public boolean updateUser(Menu dish) throws SQLException{
        boolean rowUpdated;
        try(Connection conn = getConnection(); 
            PreparedStatement prepStmt = conn.prepareStatement(UPDATE_DISH_SQL);){
            
            prepStmt.setString(1, dish.getDishName());
            prepStmt.setDouble(2, dish.getDishCost());
            prepStmt.setString(3, dish.getCuisineType());
            prepStmt.setString(4, dish.getSpicy());
            prepStmt.setString(5, dish.getLimitedTimeDate());
            prepStmt.setInt(6, dish.getDishID());
            
            rowUpdated = prepStmt.executeUpdate()>0;
        }
        return rowUpdated;
    }
       
    
    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
