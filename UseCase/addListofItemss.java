package com.masai.UseCase;

import java.util.Scanner;

import com.masai.bean.item;
import com.masai.dao.ProjectDao;
import com.masai.dao.ProjectDaoImp;

public class addListofItemss {
     public static void listofItems() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enetr how many no of items you want add");
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter item name ");
			String name=scanner.next();
			
			System.out.println("Enetr item price");
			int price=scanner.nextInt();
			
			System.out.println("Enter quantity");
			int q=scanner.nextInt();
			
			System.out.println("Enter sellerId");
			int si=scanner.nextInt();
			
			ProjectDao pj=new ProjectDaoImp();
			
			item it=new item();
			it.setIname(name);
			it.setIprice(price);
			it.setQuantity(q);
			it.setSellerId(si);
			
			String result=pj.addListofItem(it);
			System.out.println(result);
		}
		
	}
}
