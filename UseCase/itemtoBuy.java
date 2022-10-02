package com.masai.UseCase;

import java.util.Scanner;

import com.masai.dao.ProjectDao;
import com.masai.dao.ProjectDaoImp;


public class itemtoBuy {
   public static void itemTobuy() {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter item id");
	int id=scanner.nextInt();
	
	System.out.println("Enter buyer id");
	int bid=scanner.nextInt();
	
	ProjectDao pj=new ProjectDaoImp();
	
	try {
		String result = pj.selectItemstoBuy(id, bid);
		
		System.out.println(result);
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		}
	
	
	
}
}
