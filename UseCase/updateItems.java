
package com.masai.UseCase;

import java.util.Scanner;

import com.masai.bean.item;
import com.masai.dao.ProjectDao;
import com.masai.dao.ProjectDaoImp;

public class updateItems {
      public static void update() {
		Scanner scanner=new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.update price of item");
			System.out.println("2.update quantity of item");
			System.out.println("enter 0 for exit");
			System.out.println("Enter your choice : ");
			ch=scanner.nextInt();
			
			switch (ch) {
			case 1: {
				  System.out.println("Enter name of item");
				  String name=scanner.next();
				  System.out.println("Enter price");
				  int p=scanner.nextInt();
				  
				  ProjectDao pd=new ProjectDaoImp();
				  
				  item it=new item();
				  it.setIname(name);
				  it.setIprice(p);
				  
				  String result=pd.updatePriceofItems(it);
				  System.out.println(result);
				break;
			}
			case 2: {
				  System.out.println("Enter name of item");
				  String name=scanner.next();
				  System.out.println("Enter quantity");
				  int p=scanner.nextInt();
				  
				  ProjectDao pd=new ProjectDaoImp();
				  
				  item it=new item();
				  it.setIname(name);
				  it.setQuantity(p);
				  
				  String result=pd.updateQuantityofItems(it);
				  System.out.println(result);
				break;
			   }
			}
		} while (ch!=0);
	}
}


package com.masai.UseCase;

import java.util.Scanner;

import com.masai.bean.item;
import com.masai.dao.ProjectDao;
import com.masai.dao.ProjectDaoImp;

public class updateItems {
      public static void update() {
		Scanner scanner=new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.update price of item");
			System.out.println("2.update quantity of item");
			System.out.println("enter 0 for exit");
			System.out.println("Enter your choice : ");
			ch=scanner.nextInt();
			
			switch (ch) {
			case 1: {
				  System.out.println("Enter name of item");
				  String name=scanner.next();
				  System.out.println("Enter price");
				  int p=scanner.nextInt();
				  
				  ProjectDao pd=new ProjectDaoImp();
				  
				  item it=new item();
				  it.setIname(name);
				  it.setIprice(p);
				  
				  String result=pd.updatePriceofItems(it);
				  System.out.println(result);
				break;
			}
			case 2: {
				  System.out.println("Enter name of item");
				  String name=scanner.next();
				  System.out.println("Enter quantity");
				  int p=scanner.nextInt();
				  
				  ProjectDao pd=new ProjectDaoImp();
				  
				  item it=new item();
				  it.setIname(name);
				  it.setQuantity(p);
				  
				  String result=pd.updateQuantityofItems(it);
				  System.out.println(result);
				break;
			   }
			}
		} while (ch!=0);
	}
}


