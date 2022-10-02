
package com.masai.UseCase;

import java.util.List;

import com.masai.dao.ProjectDao;
import com.masai.dao.ProjectDaoImp;
import com.masai.exceptions.itemException;

public class sellerItem {
     public static void sellerbycat() {
    	 ProjectDao pj=new ProjectDaoImp();
 		
 		try {
 			List<com.masai.bean.sellerItem> items=pj.getListofItembySellerName();
 			items.forEach(s ->{
 				System.out.println("item id :"+s.getIid());
 				System.out.println("item name :"+s.getIname());
 				System.out.println("item price :"+s.getIprice());
 				System.out.println("quantity of item :"+s.getQuantity());
 				System.out.println("seller id of item :"+s.getSellerId());
 				System.out.println("category of item :"+s.getCategory());
 				System.out.println("Seller name of item :"+s.getName());
 				System.out.println("Seller email of item :"+s.getEmail());
 				System.out.println("=======+=======+=======+====");
 			});
 		} catch (itemException e) {
 			System.out.println(e.getMessage());
 		}
	}
}

package com.masai.UseCase;

import java.util.List;

import com.masai.dao.ProjectDao;
import com.masai.dao.ProjectDaoImp;
import com.masai.exceptions.itemException;

public class sellerItem {
     public static void sellerbycat() {
    	 ProjectDao pj=new ProjectDaoImp();
 		
 		try {
 			List<com.masai.bean.sellerItem> items=pj.getListofItembySellerName();
 			items.forEach(s ->{
 				System.out.println("item id :"+s.getIid());
 				System.out.println("item name :"+s.getIname());
 				System.out.println("item price :"+s.getIprice());
 				System.out.println("quantity of item :"+s.getQuantity());
 				System.out.println("seller id of item :"+s.getSellerId());
 				System.out.println("category of item :"+s.getCategory());
 				System.out.println("Seller name of item :"+s.getName());
 				System.out.println("Seller email of item :"+s.getEmail());
 				System.out.println("=======+=======+=======+====");
 			});
 		} catch (itemException e) {
 			System.out.println(e.getMessage());
 		}
	}
}
