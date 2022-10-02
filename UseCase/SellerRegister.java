package com.masai.UseCase;

import java.util.Scanner;

import com.masai.bean.seller;
import com.masai.dao.ProjectDao;
import com.masai.dao.ProjectDaoImp;

public class SellerRegister {
    public static void sellerReg() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name");
		String name=scanner.next();
		
		System.out.println("Enter email");
		String email=scanner.next();
		
		System.out.println("Enter Password");
		String pass=scanner.next();
		
		ProjectDao pj=new ProjectDaoImp();
		
		seller s=new seller();
		s.setName(name);
		s.setEmail(email);
		s.setPassword(pass);
		
		
		String result=pj.registerSeller(s);
		System.out.println(result);
				
    }
}
