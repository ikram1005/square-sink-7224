package com.masai.UseCase;

import java.util.List;

import com.masai.bean.buyer;
import com.masai.dao.ProjectDao;
import com.masai.dao.ProjectDaoImp;
import com.masai.exceptions.buyerException;

public class getListofBuyer {
    public static void buyer(){
		ProjectDao pj=new ProjectDaoImp();
		
		try {
			List<buyer> buyers =pj.getAllBuyer();
			
			buyers.forEach(s ->{
				System.out.println("buyer id :"+s.getBid());
				System.out.println("buyer name :"+s.getName());
				System.out.println("buyer email :"+s.getEmail());
				System.out.println("buyer password :"+s.getPassword());
				 System.out.println("=====+======+=====");
			});
			
			
		} catch (buyerException e) {
			System.out.println(e.getMessage());
		}
	}
}
