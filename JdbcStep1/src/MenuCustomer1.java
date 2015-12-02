/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class MenuCustomer1 extends javax.swing.JFrame {


  Connection mycon=null;
PreparedStatement pst=null;
ResultSet rs=null;
  Orders o=null;
  private int clicked=0;
 
    /**
     * Creates new form MenuCustomer
     */
    public MenuCustomer1() {
      
        initComponents();
      
         mycon=MySql.ConnectDB();
 //       Open_table();
    }
/* public void Open_table(){
       try {
           Open_table.setRowHeight(30);
           String sql="Select * from menu_admin ";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
           Open_table.setModel(DbUtils.resultSetToTableModel(rs));
           }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }
    */
  public void show7_table(){
       try {
         //  Open_table.setVisible(true);
         
           Open_table.setRowHeight(30);
           Open_table.getColumnModel().getColumn(3).setMaxWidth(200); 
           String sql="Select menu.menu_id,mname,order_list.quantity,menu.price,order_list.quantity*menu.price as 'Total Price' from order_list join menu on menu.menu_id = order_list.menu_id where order_id=" +o.getOrderID();
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
           Open_table.setModel(DbUtils.resultSetToTableModel(rs));
           }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void show_table(){
       try {
         //  Open_table.setVisible(true);
         
           Open_table.setRowHeight(30);
           String sql="Select menu_id as 'Menu ID',mname as Name,description,price from menu where mtype='appetizer'";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
           Open_table.setModel(DbUtils.resultSetToTableModel(rs));
           }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }
      public void show1_table(){
       try {
           Open_table.setVisible(true);
           Open_table.setRowHeight(30);
           String sql="Select mname as Name,description,price from menu where mtype='entrees'  ";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
           Open_table.setModel(DbUtils.resultSetToTableModel(rs));
           }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }
        public void show2_table(){
       try {
           Open_table.setVisible(true);
           Open_table.setRowHeight(30);
            // Open_table.getColumnModel().getColumn(1).setMaxWidth(20); 
           String sql="Select mname as Name,description,price from menu where mtype='tandoori'  ";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
            Open_table.getColumnModel().getColumn(1).setMaxWidth(20); 
           Open_table.setModel(DbUtils.resultSetToTableModel(rs));
           }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }
          public void show3_table(){
       try {
           Open_table.setVisible(true);
           Open_table.setRowHeight(30);
           String sql="Select mname as Name,description,price from menu where mtype='desserts'  ";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
           Open_table.setModel(DbUtils.resultSetToTableModel(rs));
           }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }
            public void show4_table(){
       try {
           Open_table.setVisible(true);
           Open_table.setRowHeight(30);
           String sql="Select mname as Name,description,price from menu where mtype='beer'  ";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
           Open_table.setModel(DbUtils.resultSetToTableModel(rs));
           }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }
            
             public void show5_table(){
       try {
           Open_table.setVisible(true);
           Open_table.setRowHeight(30);
           String sql="Select mname as Name,description,price from menu where mtype='biryani'  ";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
           Open_table.setModel(DbUtils.resultSetToTableModel(rs));
           }
       catch(SQLException | HeadlessException e){
       
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void close(){
    WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
}
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        appetizer_button = new javax.swing.JButton();
        biryani_button = new javax.swing.JButton();
        tandoori_button = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        entrees_button = new javax.swing.JButton();
        beer_button = new javax.swing.JButton();
        deserts_button = new javax.swing.JButton();
        save1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Open_table = new javax.swing.JTable();
        combo_quantity = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_menu_id = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        place_order = new javax.swing.JButton();
        combo_table = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 204, 255));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField1.setText("RESTAURANT AUTOMATION SYSTEM");

        jTextField2.setBackground(new java.awt.Color(204, 204, 0));
        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField2.setText("Menu");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        appetizer_button.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        appetizer_button.setText("APPETIZERS");
        appetizer_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appetizer_buttonActionPerformed(evt);
            }
        });

        biryani_button.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        biryani_button.setText("DHUM BIRYANI");
        biryani_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biryani_buttonActionPerformed(evt);
            }
        });

        tandoori_button.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tandoori_button.setText("TANDOORI");
        tandoori_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tandoori_buttonActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton10.setText("NON-VEG ENTREES");

        entrees_button.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        entrees_button.setText("VEG ENTREES");
        entrees_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrees_buttonActionPerformed(evt);
            }
        });

        beer_button.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        beer_button.setText("BEER & WINE");
        beer_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beer_buttonActionPerformed(evt);
            }
        });

        deserts_button.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        deserts_button.setText("DESERTS");
        deserts_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deserts_buttonActionPerformed(evt);
            }
        });

        save1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        save1.setText("SAVE ORDER");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });

        Open_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Open_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane2.setViewportView(Open_table);

        combo_quantity.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        combo_quantity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("QUANTITY");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("MENU ID");

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("VIEW ORDER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        place_order.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        place_order.setText("PLACE ORDER");
        place_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                place_orderActionPerformed(evt);
            }
        });

        combo_table.setEditable(true);
        combo_table.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        combo_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tableActionPerformed(evt);
            }
        });

        jLabel3.setText("TABLE ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tandoori_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(biryani_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(entrees_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(appetizer_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deserts_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(beer_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_menu_id)
                                    .addComponent(combo_quantity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combo_table, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(save1)
                                .addGap(26, 26, 26)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(place_order))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(appetizer_button)
                        .addGap(33, 33, 33)
                        .addComponent(entrees_button)
                        .addGap(37, 37, 37)
                        .addComponent(jButton10)
                        .addGap(41, 41, 41)
                        .addComponent(tandoori_button)
                        .addGap(33, 33, 33)
                        .addComponent(biryani_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(deserts_button)
                        .addGap(32, 32, 32)
                        .addComponent(beer_button)
                        .addGap(98, 98, 98))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_table, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(combo_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_menu_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(save1)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(place_order, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        WelcomeCustomer wc=new WelcomeCustomer();
        wc.setVisible(true);
     
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void deserts_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deserts_buttonActionPerformed
show4_table();
        // TODO add your handling code here:
    }//GEN-LAST:event_deserts_buttonActionPerformed

    private void appetizer_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appetizer_buttonActionPerformed
        // TODO add your handling code here:
        show_table();
    }//GEN-LAST:event_appetizer_buttonActionPerformed

    private void entrees_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrees_buttonActionPerformed
show1_table();
        // TODO add your handling code here:
    }//GEN-LAST:event_entrees_buttonActionPerformed

    private void biryani_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biryani_buttonActionPerformed
show3_table();

        // TODO add your handling code here:
    }//GEN-LAST:event_biryani_buttonActionPerformed

    private void beer_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beer_buttonActionPerformed
show5_table();
        // TODO add your handling code here:
    }//GEN-LAST:event_beer_buttonActionPerformed
public static String getStackTrace(final Throwable throwable) {
    final StringWriter sw = new StringWriter();
    final PrintWriter pw = new PrintWriter(sw, true);
    throwable.printStackTrace(pw);
    return sw.getBuffer().toString();
}
    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
 try{
        String value= combo_table.getSelectedItem().toString();
         int value1= Integer.parseInt(value);
      
 if(clicked==0){
     String customer_id= "Select cid from customer where email='revanthmalay@gmail.com' ";
     pst=mycon.prepareStatement(customer_id);
           rs=pst.executeQuery();
           //int cid1=rs.getInt("cid");
           
        o = new Orders(value1, 1);
        o.setOrderID();
       clicked++;
 }
    
     int mid = Integer.parseInt(txt_menu_id.getText());
     String quantity=combo_quantity.getSelectedItem().toString();
     int quantity1= Integer.parseInt(quantity);
     //JOptionPane.showMessageDialog(null, "Inputs from user - menu_id and quantity: "+mid+", "+quantity1);
		o.addNewLi(mid,quantity1 );
 }
 catch(Exception e){
     JOptionPane.showMessageDialog(null, getStackTrace(e));
 }
        /*
        try{
    String sql="insert "
}
        */
        
        /*
        JCheckBox jc= new JCheckBox("Get Selected");
        jc.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
      
//for(int i=0;i<Open_table.getRowCount();i++){
   // if(jc[i].isSelected()){
        try{
            String sql= " insert into menu_order(menu_num,menu_name,menu_type,description,price,quantity) select menu_id,mname,mtype,description,price from menu ";
pst=mycon.prepareStatement(sql);
pst.execute();
        }
catch(Exception e){
JOptionPane.showMessageDialog(null,e);
                    }
    }
    
}

        
        
        /* try{
     if(row1_check.isSelected()){
         try
      {
          String sql= " insert into menu_order(menu_num,menu_name,menu_type,description,price,quantity) select menu_id,mname,mtype,description,price from menu ";
           pst=mycon.prepareStatement(sql);
           pst.execute();
                      
      }
      catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
      }
     }
     else{
        JOptionPane.showMessageDialog(null,"Please select to save the order. Thank you");
     }
}
  catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
      }
        
 try{
        String sql1=" insert into menu_order(quantity) values(?) ";
              pst=mycon.prepareStatement(sql1);
               String value=row_first.getSelectedItem().toString();
pst.setString(1,value);
pst.executeUpdate();  
 }
         catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
      }
         */
    }//GEN-LAST:event_save1ActionPerformed

    private void tandoori_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tandoori_buttonActionPerformed
        // TODO add your handling code here:
        show2_table();
    }//GEN-LAST:event_tandoori_buttonActionPerformed

    private void place_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_place_orderActionPerformed
        // TODO add your handling code here:
        //o.insertAllItems();
        o.updateOrderStatus("Processing");
        JOptionPane.showMessageDialog(null,"order placed successfully");
    }//GEN-LAST:event_place_orderActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       show7_table();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void combo_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_tableActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuCustomer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCustomer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCustomer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCustomer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCustomer1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Open_table;
    private javax.swing.JButton appetizer_button;
    private javax.swing.JButton beer_button;
    private javax.swing.JButton biryani_button;
    private javax.swing.JComboBox combo_quantity;
    private javax.swing.JComboBox combo_table;
    private javax.swing.JButton deserts_button;
    private javax.swing.JButton entrees_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton place_order;
    private javax.swing.JButton save1;
    private javax.swing.JButton tandoori_button;
    private javax.swing.JTextField txt_menu_id;
    // End of variables declaration//GEN-END:variables

}
