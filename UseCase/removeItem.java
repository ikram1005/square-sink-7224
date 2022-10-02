package com.masai.UseCase;

import java.util.Scanner;

import com.masai.bean.item;
import com.masai.dao.ProjectDao;
import com.masai.dao.ProjectDaoImp;

public class removeItem {
    public static void remove() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enetr name of item");
		String name=scanner.next();
		
		ProjectDao pj=new ProjectDaoImp();
		item it=new item();
		it.setIname(name);
		
		String result=pj.removeitem(it);
		System.out.println(result);
	}
}
