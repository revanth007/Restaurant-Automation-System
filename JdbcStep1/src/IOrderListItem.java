
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nbhirud
 */
public class IOrderListItem {
    int order_id;
		int menu_id;
		int qty;

		/*
		 *TaBLE ORDER_LIST
		 *order_id	int(5)	NO	PRI
		 *menu_id	int(5)	NO	PRI
		 *quantity	int(3)	NO
		 */

		public IOrderListItem(int oid, int mid, int qty) {
			this.menu_id = mid;
			this.qty = qty;
                        this.order_id = oid;
		}
		public int getMenuID() {
			return menu_id;
		}

		public int getQty() {
			return qty;
		}
                public int getOrderID() {
                    return order_id;
                }
                
                	public String getStackTrace(final Throwable throwable) {
		final StringWriter sw = new StringWriter();
		final PrintWriter pw = new PrintWriter(sw, true);
		throwable.printStackTrace(pw);
		return sw.getBuffer().toString();
	}
                
                public void insertOrderItem() {
                    try{
                        
                        /* v1
                        Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost/ssdi_ras_v001", "root","circus465");
                        JOptionPane.showMessageDialog(null,"order_id, Menu_id, qty: "+order_id+", "+menu_id+", "+qty);
			CallableStatement cStmt = mycon.prepareCall("select insertOrderListItem("+order_id+", "+menu_id+", "+qty+")");
                        cStmt.execute();     
                        JOptionPane.showMessageDialog(null,"Order list item added successfully- Order: "+order_id+", menu_id and qty: "+menu_id+", "+qty);
                        */
                        
                        /* v2
                        Class.forName("com.mysql.jdbc.Driver");
			Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost/ssdi_ras_v001", "root","circus465");
			PreparedStatement pst = mycon.prepareStatement("select insertOrderListItem("+order_id+", "+menu_id+", "+qty+")");
                        JOptionPane.showMessageDialog(null,"order_id, Menu_id, qty: "+order_id+", "+menu_id+", "+qty);
			//CallableStatement cStmt = mycon.prepareCall("select insertOrderListItem("+order_id+", "+menu_id+", "+qty+")");
                        pst.executeQuery();     
                        JOptionPane.showMessageDialog(null,"Order list item added successfully- Order: "+order_id+", menu_id and qty: "+menu_id+", "+qty);
                        */
                        
                        // v3
                        Class.forName("com.mysql.jdbc.Driver");
			Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost/ssdi_ras_v001", "root","circus465");
			PreparedStatement pst = mycon.prepareStatement("select insertOrderListItem("+order_id+", "+menu_id+", "+qty+") as olid");
                        JOptionPane.showMessageDialog(null,"order_id, Menu_id, qty: "+order_id+", "+menu_id+", "+qty);
                        ResultSet rs = pst.executeQuery();     
                        rs.next();
                        if(rs.getInt("olid") == 1) {
                           JOptionPane.showMessageDialog(null,"Order item added successfully: "+order_id+", "+menu_id+", "+qty); 
                        }
                        
                        
                        
                        
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,getStackTrace(e));
            }
                }
	}