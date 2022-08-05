package AppTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

 class Employee implements Comparable<Employee>{

	
	private int id;
	private String name;
	private int age;
	private int amount;
	
	public Employee(int id, String name, int age, int amount) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int compareTo(Employee e) {
		return this.id -e.id;
		
		}
	
		
	}
 class NameCompare implements Comparator<Employee>{
 public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
 }
 }
 class UserDefinedException extends Exception{
	 public UserDefinedException(String str) {
		 super(str);
		 System.out.println("Invalid ID ");
	 }
 }
	


public class Test {

	public static void main(String[] args) throws UserDefinedException{
		ArrayList<Employee> list= new ArrayList<Employee>();
		
		list.add(new Employee(1,"Aniket",25,30000));
		list.add(new Employee(3,"Akash",26,35000));
		list.add(new Employee(2,"Sanket",22,33000));
		list.add(new Employee(4,"Shashikant",23,36000));
		list.add(new Employee(6,"Rushikesh",26,40000));
		list.add(new Employee(5,"Rakesk",28,38000));
		list.add(new Employee(7,"Mahesh",25,50000));
		list.add(new Employee(8,"Sangam",26,39000));
		list.add(new Employee(9,"Sudhir",30,10000));
		list.add(new Employee(10,"Saket",22,31000));
		
		System.out.println("1. Display All Customer Data"
				+"\n 2. Display All Customers Based On Their Name Ascending Order"
				+"\n 3.Update Customer Purchase Amount Using Customer ID");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Choice: ");
		int a= sc.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("\n All Customer Data: ");
			for(Employee employee:list) 
				System.out.println(employee.getId()+" "+ employee.getName()+ " "+employee.getAge()+" "+employee.getAmount() );
				break;
		case 2:
			System.out.println(" All Customers Based On Their Name Ascending Order: ");
			NameCompare namecompare = new NameCompare();
			Collections.sort(list,namecompare);
			for(Employee employee:list) 
				System.out.println(employee.getId()+" "+ employee.getName()+ " "+employee.getAge()+" "+employee.getAmount() );
				break;
				
		case 3:
			System.out.println("\nUpdate Using ID: ");
			int b,amount;
			System.out.println("Enter Id You want to update: ");
			b=sc.nextInt();
			
			if(b>10) {
				throw new UserDefinedException("Invalid ID");
				
			}
			
			System.out.println("Enter Amount You want To Update: ");
			amount=sc.nextInt();
			for(Employee user: list) {
				if(user.getId()==b) {
					user.setAmount(amount);
					break;
					
				}
			}
			for(Employee employee:list) 
				System.out.println(employee.getId()+" "+ employee.getName()+ " "+employee.getAge()+" "+employee.getAmount() );
				break;
			
		
			
			}
	
		



	}

}
