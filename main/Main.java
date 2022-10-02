package com.masai.main;

import java.util.Scanner;

import com.masai.UseCase.BuyerRegister;
import com.masai.UseCase.SellerRegister;
import com.masai.UseCase.addListofItemss;
import com.masai.UseCase.getListofBuyer;
import com.masai.UseCase.getListofItems;
import com.masai.UseCase.getListofSeller;
import com.masai.UseCase.insertItem;
import com.masai.UseCase.itemtoBuy;
import com.masai.UseCase.listbyCategory;
import com.masai.UseCase.removeItem;
import com.masai.UseCase.sellerItem;
import com.masai.UseCase.soldItems;
import com.masai.UseCase.updateItems;
import com.masai.bean.admin;
import com.masai.bean.buyer;
import com.masai.bean.seller;
import com.masai.dao.ProjectDao;
import com.masai.dao.ProjectDaoImp;
import com.masai.exceptions.adminException;
import com.masai.exceptions.buyerException;
import com.masai.exceptions.sellerException;

public class Main {
     public static void main(String[] args) {
		System.out.println("******Welcome to Automatic Auction Sysytem******");
		System.out.println("=======+=======+=======+=====+=====+=======+====");
		Scanner scanner=new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.Login as Admin");
			System.out.println("2.Login as seller");
			System.out.println("3.Login as buyer");
			System.out.println("4.Register as seller");
			System.out.println("5.Register as buyer");
			System.out.println("6.Enter 6 to exit :");
			System.out.println("Enter your choice");
			ch=scanner.nextInt();
			switch (ch) {
			case 1: {
				System.out.println("Enter userName");
				String uName=scanner.next();
				
				System.out.println("Enter password");
				String pass=scanner.next();
				
				ProjectDao pj=new ProjectDaoImp();

			    try {
					admin ad=pj.loginAdmin(uName, pass);
					System.out.println("welcome  "+ad.getUname());
					
					  int x;
					     do {
							System.out.println("1.View the registered buyer list.");
							System.out.println("2.View the registered seller list.");
							System.out.println("3.View the list of items");
							System.out.println("4.View the daily selling report");
							System.out.println("5.Enter 5 to exit :");
							System.out.println("Enter your choice :");
							x=scanner.nextInt();
						   switch (x) {
						case 1: {
							   getListofBuyer.buyer();
							   
							break;
						}
						case 2: {
							   getListofSeller.seller();
							  
							break;
						}
						case 3: {
							   getListofItems.list();
							break;
						}
						case 4: {
							   soldItems.sold();
							  
							break;
						}
				
						}
					     
						} while (x!=5);
				} catch (adminException e) {
					System.out.println(e.getMessage());
				}
				
				break;
                }
			case 2: {
				System.out.println("Enter email");
				String email=scanner.next();
				
				System.out.println("Enter password");
				String pass=scanner.next();
				
				
				ProjectDao pd=new ProjectDaoImp();
				
				try {
					seller sr=pd.loginSeller(email, pass);
					
					System.out.println("Welcome "+sr.getName());
					 System.out.println("=====+=====+====");
	                  int x;
	                  do {
						System.out.println("1.create list of items");
						System.out.println("2.update item price,quantity,etc.");
						System.out.println("3.Add new item in the list");
						System.out.println("4.Remove items from th list");
						System.out.println("5.view the sold item history");
						System.out.println("6.Enetr 6 to exit");
						System.out.println("Enter your choice");
						x=scanner.nextInt();
						switch (x) {
						case 1: {
							  addListofItemss.listofItems();
							break;
						}
						case 2 :{
							  updateItems.update();
							break;
						}
						case 3: {
							  insertItem.addItem();
							break;
						}
						case 4: {
							  removeItem.remove();
							break;
						}
						case 5: {
							  soldItems.sold();
							break;
						}
						}
					} while (x!=6);
				} catch (sellerException e) {
					System.out.println(e.getMessage());
				}
				 
                 
				break;
			}
			case 3:{
				System.out.println("Enter email");
				String email=scanner.next();
				
				System.out.println("Enter password");
				String pass=scanner.next();
				
				
				ProjectDao pd=new ProjectDaoImp();
				
				try {
					buyer br=pd.loginBuyer(email, pass);
					
					System.out.println("Welcome "+br.getName());
					System.out.println("====+====+====+=====");
					int x;
	                do {
						System.out.println("1.Search items by category");
						System.out.println("2.select and view all the sellers and their items category wise");
						System.out.println("3.select items to buy.");
						System.out.println("4.Enetr 4 to exit");
						System.out.println("Enter your choice");
						x=scanner.nextInt();
						switch (x) {
						case 1: {
							  listbyCategory.catbyname();
							break;
						}
						case 2: {
							 sellerItem.sellerbycat();
							break;
						}
						case 3: {
							 itemtoBuy.itemTobuy();
							break;
						}
						}
					} while (x!=4);
				} catch (buyerException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			}
			case 4:{
				SellerRegister.sellerReg();
				break;
			}
			case 5:{
				BuyerRegister.buyerReg();
				break;
			}
			}
		} while (ch!=6);
		System.out.println("Thank you for using...");
	}
}
