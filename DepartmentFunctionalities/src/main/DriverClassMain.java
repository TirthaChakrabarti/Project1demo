package main;

import departmentClasses.AdminDepartment;
import departmentClasses.HrDepartment;
import departmentClasses.TechDepartment;

public class DriverClassMain {

	public static void main(String[] args) {
		
		AdminDepartment adminDept = new AdminDepartment();
		
		System.out.println("Welcome to "+adminDept.departmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());
		
		System.out.println("");
		
		HrDepartment HrDept = new HrDepartment();
		
		System.out.println("Welcome to "+HrDept.departmentName());
		System.out.println(HrDept.doActivity());
		System.out.println(HrDept.getTodaysWork());
		System.out.println(HrDept.getWorkDeadline());
		System.out.println(HrDept.isTodayAHoliday());
		
		System.out.println("");
		
		TechDepartment techDept = new TechDepartment();
		
		System.out.println("Welcome to "+techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday());
	}
}
