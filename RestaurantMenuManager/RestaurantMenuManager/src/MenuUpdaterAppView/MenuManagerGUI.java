
package MenuUpdaterAppView;
import MenuModel.Menu;
import MenuModel.menuCRUD;
import java.awt.*;
import javax.swing.*;
import javax.swing.JTabbedPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class MenuManagerGUI  extends JFrame{
    public static final int width=400;
    public static final int height=500;
    
    private menuCRUD mCrud = new menuCRUD();
    
    private JTabbedPane tabbedPane;
    
    private Menu item;
    private Menu item2;
    private Menu item3;
    private Menu item4;
    
  ////// Panel1 items //////  
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JTable table4;
       ///// PANEL 1 labels 
    private JLabel lblTitle;
    private JLabel lblDishName;
    private JLabel lblDishCost;
    private JLabel lblCuisineType;
    private JLabel lblSpicy;
    private JLabel lblLimitedTimeDate;
        ///// PANEL 1 Text Fields 
    private JTextField txtTitle;
    private JTextField txtDishName;
    private JTextField txtDishCost;
    private JTextField txtCuisineType;
    private JTextField txtSpicy;
    private JTextField txtLimitedTimeDate;
        ///// Panel1 Buttons 
    private JButton btnSave;
    private JButton btnClear;
    
    ////// Panel2 items //////  
    
       ///// PANEL 2 labels 
    private JLabel lblTitle2;
    private JLabel lblDishID2;
    private JLabel lblDishName2;
    private JLabel lblDishCost2;
    private JLabel lblCuisineType2;
    private JLabel lblSpicy2;
    private JLabel lblLimitedTimeDate2;
        ///// PANEL 2 Text Fields 
    private JTextField txtTitle2;
    private JTextField txtDishID2;
    private JTextField txtDishName2;
    private JTextField txtDishCost2;
    private JTextField txtCuisineType2;
    private JTextField txtSpicy2;
    private JTextField txtLimitedTimeDate2;
        ///// Panel Buttons 
    private JButton btnSearch2;
    private JButton btnDelete2;
    private JButton btnClear2;
    
    
       ///// PANEL 3 labels 
    private JLabel lblTitle3;
    private JLabel lblDishID3;
    private JLabel lblDishName3;
    private JLabel lblDishCost3;
    private JLabel lblCuisineType3;
    private JLabel lblSpicy3;
    private JLabel lblLimitedTimeDate3;
        ///// PANEL 3 Text Fields 
    private JTextField txtTitle3;
    private JTextField txtDishID3;
    private JTextField txtDishName3;
    private JTextField txtDishCost3;
    private JTextField txtCuisineType3;
    private JTextField txtSpicy3;
    private JTextField txtLimitedTimeDate3;
        //// Panel 3 Buttons 
    private JButton btnSearch3;
    private JButton btnUpdate3;
    private JButton btnClear3;
    
    
    
    
    
    
    
    public MenuManagerGUI(){
        super();
        createPanel();
        setFrame();
            
    }
    private void createPanel(){
        super.setLayout(null);
        tabbedPane = new JTabbedPane();
        panel1= new JPanel(null);
        panel2= new JPanel(null);
        panel3= new JPanel(null);
        panel4= new JPanel(null);
       
 ////////////////////   PANEL 1 Set Up /////////////// ///////////////    
       panel1.setSize(400,480);
       lblTitle=new JLabel("Menu Manager");
       lblTitle.setFont(new Font("Veranda", Font.BOLD, 20));
       lblTitle.setHorizontalAlignment(JLabel.CENTER);
       lblTitle.setForeground(Color.PINK);
       lblTitle.setBounds(90, 20, 220, 30);
       panel1.add(lblTitle);
       
       lblDishName=new JLabel("Dish Name : ");
       txtDishName = new JTextField(20);
       lblDishName.setHorizontalAlignment(JLabel.RIGHT);
       lblDishName.setBounds(100, 70, 100, 25);
       txtDishName.setBounds(200, 70, 100, 25);
       panel1.add(lblDishName);
       panel1.add(txtDishName);
       //////
       lblDishCost=new JLabel("Dish Cost : ");
       txtDishCost = new JTextField(20);
       lblDishCost.setHorizontalAlignment(JLabel.RIGHT);
       lblDishCost.setBounds(100, 105, 100, 25);
       txtDishCost.setBounds(200, 105, 100, 25);
       panel1.add(lblDishCost);
       panel1.add(txtDishCost);
       ////
       lblCuisineType=new JLabel("Cuisine Type : ");
       txtCuisineType = new JTextField(20);
       lblCuisineType.setHorizontalAlignment(JLabel.RIGHT);
       lblCuisineType.setBounds(100, 140, 100, 25);
       txtCuisineType.setBounds(200, 140, 120, 25);
       panel1.add(lblCuisineType);
       panel1.add(txtCuisineType);
       /////
       lblSpicy=new JLabel("Spicy : ");
       txtSpicy = new JTextField(20);
       lblSpicy.setHorizontalAlignment(JLabel.RIGHT);
       lblSpicy.setBounds(100, 175, 100, 25);
       txtSpicy.setBounds(200, 175, 120, 25);
       panel1.add(lblSpicy);
       panel1.add(txtSpicy);
       ////
       lblLimitedTimeDate=new JLabel("End Date : ");
       txtLimitedTimeDate = new JTextField(20);
       lblLimitedTimeDate.setHorizontalAlignment(JLabel.RIGHT);
       lblLimitedTimeDate.setBounds(100, 210, 100, 25);
       txtLimitedTimeDate.setBounds(200, 210, 100, 25);     
       panel1.add(lblLimitedTimeDate);
       panel1.add(txtLimitedTimeDate);
       //////
       btnSave=new JButton("Save Menu Item");
       btnSave.addActionListener(new Save());
       btnSave.setBounds(80,360,130,25);
       panel1.add(btnSave);
       
       btnClear=new JButton("Clear Items");
       btnClear.addActionListener(new ClearMenuItem());
       btnClear.setBounds(230,360,100,25);
       panel1.add(btnClear);
       
 ////////////////////  PANEL 2 Set Up /////////////// /////////////// 
        panel2.setSize(400, 480);
        lblTitle2=new JLabel("Delete Menu Item");
        lblTitle2.setFont(new Font("Veranda", Font.BOLD,20));
        lblTitle2.setHorizontalAlignment(JLabel.CENTER);
        lblTitle2.setForeground(Color.PINK);
        lblTitle2.setBounds(100,20,230,30);
        panel2.add(lblTitle2);
        
        lblDishID2=new JLabel("Dish Item ID : ");
        txtDishID2=new JTextField(20);
        lblDishID2.setHorizontalAlignment(JLabel.RIGHT);
        lblDishID2.setBounds(100, 70, 100,25);
        txtDishID2.setBounds(200, 70, 100,25);
        panel2.add(lblDishID2);
        panel2.add(txtDishID2);
        
        
       lblDishName2=new JLabel("Dish Name : ");
       txtDishName2 = new JTextField(20);
       lblDishName2.setHorizontalAlignment(JLabel.RIGHT);
       lblDishName2.setBounds(100, 105, 100, 25);
       txtDishName2.setBounds(200, 105, 100, 25);
       panel2.add(lblDishName2);
       panel2.add(txtDishName2);
       //////
       lblDishCost2=new JLabel("Dish Cost : ");
       txtDishCost2 = new JTextField(20);
       lblDishCost2.setHorizontalAlignment(JLabel.RIGHT);
       lblDishCost2.setBounds(100, 140, 100, 25);
       txtDishCost2.setBounds(200, 140, 100, 25);
       panel2.add(lblDishCost2);
       panel2.add(txtDishCost2);
       ////
       lblCuisineType2=new JLabel("Cuisine Type : ");
       txtCuisineType2 = new JTextField(20);
       lblCuisineType2.setHorizontalAlignment(JLabel.RIGHT);
       lblCuisineType2.setBounds(100, 175, 100, 25);
       txtCuisineType2.setBounds(200, 175, 120, 25);
       panel2.add(lblCuisineType2);
       panel2.add(txtCuisineType2);
       /////
       lblSpicy2=new JLabel("Spicy : ");
       txtSpicy2= new JTextField(20);
       lblSpicy2.setHorizontalAlignment(JLabel.RIGHT);
       lblSpicy2.setBounds(100, 210, 100, 25);
       txtSpicy2.setBounds(200, 210, 120, 25);
       panel2.add(lblSpicy2);
       panel2.add(txtSpicy2);
       ////
       lblLimitedTimeDate2=new JLabel("End Date : ");
       txtLimitedTimeDate2 = new JTextField(20);
       lblLimitedTimeDate2.setHorizontalAlignment(JLabel.RIGHT);
       lblLimitedTimeDate2.setBounds(100, 245, 100, 25);
       txtLimitedTimeDate2.setBounds(200, 245, 100, 25);     
       panel2.add(lblLimitedTimeDate2);
       panel2.add(txtLimitedTimeDate2);
       //////
       btnSearch2=new JButton("Search");
       btnSearch2.addActionListener(new Search2());
       btnSearch2.setBounds(80,390,80,25);
       panel2.add(btnSearch2);
       
       btnDelete2=new JButton("Delete");
       btnDelete2.addActionListener(new DeleteMenuItem());
       btnDelete2.setBounds(230,360,100,25);
       panel2.add(btnDelete2);
        
        btnDelete2.setBounds(160, 390, 80, 25);
        btnDelete2.setEnabled(false);
        panel2.add(btnDelete2);
        
////////////////////   PANEL 3 Set Up /////////////// /////////////// 
        lblTitle3=new JLabel("Update Menu Item");
        lblTitle3.setFont(new Font("Veranda", Font.BOLD,20));
        lblTitle3.setHorizontalAlignment(JLabel.CENTER);
        lblTitle3.setForeground(Color.PINK);
        lblTitle3.setBounds(100,20,230,30);
        panel3.add(lblTitle3);
        
        lblDishID3=new JLabel("Dish Item ID : ");
        txtDishID3=new JTextField(20);
        lblDishID3.setHorizontalAlignment(JLabel.RIGHT);
        lblDishID3.setBounds(100, 70, 100,25);
        txtDishID3.setBounds(200, 70, 100,25);
        panel3.add(lblDishID3);
        panel3.add(txtDishID3);
        
        
       lblDishName3=new JLabel("Dish Name : ");
       txtDishName3 = new JTextField(20);
       lblDishName3.setHorizontalAlignment(JLabel.RIGHT);
       lblDishName3.setBounds(100, 105, 100, 25);
       txtDishName3.setBounds(200, 105, 100, 25);
       panel3.add(lblDishName3);
       panel3.add(txtDishName3);
       //////
       lblDishCost3=new JLabel("Dish Cost : ");
       txtDishCost3 = new JTextField(20);
       lblDishCost3.setHorizontalAlignment(JLabel.RIGHT);
       lblDishCost3.setBounds(100, 140, 100, 25);
       txtDishCost3.setBounds(200, 140, 100, 25);
       panel3.add(lblDishCost3);
       panel3.add(txtDishCost3);
       ////
       lblCuisineType3=new JLabel("Cuisine Type : ");
       txtCuisineType3 = new JTextField(20);
       lblCuisineType3.setHorizontalAlignment(JLabel.RIGHT);
       lblCuisineType3.setBounds(100, 175, 100, 25);
       txtCuisineType3.setBounds(200, 175, 120, 25);
       panel3.add(lblCuisineType3);
       panel3.add(txtCuisineType3);
       /////
       lblSpicy3=new JLabel("Spicy : ");
       txtSpicy3= new JTextField(20);
       lblSpicy3.setHorizontalAlignment(JLabel.RIGHT);
       lblSpicy3.setBounds(100, 210, 100, 25);
       txtSpicy3.setBounds(200, 210, 120, 25);
       panel3.add(lblSpicy3);
       panel3.add(txtSpicy3);
       ////
       lblLimitedTimeDate3=new JLabel("End Date : ");
       txtLimitedTimeDate3 = new JTextField(20);
       lblLimitedTimeDate3.setHorizontalAlignment(JLabel.RIGHT);
       lblLimitedTimeDate3.setBounds(100, 245, 100, 25);
       txtLimitedTimeDate3.setBounds(200, 245, 100, 25);     
       panel3.add(lblLimitedTimeDate3);
       panel3.add(txtLimitedTimeDate3);
       
       //Buttons
        btnSearch3=new JButton("Search");
        btnSearch3.addActionListener(new Search3());
        btnSearch3.setBounds(70, 390, 80, 25);
        panel3.add(btnSearch3);
        
        btnUpdate3=new JButton("Update");
        btnUpdate3.addActionListener(new Update3());
        btnUpdate3.setBounds(160, 390, 80, 25);
        btnUpdate3.setEnabled(false);
        panel3.add(btnUpdate3);
       


 ////////////////////   PANEL 4 Set Up /////////////// /////////////// 
    
        panel4.setSize(320,440);
        String[] ColumNames={"Dish ID","Dish Name","Dish Cost","Cuisine Type","Spicy","Here Until"};
        List <Menu> listMenu = new ArrayList<>(); // array list of the type "Employee"
        listMenu=(List<Menu>)mCrud.selectAllDish(); // casted in case there are any issues with diff platforms 
        int counter = listMenu.size();// getting the size of the rows to create the array 
        int r=0;
        
        String[][] temp = new String[counter][6];
       //iterator -- will do the loop until there are no more and will move to gust  
        for (Menu items: listMenu){
            temp[r][0]=String.valueOf(items.getDishID());
            temp[r][1]= items.getDishName();
            temp[r][2]=String.valueOf(items.getDishCost());
            temp[r][3]=items.getCuisineType();
            temp[r][4]=items.getSpicy();
            temp[r][5]=items.getLimitedTimeDate();           
            r++;
        }
        //adapter
        DefaultTableModel model= new DefaultTableModel(temp,ColumNames);
        table4=new JTable(model); // implementing the table 4 Jtable 
        TableColumnModel columnModel=table4.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(20);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(150);
        columnModel.getColumn(4).setPreferredWidth(100);
        columnModel.getColumn(5).setPreferredWidth(100);
       
        
        table4.setSize(320,400);
        table4.setShowGrid(true);
        table4.setShowVerticalLines(true);
        table4.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane sp=new JScrollPane(table4,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        panel4.add(sp,BorderLayout.CENTER);
   
////////////////////   Put it together  /////////////// /////////////// 
        tabbedPane.setBounds(0,0,400,470);       
        tabbedPane.add("Insert Item",panel1);
        tabbedPane.add("SearchItem",panel2);
        tabbedPane.add("Update Item", panel3);
        tabbedPane.add("Menu",panel4);
        this.add(tabbedPane);
    }
    private void setFrame(){
        super.setTitle("Menu Manager Version 1.0");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocation(200, 100);
        super.setResizable(false);
        super.setSize(width,height);
        super.setVisible(true);
    }
 private class Save implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
           String DishName=txtDishName.getText();
           double DishCost=Double.parseDouble(txtDishCost.getText());
           String CuisineType=txtCuisineType.getText();
           String Spicy=txtSpicy.getText();
           String LimitedTimeDate=txtLimitedTimeDate.getText();
           item= new Menu(DishName, DishCost, CuisineType, Spicy, LimitedTimeDate);
           try{
               mCrud.insertDish(item);
           }catch(Exception ex){
               System.out.println(ex);
           }
           JOptionPane.showMessageDialog(null,"You just addded a new menu item");
        }
    }
 
 private class ClearMenuItem implements ActionListener{
     
     @Override
     public void actionPerformed(ActionEvent ae){
            txtTitle.setText("");
            txtDishName.setText("");
            txtDishCost.setText("");
            txtCuisineType.setText("");
            txtSpicy.setText("");
            txtLimitedTimeDate.setText("");
     }
 }
 private class Search2 implements ActionListener{
     
     @Override
     public void actionPerformed(ActionEvent ae){
         int DishID2=Integer.parseInt(txtDishID2.getText());
         item2= mCrud.selectDish(DishID2);
         
         if(item2 != null){
             
            txtDishName2.setText(item2.getDishName());
            txtDishCost2.setText(String.valueOf(item2.getDishCost()));
            txtCuisineType2.setText(item2.getCuisineType());
            txtSpicy2.setText(item2.getSpicy());
            txtLimitedTimeDate2.setText(item2.getLimitedTimeDate());  
            txtDishID2.requestFocus();
            btnDelete2.setEnabled(true);
            btnClear2.setEnabled(true);
         }
     }
 }
 public class DeleteMenuItem implements ActionListener{
     @Override
     public void actionPerformed(ActionEvent ae){
 
         boolean x=false;         
         try{
             x=mCrud.deleteDish(item2.getDishID());
             
         }catch(Exception ex){
             System.out.println(ex);
         } 
         
         if(x){
             JOptionPane.showMessageDialog(null,"You just deleted menu item # "+item2.getDishID());
         }else{
              JOptionPane.showMessageDialog(null,"Unsuccesful Delete");
         }  
     }
 }
 
  private class Search3 implements ActionListener{
     
     @Override
     public void actionPerformed(ActionEvent ae){
         int DishID3=Integer.parseInt(txtDishID3.getText());
         item3= mCrud.selectDish(DishID3);
         
         if(item3 != null){
             
            txtDishName3.setText(item3.getDishName());
            txtDishCost3.setText(String.valueOf(item3.getDishCost()));
            txtCuisineType3.setText(item3.getCuisineType());
            txtSpicy3.setText(item3.getSpicy());
            txtLimitedTimeDate3.setText(item3.getLimitedTimeDate());  
            txtDishID3.requestFocus();
            
            //Button Enabler
            btnSearch3.setEnabled(false);
            btnUpdate3.setEnabled(true);
            btnClear3.setEnabled(true);
            txtDishID3.setEnabled(false);
             // Button editable
            txtDishName3.setEditable(true);
            txtDishCost3.setEditable(true);
            txtCuisineType3.setEditable(true);
            txtSpicy3.setEditable(true);
            txtLimitedTimeDate3.setEditable(true);
 
         }else{
             txtDishID3.setText("");
             txtDishID3.requestFocus();
             JOptionPane.showMessageDialog(null, "Menu Item # " +txtDishID3 + " was not found!");
         
        }
    }
  }
  
  private class Update3 implements ActionListener{
          @Override
          public void actionPerformed(ActionEvent e){
              boolean x = false;
              
              try{
                  item3.setDishID(Integer.parseInt(txtDishID3.getText()));
                  item3.setDishName(txtDishName3.getText());
                  item3.setDishCost(Double.parseDouble(txtDishCost3.getText()));
                  item3.setCuisineType(txtCuisineType3.getText());
                  item3.setSpicy(txtSpicy3.getText());
                  item3.setLimitedTimeDate(txtLimitedTimeDate3.getText());
                  
                  System.out.println("Menu item name ==> "+item3.getDishName());
                  x=mCrud.updateUser(item3);
                  
              }
              catch(Exception ex){
                  System.out.println(ex);
              }
              if(x){
                  JOptionPane.showMessageDialog(null, "You just updated the menu item # "+item3.getDishID());
              }
              else{
                   JOptionPane.showMessageDialog(null, "Unsuccessful update");
              }
                     
          }
      }
  
  
}
