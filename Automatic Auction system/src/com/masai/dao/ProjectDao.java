package com.masai.dao;

import java.util.List;

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

public interface ProjectDao {

	
	public admin loginAdmin(String userName,String password)throws adminException;
	
	public String registerSeller(seller s);
	
	public String registerBuyer(buyer b);
	
	public seller loginSeller(String email,String password)throws  sellerException;
	
	public buyer loginBuyer(String email,String password)throws  buyerException;
	
	public List<buyer> getAllBuyer()throws buyerException;
	
	public List<seller> getAllSeller()throws sellerException;
	
	public String Additem(item it);
	
	public List<item> getItemsList()throws itemException;

	public String addListofItem(item i);
	
	public String updatePriceofItems(item it);
	
	public String updateQuantityofItems(item it);
	
	public String removeitem(item it);
	
	public List<item> getitembycategory(String cate)throws itemException;
	
	public List<sellerItem> getListofItembySellerName() throws itemException;
	
	public String selectItemstoBuy(int Iid,int biid)throws itemException,buyerException;
	
	public List<soldItem> getSoldItemsList()throws itemException;
}
