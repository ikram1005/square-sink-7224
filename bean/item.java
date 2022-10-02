package com.masai.bean;

public class item {
   private int Iid;
   private String Iname;
   private int Iprice;
   private int quantity;
   private int sellerId;
   private String category;
   
   public item() {
	   
   }
   public item(int iid, String iname, int iprice, int quantity, int sellerId, String category) {
	super();
	Iid = iid;
	Iname = iname;
	Iprice = iprice;
	this.quantity = quantity;
	this.sellerId = sellerId;
	this.category=category;
   }
public int getIid() {
	return Iid;
}
public void setIid(int iid) {
	Iid = iid;
}
public String getIname() {
	return Iname;
}
public void setIname(String iname) {
	Iname = iname;
}
public int getIprice() {
	return Iprice;
}
public void setIprice(int iprice) {
	Iprice = iprice;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getSellerId() {
	return sellerId;
}
public void setSellerId(int sellerId) {
	this.sellerId = sellerId;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
@Override
public String toString() {
	return "item [Iid=" + Iid + ", Iname=" + Iname + ", Iprice=" + Iprice + ", quantity=" + quantity + ", sellerId="
			+ sellerId + ", category=" + category + "]";
}


   
   
   
   
   
   
   
}
