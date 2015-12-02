
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public final class OrdersAdmin extends javax.swing.JFrame {
    Connection mycon=null;
PreparedStatement pst=null;
ResultSet rs=null;
String add=null;
    public OrdersAdmin() throws SQLException {
        initComponents();
        mycon=MySql.ConnectDB();
        Orders_table();
        System.out.print(add);
    }
  public void Orders_table() throws SQLException{
       try {
String sql="select o.order_id as 'Order Id',o.table_id as 'Table Num',ol.menu_id as 'Menu Id',o.ostatus as 'Order Status',o.timestamp_created as 'Last Modified',o.cid as 'Customer Id' from orders o,order_list as ol where o.ostatus='processing' ";
           pst=mycon.prepareStatement(sql);
           rs=pst.executeQuery();
          Orders_table.setModel(DbUtils.resultSetToTableModel(rs));
           }
       catch(HeadlessException e){
JOptionPane.showMessageDialog(null, e);
}
    }
  public void open_table(){
      try{
String sql="select ol.order_id as 'Order Id', concat(fname,' ',lname) as 'Customer Name', m.mname as 'Menu Name', m.mtype as 'Menu Type', m.price as 'Price', ol.Quantity as 'Quantity', m.price*ol.Quantity as 'Total Price' from order_list ol, menu m,customer as c,orders as o where ol.order_id=o.order_id and m.menu_id = ol.menu_id and o.cid=c.cid and ol.order_id ='"+add+"' ";
pst=mycon.prepareStatement(sql);
rs=pst.executeQuery();
detail_table.setModel(DbUtils.resultSetToTableModel(rs));
}
catch(SQLException | HeadlessException e){
JOptionPane.showMessageDialog(null, e);
}
}
    public void close(){
    WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        backtologin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Orders_table = new javax.swing.JTable();
        MENU = new javax.swing.JLabel();
        order_id = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        detail_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 204, 255));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField1.setText("RESTAURANT AUTOMATION SYSTEM");

        jTextField2.setBackground(new java.awt.Color(204, 204, 0));
        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField2.setText("Welcome Adminnistrator");

        backtologin.setBackground(new java.awt.Color(0, 204, 204));
        backtologin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backtologin.setText("BACK");
        backtologin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtologinActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("ORDERS");

        Orders_table.setModel(new javax.swing.table.DefaultTableModel(
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
        Orders_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Orders_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Orders_table);

        MENU.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MENU.setText("Order_id");

        delete.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        detail_table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(detail_table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(468, 468, 468))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(delete)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(529, 529, 529))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(backtologin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(435, 435, 435)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(MENU, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(order_id, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backtologin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MENU)
                    .addComponent(order_id, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backtologinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtologinActionPerformed
        // TODO add your handling code here:
       
WelcomeAdmin wa = new WelcomeAdmin();
wa.setVisible(true);
// close();
    }//GEN-LAST:event_backtologinActionPerformed

    private void Orders_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Orders_tableMouseClicked
        // TODO add your handling code here:
         try{
int row= Orders_table.getSelectedRow();
String Table_click=(Orders_table.getModel().getValueAt(row,0).toString());
String sql="Select * from order_list where order_id='"+Table_click+"' ";
pst=mycon.prepareStatement(sql);
rs=pst.executeQuery();
if(rs.next())
{
add= rs.getString("order_list.order_id");
open_table();
}
}catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_Orders_tableMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
     String sql="delete from order_list where order_id=?";
        try{
            pst=mycon.prepareStatement(sql);
            pst.setString(1,order_id.getText());
            pst.execute();
        }
        catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        }
        String sql1="delete from orders where order_id=?";
        try{
            pst=mycon.prepareStatement(sql1);
            pst.setString(1,order_id.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Deleted");
        }
        catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(OrdersAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdersAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdersAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdersAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new OrdersAdmin().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(OrdersAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MENU;
    private javax.swing.JTable Orders_table;
    private javax.swing.JButton backtologin;
    private javax.swing.JButton delete;
    private javax.swing.JTable detail_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField order_id;
    // End of variables declaration//GEN-END:variables
}
