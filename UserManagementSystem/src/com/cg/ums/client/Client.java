package com.cg.ums.client;


import java.util.Scanner;

import com.cg.ums.entities.User;
import com.cg.ums.service.UserService;
import com.cg.ums.service.UserServiceImpl;

public class Client {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		UserService service = new UserServiceImpl();
		int a;
		do{
			System.out.println("Enter your choice");
		
		System.out.println("1.Listing total number of user\n2.Listing user by given character\n3.Listing by Email");
		a=sc.nextInt();
		
		switch(a) {
		
		case 1:
			System.out.println("-----------------Listing total number of users-----------------");
			System.out.println("Total users:"+service.findCount());
			
			
			break;
		case 2:
			System.out.println("Enter character by which you want to search");
			char i=sc.next().charAt(0);
			
			System.out.println("-----------------Listing user by "+i+"-----------------");
			for(User user:service.findByName(i)) {
				System.out.println(user);
			}
			break;
			
		case 3:

			System.out.println("-----------------Listing users by email-----------------");
			for(User user:service.findAllByEmailAsc()) {
				System.out.println(user);
			}
			break;
		
			default:
				System.out.println("Enter the given choice only");
				break;
			
		}
		}while(true);
		
		
		
		
	}

}
