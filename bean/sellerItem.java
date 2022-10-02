package com.masai.bean;

public class sellerItem {
	   private int Iid;
	   private String Iname;
	   private int Iprice;
	   private int quantity;
	   private int sellerId;
	   private String category;
	   private String name;
	   private String email;
	   
	   
	   public sellerItem() {
		   
	   }
	public sellerItem(int iid, String iname, int iprice, int quantity, int sellerId, String category, String name,
			String email) {
		super();
		Iid = iid;
		Iname = iname;
		Iprice = iprice;
		this.quantity = quantity;
		this.sellerId = sellerId;
		this.category = category;
		this.name = name;
		this.email = email;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "sellerItem [Iid=" + Iid + ", Iname=" + Iname + ", Iprice=" + Iprice + ", quantity=" + quantity
				+ ", sellerId=" + sellerId + ", category=" + category + ", name=" + name + ", email=" + email + "]";
	}
	   
	   
	   
}
