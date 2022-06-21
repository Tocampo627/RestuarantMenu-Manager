

package MenuModel;



public class Menu {
    protected int DishID;
    protected String DishName;
    protected double DishCost;
    protected String CuisineType;
    protected String Spicy;
    protected String LimitedTimeDate;    
    
    public Menu(){}
    
    public Menu(String DishName, double DishCost, String CuisineType, String Spicy, String LimitedTimeDate){
      super();
      this.DishName= DishName;
      this.DishCost= DishCost;
      this.CuisineType= CuisineType;
      this.Spicy= Spicy;
      this.LimitedTimeDate= LimitedTimeDate;
    }
    public Menu(int DishID ,String DishName, double DishCost, String CuisineType, String Spicy, String LimitedTimeDate){
      super();
      this.DishID= DishID;
      this.DishName= DishName;
      this.DishCost= DishCost;
      this.CuisineType= CuisineType;
      this.Spicy= Spicy;
      this.LimitedTimeDate= LimitedTimeDate;
    }
  // setters   
    public void setDishID(int DishID){
       this.DishID= DishID; 
    }
    public void setDishName(String DishName){
       this.DishName= DishName; 
    }
    public void setDishCost(double DishCost){
        this.DishCost=DishCost;
    }
    public void setCuisineType(String CuisineType){
        this.CuisineType=CuisineType;
    }
    public void setSpicy(String Spicy){
        this.Spicy=Spicy;
    }
    public void setLimitedTimeDate(String LimitedTimeDate){
        this.LimitedTimeDate=LimitedTimeDate;
    }
    
 //// getters 
    public int getDishID(){
        return DishID;
    }
    public String getDishName(){
        return DishName;
    }
    public double getDishCost(){
        return DishCost;
    }
    public String getCuisineType(){
        return CuisineType;
    }
    public String getSpicy(){
        return Spicy;
    }
    public String getLimitedTimeDate(){
        return LimitedTimeDate;
    }
    
    
}
