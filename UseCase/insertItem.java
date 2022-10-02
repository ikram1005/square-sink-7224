
package com.masai.UseCase;

import java.util.Scanner;

import com.masai.bean.item;
import com.masai.dao.ProjectDao;
import com.masai.dao.ProjectDaoImp;

public class insertItem {
  public static void addItem() {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter item name ");
	String name=scanner.next();
	
	System.out.println("Enetr item price");
	int price=scanner.nextInt();
	
	System.out.println("Enter quantity");
	int q=scanner.nextInt();
	
	System.out.println("Enter sellerId");
	int si=scanner.nextInt();
	
	System.out.println("Enter category");
	String cat=scanner.next();
	
	ProjectDao pj=new ProjectDaoImp();
	
	item i=new item();
	i.setIname(name);
	i.setIprice(price);
	i.setQuantity(q);
	i.setSellerId(si);
	i.setCategory(cat);
	
	String result =pj.Additem(i);
	
	System.out.println(result);
	
}
}

package com.masai.UseCase;

import java.util.Scanner;

import com.masai.bean.item;
import com.masai.dao.ProjectDao;
import com.masai.dao.ProjectDaoImp;

public class insertItem {
  public static void addItem() {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter item name ");
	String name=scanner.next();
	
	System.out.println("Enetr item price");
	int price=scanner.nextInt();
	
	System.out.println("Enter quantity");
	int q=scanner.nextInt();
	
	System.out.println("Enter sellerId");
	int si=scanner.nextInt();
	
	System.out.println("Enter category");
	String cat=scanner.next();
	
	ProjectDao pj=new ProjectDaoImp();
	
	item i=new item();
	i.setIname(name);
	i.setIprice(price);
	i.setQuantity(q);
	i.setSellerId(si);
	i.setCategory(cat);
	
	String result =pj.Additem(i);
	
	System.out.println(result);
	
}
}
