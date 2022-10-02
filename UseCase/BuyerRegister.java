package com.masai.UseCase;

import java.util.Scanner;
import com.masai.bean.buyer;
import com.masai.dao.ProjectDao;
import com.masai.dao.ProjectDaoImp;

public class BuyerRegister {
     public static void buyerReg() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name");
		String name=s.next();
		
		System.out.println("Enter email");
		String email=s.next();
		
		System.out.println("Enter password");
		String pass=s.next();
		
		ProjectDao pj=new ProjectDaoImp();
		
		buyer b=new buyer();
		b.setName(name);
		b.setEmail(email);
		b.setPassword(pass);
		
		String result=pj.registerBuyer(b);
        System.out.println(result);
     }
}
