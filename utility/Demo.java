package com.masai.utility;

import java.sql.Connection;

public class Demo {
   public static void main(String[] args) {
	Connection connection=JDBCUtil.provideConnection();
	
	System.out.println(connection);
   }
}
