
package com.masai.UseCase;

import java.util.List;
import java.util.Scanner;
import com.masai.bean.item;
import com.masai.dao.ProjectDao;
import com.masai.dao.ProjectDaoImp;

public class listbyCategory {
     public static void catbyname(){
    	 
    	 Scanner scanner=new Scanner(System.in);
    	 System.out.println("Enter category name of item");
    	 String cat=scanner.next();
    	  ProjectDao pj=new ProjectDaoImp();
  		  
    	  try {
    			List<item> items= pj.getitembycategory(cat);
    			
    			items.forEach(dt -> System.out.println(dt));
    			
    			}catch (Exception e) {
    				System.out.println(e.getMessage());
    			}
  		
	}
}

package com.masai.UseCase;

import java.util.List;
import java.util.Scanner;
import com.masai.bean.item;
import com.masai.dao.ProjectDao;
import com.masai.dao.ProjectDaoImp;

public class listbyCategory {
     public static void catbyname(){
    	 
    	 Scanner scanner=new Scanner(System.in);
    	 System.out.println("Enter category name of item");
    	 String cat=scanner.next();
    	  ProjectDao pj=new ProjectDaoImp();
  		  
    	  try {
    			List<item> items= pj.getitembycategory(cat);
    			
    			items.forEach(dt -> System.out.println(dt));
    			
    			}catch (Exception e) {
    				System.out.println(e.getMessage());
    			}
  		
	}
}

