package com.masai.UseCase;

import java.util.List;

import com.masai.bean.seller;
import com.masai.dao.ProjectDao;
import com.masai.dao.ProjectDaoImp;
import com.masai.exceptions.sellerException;

public class getListofSeller {
   public static void seller() {
	ProjectDao pj=new ProjectDaoImp();
	
	try {
		List<seller> sellers=pj.getAllSeller();
		sellers.forEach(s ->{
			System.out.println("seller id :"+s.getSid());
			System.out.println("seller name :"+s.getName());
			System.out.println("seller email :"+s.getEmail());
			System.out.println("seller password :"+s.getPassword());
			System.out.println("=====+======+=====");
		});
	} catch (sellerException e) {
		System.out.println(e.getMessage());
	}
}
}
