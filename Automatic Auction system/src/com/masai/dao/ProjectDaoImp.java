package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.masai.bean.admin;
import com.masai.bean.buyer;
import com.masai.bean.item;
import com.masai.bean.seller;
import com.masai.bean.sellerItem;
import com.masai.bean.soldItem;
import com.masai.exceptions.adminException;
import com.masai.exceptions.buyerException;
import com.masai.exceptions.itemException;
import com.masai.exceptions.sellerException;
import com.masai.utility.JDBCUtil;
 
public class ProjectDaoImp implements ProjectDao {

	@Override
	public admin loginAdmin(String userName, String password) throws adminException {
		admin ad=null;
		
	  try (Connection connection=JDBCUtil.provideConnection()){
		
		  PreparedStatement ps=connection.prepareStatement("select * from admin where uname =? and password = ?");
		  
		  ps.setString(1, userName);
		  ps.setString(2, password);
		  
		  ResultSet rs=ps.executeQuery();
		  
		  if(rs.next()) {
			  String u=rs.getString("Uname");
			  String p=rs.getString("password");
			  
			  ad=new admin(u,p);
		  }
		  else 
			  throw new adminException("Invalid UName and password");
		  
		  
	} catch (SQLException e) {
		throw new adminException(e.getMessage());
	}
	   
		
		return ad;
	}

	@Override
	public String registerSeller(seller s) {
		String st="not inserted";
		
		try(Connection connection=JDBCUtil.provideConnection()) {
			PreparedStatement ps=connection.prepareStatement("insert into seller(name,email,password) values(?,?,?)");
			
			ps.setString(1,s.getName());
			ps.setString(2,s.getEmail());
			ps.setString(3, s.getPassword());
			
			int x=ps.executeUpdate();
			if(x>0) {
				st="registered successful !";
			}
		} catch (SQLException e) {
			st =e.getMessage();
		}
		
		
		return st;
	}

	@Override
	public String registerBuyer(buyer b) {
		String message ="not inserted";
		
		try(Connection connection=JDBCUtil.provideConnection()) {
			PreparedStatement ps=connection.prepareStatement("insert into buyer (name,email,password) values(?,?,?)");
			
			ps.setString(1,b.getName());
			ps.setString(2, b.getEmail());
			ps.setString(3, b.getPassword());
			
			int x=ps.executeUpdate();
			if(x>0) {
				message="registered successful !";
			}
			
			
		} catch (SQLException e) {
			message=e.getMessage();
		}
		
		
		return message;
	}

	@Override
	public seller loginSeller(String email, String password) throws sellerException {
		seller sr =null;
		
		try(Connection connection=JDBCUtil.provideConnection()) {
			PreparedStatement ps=connection.prepareStatement("select * from seller where email =? and password =?");
			 ps.setString(1, email);
			  ps.setString(2, password);
			  
			  ResultSet rs=ps.executeQuery();
			  
			  if(rs.next()) {
				  int s=rs.getInt("sid");
				  String n=rs.getString("name");
				  String u=rs.getString("email");
				  String p=rs.getString("password");
				  
				  sr=new seller(s,n,u,p);
			  }
			  else 
				  throw new sellerException("Invalid email and password");
			
			
		} catch (SQLException e) {
			throw new sellerException(e.getMessage());
		}
		
		
		return sr;
	}

	@Override
	public buyer loginBuyer(String email, String password) throws buyerException {
		buyer br=null;
		
		try(Connection connection=JDBCUtil.provideConnection()) {
			PreparedStatement ps=connection.prepareStatement("select * from buyer where email =? and password =?");
			
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				int s=rs.getInt("bid");
				String n=rs.getString("name");
				String u=rs.getString("email");
				String p=rs.getString("password");
				
				br=new buyer(s,n,u,p);
			}
			else {
				throw new buyerException("Invalid email and password");
			}
		} catch (SQLException e) {
			throw new buyerException(e.getMessage());
		}
		
		
		
		
		return br;
	}

	@Override
	public List<buyer> getAllBuyer() throws buyerException {
		List<buyer> buyers =new ArrayList<>();
		try (Connection connection=JDBCUtil.provideConnection()){
			PreparedStatement ps=connection.prepareStatement("select * from buyer");
			
			ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			int s=rs.getInt("bid");
			String n=rs.getString("name");
			String e=rs.getString("email");
			String p=rs.getString("password");
			
			buyer br=new buyer(s,n,e,p);
			
			buyers.add(br);
		 }
		} catch (SQLException e) {
			throw new buyerException(e.getMessage());
		}
		
		if(buyers.size()==0) 
			throw new buyerException("No buyer  found");
		
		
		return buyers;
	}

	@Override
	public List<seller> getAllSeller() throws sellerException {
		
		List<seller> sellers =new ArrayList<>();
		try (Connection connection=JDBCUtil.provideConnection()){
			PreparedStatement ps=connection.prepareStatement("select * from seller");
			
			ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			int s=rs.getInt("sid");
			String n=rs.getString("name");
			String e=rs.getString("email");
			String p=rs.getString("password");
			
			seller br=new seller(s,n,e,p);
			
			sellers.add(br);
		 }
		} catch (SQLException e) {
			throw new sellerException(e.getMessage());
		}
		
		if(sellers.size()==0) 
			throw new sellerException("No buyer  found");
		
		
		return sellers;
	}

	@Override
	public String Additem(item it) {
		String me="not inserted";
		
		try (Connection connection=JDBCUtil.provideConnection()){
			PreparedStatement ps=connection.prepareStatement("insert into items values(?,?,?,?,?,?)");
			
			ps.setInt(1,it.getIid());
			ps.setString(2,it.getIname());
			ps.setInt(3,it.getIprice());
			ps.setInt(4,it.getQuantity());
			ps.setInt(5,it.getSellerId());
			ps.setString(6,it.getCategory());
			
			int x=ps.executeUpdate();
			if(x>0) {
				me="item added successfully !";
			}
		} catch (SQLException e) {
			me=e.getMessage();
		}
		
		return me;
	}

	@Override
	public List<item> getItemsList() throws itemException {
		List<item>  items =new ArrayList<>();
		try (Connection connection=JDBCUtil.provideConnection()){
			PreparedStatement ps=connection.prepareStatement("select * from items");
			
			ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			int s=rs.getInt("Iid");
			String n=rs.getString("Iname");
			int p=rs.getInt("Iprice");
			int q=rs.getInt("quantity");
			int si=rs.getInt("sellerId");
			String c=rs.getString("category");
			
			
			item it=new item(s,n,p,q,si,c);
			
			items.add(it);
		 }
		} catch (SQLException e) {
			throw new itemException();
		}
		
		if(items.size()==0) 
			throw new itemException();
		
		
		return items;
	}

	@Override
	public String addListofItem(item it) {
		
		String mess="not inserted";
			try (Connection connection=JDBCUtil.provideConnection()){
				PreparedStatement ps=connection.prepareStatement("insert into items values(?,?,?,?,?,?)");
					ps.setInt(1,it.getIid());
					ps.setString(2,it.getIname());
					ps.setInt(3,it.getIprice());
					ps.setInt(4,it.getQuantity());
					ps.setInt(5,it.getSellerId());
					ps.setString(6,it.getCategory());
					
					
					int x=ps.executeUpdate();
				
				if(x>0) {
					mess="item added successfully !";
				}
				
				
			} catch (SQLException e) {
				mess=e.getMessage();
			}
		
		return mess;
		
		
	}

	@Override
	public String updatePriceofItems(item it) {
		String mess="not update";
		try(Connection connection=JDBCUtil.provideConnection()) {
			PreparedStatement ps=connection.prepareStatement("update items set Iprice=? where Iname=?");
			
			ps.setInt(1,it.getIprice());
			ps.setString(2,it.getIname());
			
			int x=ps.executeUpdate();
			if(x>0) {
				mess="updated succesfully";
			}
		} catch (SQLException e) {
			mess=e.getMessage();
		}
		
		
		
		return mess;
	}

	@Override
	public String updateQuantityofItems(item it) {
		String mess="not update";
		try(Connection connection=JDBCUtil.provideConnection()) {
			PreparedStatement ps=connection.prepareStatement("update items set quantity=? where Iname=?");
			
			ps.setInt(1,it.getIprice());
			ps.setString(2,it.getIname());
			
			int x=ps.executeUpdate();
			if(x>0) {
				mess="updated succesfully";
			}
		} catch (SQLException e) {
			mess=e.getMessage();
		}
		
		
		
		return mess;
	}

	@Override
	public String removeitem(item it) {
		String mess="not remove";
		
		try (Connection connection=JDBCUtil.provideConnection()){
			PreparedStatement ps=connection.prepareStatement("delete from items where Iname=?");
			ps.setString(1,it.getIname());
			
			int x=ps.executeUpdate();
			if(x>0) {
				mess="Item removed succesfully !";
			}
		} catch (SQLException e) {
			mess=e.getMessage();	
			
		}
		
		
		return mess;
	}

	@Override
	public List<item> getitembycategory(String cate) throws itemException {
		
		List<item> items=new ArrayList<>();
		
		try (Connection connection=JDBCUtil.provideConnection()){
			PreparedStatement ps=connection.prepareStatement("select * from items where category=?");
			
			ps.setString(1,cate);
			ResultSet rs=ps.executeQuery();
			
		while(rs.next()) {
			int s=rs.getInt("Iid");
			String n=rs.getString("Iname");
			int p=rs.getInt("Iprice");
			int q=rs.getInt("quantity");
			int si=rs.getInt("sellerId");
			String c=rs.getString("category");
			
			
			item i=new item(s,n,p,q,si,c);
			
			items.add(i);
		 }
		} catch (SQLException e) {
			throw new itemException(e.getMessage());
		}
		
		if(items.size()==0) 
			throw new itemException("no record found in that category");
		return items;
	}

	@Override
	public List<sellerItem> getListofItembySellerName() throws itemException {
		
		List<sellerItem>  items =new ArrayList<>();
		try (Connection connection=JDBCUtil.provideConnection()){
			PreparedStatement ps=connection.prepareStatement("select items.*,seller.name,seller.email from seller inner join items on seller.sid=items.sellerid;");
			
			ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			int s=rs.getInt("Iid");
			String n=rs.getString("Iname");
			int p=rs.getInt("Iprice");
			int q=rs.getInt("quantity");
			int si=rs.getInt("sellerId");
			String c=rs.getString("category");
			String sn=rs.getString("name");
			String email=rs.getString("email");
			
			
			sellerItem it=new sellerItem(s,n,p,q,si,c,sn,email);
			
			items.add(it);
		 }
		} catch (SQLException e) {
			throw new itemException();
		}
		
		return items;
	}

	@Override
	public String selectItemstoBuy(int Iid, int biid) throws itemException, buyerException {
		String message="unable to buy";
		
		try (Connection connection=JDBCUtil.provideConnection()){
			PreparedStatement ps=connection.prepareStatement("select * from items where Iid=?");
			ps.setInt(1, Iid);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				PreparedStatement ps2=connection.prepareStatement("select * from buyer where bid=?");
				ps2.setInt(1, biid);
				ResultSet rs2=ps2.executeQuery();
				if(rs2.next()) {
					PreparedStatement ps3=connection.prepareStatement("insert into buyer_items values(?,?)");
					ps3.setInt(1, biid);
					ps3.setInt(2, Iid);
					
					int x=ps3.executeUpdate();
					if(x>0)
						message="item buy successfully !";
					else 
						throw new itemException("technical error");
					
				}else 
					throw new buyerException("invalid buyer id..");
				
			}else 
				throw new itemException("invalid item id..");
			
			
		} catch (SQLException e) {
			throw new buyerException(e.getMessage());
		}
		
		
		return message;
	}

	@Override
	public List<soldItem> getSoldItemsList() throws itemException {
		List<soldItem>  items =new ArrayList<>();
		try (Connection connection=JDBCUtil.provideConnection()){
			PreparedStatement ps=connection.prepareStatement("select items.*,buyer.name,buyer.email from items inner join buyer inner join buyer_items on items.Iid=buyer_items.Iid and buyer.bid=buyer_items.biid");
			
			ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			int s=rs.getInt("Iid");
			String n=rs.getString("Iname");
			int p=rs.getInt("Iprice");
			int q=rs.getInt("quantity");
			int si=rs.getInt("sellerId");
			String c=rs.getString("category");
			String bn=rs.getString("name");
			String be=rs.getString("email");
			
			
			soldItem it=new soldItem(s,n,p,q,si,c,bn,be);
			
			items.add(it);
		 }
		} catch (SQLException e) {
			throw new itemException();
		}
		
		if(items.size()==0) 
			throw new itemException();
		
		
		return items;
	}
	

}
