package studentdatabase;

import java.sql.*;

public class StudentDatabase {
    
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
    
        try
        {
            Connection con;
            Statement st;  
            ResultSet rs;
            String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
            Class.forName(driver);
            String url= "jdbc:ucanaccess://C:\\Users\\Prerna Bhavsar\\Documents\\NetBeansProjects/Trial.accdb";
            con = DriverManager.getConnection(url);
            
            String sql="SELECT * from Table1";
            st = con.createStatement();
            rs =st.executeQuery(sql);
            
            while(rs.next())
            {
                String name= rs.getString("Name");
                String id= rs.getString("Id");
                String pass= rs.getString("Pass");
                System.out.println(name+" "+id+" "+pass);
            }
            
            Login log = new Login();
            log.setVisible(true);

            
        }
        
        catch(SQLException  e)
        {
          System.out.println("Duh!..exception caught:"+e.getMessage()); 
        }
    
}
}
