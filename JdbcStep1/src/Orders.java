import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.*;
import java.util.LinkedList;

import javax.swing.JOptionPane;
public class Orders {

	int order_id;
	int table_id;
	String ostatus = new String();
	int cid;
	LinkedList<IOrderListItem> li = new LinkedList<>();

	/*
	ORDERS table
	order_id	int(5)	NO	PRI
	table_id	int(5)	NO	MUL
	total_payable	float(5,2)	YES
	timestamp_created	timestamp	NO
	ostatus	varchar(20)	NO
	cid	varchar(25)	NO	MUL

	 */

	public Orders(int table_id, int cid) {
		this.table_id = table_id;
		this.ostatus = "Thinking";
		this.cid = cid;
		//this.order_id = getOrderID();
	}
        
        public int getOrderID() {
            return order_id;
        }

	public void setOrderID() {
		/*
            CallableStatement cStmt = con.prepareCall("{? = call verifierQteDemandee(?)}");
cStmt.registerOutParameter(1,java.sql.Types.BOOLEAN);
cStmt.setInt(2, 42);
cStmt.execute();
Boolean outputValue = cStmt.getBoolean(1);


		 */
		try{
			
                        
                        
                        Class.forName("com.mysql.jdbc.Driver");
			Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost/ssdi_ras_v001", "root","circus465");
			PreparedStatement pst = mycon.prepareStatement("select insertOrder("+table_id+", '"+ostatus+"', "+cid+") as oid");
                        ResultSet rs = pst.executeQuery();     
                        rs.next();
                        this.order_id = rs.getInt("oid");
                        JOptionPane.showMessageDialog(null,"Order_id generated successfully: "+order_id);
                        
			//CallableStatement cStmt = mycon.prepareCall("{? insertOrder ("+table_id+", '"+ostatus+"', "+cid+") }");
                        //Connection mycon=null;
                        //CallableStatement cStmt = mycon.prepareCall("{? insertOrder ("+table_id+", '"+ostatus+"', "+cid+") }");
			//cStmt.registerOutParameter(1,java.sql.Types.INTEGER);
			//cStmt.setInt(2, 42);
			//cStmt.execute();
			//this.order_id = 3;//cStmt.getInt(1);
                        //JOptionPane.showMessageDialog(null,"Order_id generated successfully: "+order_id);
		}
		catch(SQLException | ClassNotFoundException e){
			JOptionPane.showMessageDialog(null,getStackTrace(e));
		}
		//return order_id;
		/*
		Connection mycon=null;
		PreparedStatement pst1, pst2=null;
		int pk = -1;
		try{
			Class.forName("com.mysql.jdbc.Driver"); // setting the driver
			mycon = DriverManager.getConnection("jdbc:mysql://localhost/ssdi_ras_v001", "root","circus465");
			String sql = "insert into orders (table_id, ostatus, cid) values("+table_id+", '"+ostatus+"', "+cid+")";
			pst1=mycon.prepareStatement(sql);
			boolean r=pst1.execute(sql);

			pst2 = mycon.prepareStatement("select max(order_id) as moi from orders");
			ResultSet rs = pst2.executeQuery();
			order_id = rs.getInt("moi");
                        rs.next();
			if(r == true){
				JOptionPane.showMessageDialog(null,"order id is"+1);
			}
		}
		catch(ClassNotFoundException | SQLException e){
			JOptionPane.showMessageDialog(null,getStackTrace(e));
		}
		return pk;
		 */
	}

	public void addNewLi(int menu_id, int qty) {
		IOrderListItem ol = new IOrderListItem(order_id, menu_id, qty);
		li.add(ol);
                ol.insertOrderItem();
	}
        

        //public void insertAllItems() {
       //     for (IOrderListItem oli : li) {
         //       oli.insertOrderItem();
           // }

        //}
        
/*001
	public void insertOrderListToTable() {
		
            /*
            String sql = "insert into order_list values ";
		int i = 0;
		for (IOrderListItem oli : li) {
			if (i == 0) {
				sql = sql + "("+order_id+", "+oli.getMenuID()+", "+oli.getQty()+")";
			}
			sql = sql + ",("+order_id+", "+oli.getMenuID()+", "+oli.getQty()+")";
		}
		try {
                        JOptionPane.showMessageDialog(null,"Insert query to insert orders object to DB: "+sql);
			Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost/ssdi_ras_v001", "root","circus465");
			PreparedStatement pst;
			Class.forName("com.mysql.jdbc.Driver"); // setting the driver
			pst=mycon.prepareStatement(sql);
			boolean r=pst.execute(sql);
			if(r == true){
				JOptionPane.showMessageDialog(null,"order inserted successfully");
			}
		}
		catch (ClassNotFoundException | SQLException e){
			JOptionPane.showMessageDialog(null,getStackTrace(e));
		}
                */
            
            /* 001
            try {
            
            001 */
            /*
                DELIMITER $$
CREATE DEFINER=`root`@`localhost` FUNCTION `insertOrder`(intable_id INT(5), inostatus varchar(20), incid INT(5)) RETURNS int(5)
BEGIN 
DECLARE outoid INT;
SET outoid = 0;
	insert into orders (table_id, ostatus, cid)
    values (intable_id, inostatus, incid);
    
	select max(order_id) 
	into outoid
	from orders;
return outoid;
END$$
DELIMITER ;
                
                
                
                Connection mycon=null;
			CallableStatement cStmt = mycon.prepareCall("{? = call insertOrder ("+table_id+", '"+ostatus+"', "+cid+") }");
			cStmt.registerOutParameter(1,java.sql.Types.INTEGER);
			//cStmt.setInt(2, 42);
			cStmt.execute();
			this.order_id = cStmt.getInt(1);

            */
                
                /* 001
             
                for (IOrderListItem oli : li) {
                    
                    Connection mycon=null;
                    int menu_id = oli.getMenuID();
                    int qty = oli.getQty();
                    JOptionPane.showMessageDialog(null,"Menu_id, qty: "+menu_id+", "+qty);
			CallableStatement cStmt = mycon.prepareCall("{? = call insertOrderListItem("+order_id+", "+menu_id+", "+qty+") }");
                        cStmt.execute();     
                        JOptionPane.showMessageDialog(null,"Order list item added successfully- Order: "+order_id+", menu_id and qty: "+menu_id+", "+qty);
                }
                
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,getStackTrace(e));
            }
              001  */

		/*
		 * TaBLE ORDER_LIST
				order_id	int(5)	NO	PRI
				menu_id	int(5)	NO	PRI
				quantity	int(3)	NO
		 */
		//System.out.println(oli + "\n");
        /* 001
	} 
       001 */


	public void updateOrderStatus(String status) {
		try {
			String sql = "update orders set ostatus = '"+ status +"' where order_id ="+ order_id;
			Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost/ssdi_ras_v001", "root","circus465");
			PreparedStatement pst;
			Class.forName("com.mysql.jdbc.Driver"); // setting the driver
			pst=mycon.prepareStatement(sql);
			boolean r=pst.execute(sql);
			if(r == true){
				JOptionPane.showMessageDialog(null,"order inserted successfully");
			}
		}
		catch (ClassNotFoundException | SQLException e){
			JOptionPane.showMessageDialog(null,getStackTrace(e));

		}
	}

	public String getStackTrace(final Throwable throwable) {
		final StringWriter sw = new StringWriter();
		final PrintWriter pw = new PrintWriter(sw, true);
		throwable.printStackTrace(pw);
		return sw.getBuffer().toString();
	}
	private void exQuery(String sql) {
		Connection mycon= null;
		PreparedStatement pst1, pst2= null;
		int pk = -1;
		try{
			Class.forName("com.mysql.jdbc.Driver"); // setting the driver
			mycon = DriverManager.getConnection("jdbc:mysql://localhost/ssdi_ras_v001", "root","circus465");
			//String sql = new String("insert into orders (table_id, ostatus, cid) values("+table_id+", '"+ostatus+"', "+cid+")");
			pst1=mycon.prepareStatement(sql);
			boolean r=pst1.execute(sql);

			pst2 = mycon.prepareStatement("select max(order_id) as moi from orders");
			ResultSet rs = pst2.executeQuery();
			order_id = rs.getInt("moi");
			rs.next();
			if(r == true){
				JOptionPane.showMessageDialog(null,"order id is"+1);
			}
		}
		catch(ClassNotFoundException | SQLException e){
			JOptionPane.showMessageDialog(null,getStackTrace(e));
		}
	}

}

