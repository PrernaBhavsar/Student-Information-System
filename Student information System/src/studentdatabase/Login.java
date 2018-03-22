
package studentdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.objects.NativeRegExp;


public class Login extends javax.swing.JFrame{
    
    
   PreparedStatement ps;
   Connection con;
   Statement st;
   ResultSet rs;
    public Login() {
        initComponents();
        
    }
  

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        jName = new javax.swing.JTextField();
        jId = new javax.swing.JTextField();
        jPass = new javax.swing.JPasswordField();
        jLogin = new javax.swing.JButton();
        jReset = new javax.swing.JButton();
        jExit = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        jUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 255));
        setPreferredSize(new java.awt.Dimension(880, 470));

        Label1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Label1.setForeground(new java.awt.Color(0, 102, 102));
        Label1.setText("Name");

        Label2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Label2.setForeground(new java.awt.Color(0, 102, 102));
        Label2.setText("SAP ID");

        Label3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Label3.setForeground(new java.awt.Color(0, 102, 102));
        Label3.setText("Password");

        jId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIdActionPerformed(evt);
            }
        });

        jPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassActionPerformed(evt);
            }
        });

        jLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLogin.setForeground(new java.awt.Color(0, 0, 102));
        jLogin.setText("Login");
        jLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginActionPerformed(evt);
            }
        });

        jReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jReset.setForeground(new java.awt.Color(0, 0, 102));
        jReset.setText("Reset");
        jReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetActionPerformed(evt);
            }
        });

        jExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jExit.setForeground(new java.awt.Color(0, 0, 102));
        jExit.setText("Exit");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(102, 0, 0));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("STUDENT LOGIN FORM");

        jUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jUpdate.setForeground(new java.awt.Color(0, 0, 102));
        jUpdate.setText("Sign Up");
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentdatabase/DJSCE-Mumbai-Logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPass)
                                    .addComponent(jId)
                                    .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(Title)
                                .addGap(51, 51, 51)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jReset, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addComponent(jExit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jReset))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(Title)
                            .addGap(83, 83, 83)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Label1)
                                .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Label2)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)))
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Label3)
                                .addComponent(jPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLogin)
                                .addComponent(jUpdate)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassActionPerformed
   
    }//GEN-LAST:event_jPassActionPerformed

    private void jIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIdActionPerformed
       
    }//GEN-LAST:event_jIdActionPerformed

    private void jLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginActionPerformed
       
        try
        {
                                  
           String name=jName.getText();
           String id= jId.getText();
           String pass = String.valueOf(jPass.getPassword());
           String url= "jdbc:ucanaccess://C:\\Users\\Prerna Bhavsar\\Documents\\NetBeansProjects/Trial.accdb";
           con = DriverManager.getConnection(url);
           int flag=0;
           
           String sql= "Select * from Table1 where Name= '"+name+"' and Id ='"+id+"' and Pass='"+pass+"'";
           st=con.createStatement();
           rs=st.executeQuery(sql);
           
           while(rs.next())
           {
               flag=1;
               StudentView s = new StudentView(id);
               JOptionPane.showMessageDialog(null, "Login Successfull");
               dispose();
               s.setVisible(true);
               break;
           }
           if(flag==0)
           {
               JOptionPane.showMessageDialog(null,"User does not Exist");
           }
                      
                     
        }
        
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception caught");
            System.out.println("Reached Login Exception"+ex.getMessage());
        }
        

        
    }//GEN-LAST:event_jLoginActionPerformed

    private void jResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetActionPerformed
        jPass.setText(null);
        jName.setText(null);
        jId.setText(null);
    }//GEN-LAST:event_jResetActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        System.exit(0);      
    }//GEN-LAST:event_jExitActionPerformed

    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed

        
        try
        {
           
           String name=jName.getText();
           String id= jId.getText();
           String pass = String.valueOf(jPass.getPassword());
           String url= "jdbc:ucanaccess://C:\\Users\\Prerna Bhavsar\\Documents\\NetBeansProjects/Trial.accdb";
           con = DriverManager.getConnection(url);
           
           
           String sql1="SELECT * FROM Table1";
           st=con.createStatement();
           rs=st.executeQuery(sql1);
           
           
           int cnt=0;
           while(rs.next())
           {
               String Tname=rs.getString("Name");
               String Tid=rs.getString("Id");
               String Tpass= rs.getString("Pass");
               if(name.equals(Tname) && id.equals(Tid) && pass.equals(Tpass))
               {
                   cnt++;
                   JOptionPane.showMessageDialog(null,"User already exists");
                   break;
               }
           }
           if(cnt==0)
           {
                int choice=JOptionPane.showConfirmDialog(null,"Confirm Registeration");
                if(JOptionPane.YES_OPTION==choice)
                {
                    String sql = "INSERT INTO Table1 (Name,Id,Pass) VALUES(?,?,?)";
                    ps = con.prepareStatement(sql);
                    ps.setString(1, name);
                    ps.setString(2, id);
                    ps.setString(3, pass);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registered Successfully");
                }
                
                else if(choice==JOptionPane.CLOSED_OPTION || choice==JOptionPane.NO_OPTION)
                {
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
                
                
                
               
                   
            }
           
           
        }
        catch(HeadlessException | SQLException ex)
        {
           JOptionPane.showMessageDialog(null,"Error, Check Fields");     
           System.out.println("Sign Up button for new record error: "+ex.getMessage()); 
        }
    }//GEN-LAST:event_jUpdateActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Title;
    private javax.swing.JButton jExit;
    private javax.swing.JTextField jId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jLogin;
    private javax.swing.JTextField jName;
    private javax.swing.JPasswordField jPass;
    private javax.swing.JButton jReset;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jUpdate;
    // End of variables declaration//GEN-END:variables
}
