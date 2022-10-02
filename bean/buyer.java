package com.masai.bean;

public class buyer {
	    private int bid;
	    private String name;
	    private String email;
	    private String password;
		public buyer() {
			
		}

		public buyer(int bid, String name, String email, String password) {
			super();
			this.bid = bid;
			this.name = name;
			this.email = email;
			this.password = password;
		}
		public int getBid() {
			return bid;
		}
		public void setBid(int bid) {
			this.bid = bid;
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
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "buyer [bid=" + bid + ", name=" + name + ", email=" + email + ", password=" + password + "]";
		}
	    
	    
}
