package com.gl.gayathri.oopsassignment.driverMain;
import com.gl.gayathri.oopsassignment.service1.*;
import com.gl.gayathri.oopsassignment.service2.*;
import com.gl.gayathri.oopsassignment.service3.*;
import com.gl.gayathri.oopsassignment.service4.*;

public class Main {
	
	public static void main(String[] args) {
		
		//create objects of Admin, Hr, Tech Departments 
		AdminDepartment adminobj = new AdminDepartment();
		HrDepartment hrobj = new HrDepartment();
		TechDepartment techobj = new TechDepartment();
		
		//common string for display
		final String welcome ="Welcome to";
		
		//Start displaying outputs
		//AdminDepartment
		
		System.out.println(welcome + adminobj.departmentName());
		System.out.println((adminobj.getTodaysWork()).trim());
		System.out.println((adminobj.getWorkDeadline()).trim());
		System.out.println((adminobj.isTodayAHoliday()).trim());
		System.out.println("");
		
		System.out.println(welcome + hrobj.departmentName());
		System.out.println((hrobj.doActivity()).trim());
		System.out.println((hrobj.getTodaysWork()).trim());
		System.out.println((hrobj.getWorkDeadline()).trim());
		System.out.println((hrobj.isTodayAHoliday()).trim());
		System.out.println("\n");
		
		System.out.println(welcome + techobj.departmentName());
		System.out.println((techobj.getTodaysWork()).trim());
		System.out.println((techobj.getWorkDeadline()).trim());
		System.out.println((techobj.getTechStackInformation()).trim());
		System.out.println((techobj.isTodayAHoliday()+ "\n").trim());
	}

}
