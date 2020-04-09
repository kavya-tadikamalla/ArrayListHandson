package cf;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CustomersMain {
	
	public static  List<Customer> readData()  
	{
		try {
		List<Customer>  cust = new ArrayList<Customer>();
		List<Address> addr=new ArrayList<Address>();
		File f=new File("F:\\javasessions2\\rivisionhandson\\customer.txt");
		BufferedReader br=new BufferedReader(new FileReader(f));
		String data=br.readLine();
		while(data!=null) {
			String[] str=data.split(",");
			Customer c=new Customer();
			Address a=new Address();
			c.setCustId(Integer.parseInt(str[0]));
			c.setCustname(str[1]);
			c.setEmail(str[2]);
			c.setMobile(str[3]);
			SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
			c.setDob(sdf.parse(str[4]));
			a.setCity(str[5]);
			a.setState(str[6]);
			a.setCountry(str[7]);
			addr.add(a);
			c.setAddress(a);
			cust.add(c);
			data=br.readLine();
			
			
		}
		return cust;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	public static void displayCustomers()
	{
		List<Customer> list = readData();
		 
		for(Customer e: list)
		{
			System.out.println(e);
		}
	}
	public static void displaybyCity(String city) {
		List<Customer> list=readData();
		for(Customer c: list) {
			if(c.getAddress().getCity().equalsIgnoreCase(city))
			{
				System.out.println(c);
			}
		}
		
	}
	
	
	public static void displayAge(int age)
	{
		List<Customer> list=readData();
		
		for(Customer c:list) {
			Date d=new Date();
			int date=d.getYear()+1900;
			int date1=c.getDob().getYear()+1900;
			int aged=date-date1;
			
			if(aged<=age)
			{
				Map cmap=new HashMap<Integer,String>();
			cmap.put(aged,c.getCustname());
				
				System.out.println(cmap.get(age));
			}
			else
			{
				System.out.println("No Customer");
			}
			
		}
		
				
	}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Select your Choice:");
		System.out.println("1. Display All Customers\n"
				+ "2.Display by Age\n3.Display by Country\n4.Exit");
		while(true) {
			System.out.println("Enter your Choice");
			int op=sc.nextInt();
			switch(op) {
			case 1:
				displayCustomers();
				break;
			case 2:
				//display by age
				System.out.println("Enter Age");
				int a=sc.nextInt();
				displayAge(a);
				
				break;
			case 3:
				//display by city
				System.out.println("Enter City ");
				String city=sc.next();
				displaybyCity(city);
				break;
			case 4:
				System.out.println("Bye");
				System.exit(0);
			}
		
		}
	}

}
