package com.greatlearning.javafsd.superdepartment;

public class MainDriver {
	public static void main(String[] args) {
	    SuperDepartment department;
	    
	    // create objects of HrDepartment, TechDepartment, AdminDepartment
	    
	    department = new AdminDepartment();
	    System.out.println("Welcome to " + department.departmentName());
	    System.out.println(department.getTodaysWork());
	    System.out.println(department.getWorkDeadline());
	    System.out.println(department.isTodayAHoliday());
	    System.out.println();
	    
	    department = new HrDepartment();
	    System.out.println("Welcome to " + department.departmentName());
	    System.out.println(((HrDepartment)department).doActivity());
	    System.out.println(department.getTodaysWork());
	    System.out.println(department.getWorkDeadline());
	    System.out.println(department.isTodayAHoliday());
	    	    System.out.println();
	    
	    department = new TechDepartment();
	    System.out.println("Welcome to " + department.departmentName());
	    System.out.println(department.getTodaysWork());
	    System.out.println(department.getWorkDeadline());
	    System.out.println(((TechDepartment)department).getTechStackInformation());
	    System.out.println(department.isTodayAHoliday());
	    System.out.println();
	    
	    
	  }
	}


