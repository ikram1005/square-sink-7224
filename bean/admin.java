package com.masai.bean;


public class admin {
   private String uname;
   private String password;
   
   
   
public admin() {
	// TODO Auto-generated constructor stub
}
public admin(String uname, String password) {
	super();
	this.uname = uname;
	this.password = password;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "admin [uname=" + uname + ", password=" + password + "]";
}

   
   
   
}
