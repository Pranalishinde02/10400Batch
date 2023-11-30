package ProductManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductApp {

	Scanner sc = new Scanner(System.in);
	
	ArrayList<Product> list = new ArrayList<Product>();
	ProductApp()
	{
		list.add(new Product(1,"Laptop",50000.0));
		list.add(new Product(2,"Phone",30000.0));
		list.add(new Product(3,"Refrigereter",40000.0));
		list.add(new Product(4,"Fan",7000.0));
	}
	
	public void ViewAllData()
	{
		System.out.println("===============================================================");
		if(list.size()==0)
		{
			System.out.println("No Record Found.");
		}
		
		for(Product p:list)
		{
			System.out.println("Product Id:"+p.getpId()+"\tProduct Name:"+p.getpName()+"\tProduct Price"+p.getpPrice());
			
		}
		System.out.println("===============================================================");
	}
	
	public void InsertData()
	{
		System.out.println("Enter Product Id:");
		int pId=sc.nextInt();
		System.out.println("Enter Product Name:");
		String pName=sc.next();
		System.out.println("Enter Product Price:");
		double pPrice=sc.nextDouble();
		
		Product p = new Product(pId,pName,pPrice);
		list.add(p);
	}
	
	public void ViewDataById()
	{
		System.out.println("Enter Product Id to View Data:");
		int pId=sc.nextInt();
		int flag=0;
		System.out.println("==================================================");
		for(Product p:list)
		{
			if(pId==p.getpId())
			{
				flag=1;
				System.out.println("Product Id:"+p.getpId()+"\tProduct Name:"
				+p.getpName()+"\tProduct Price:"+p.getpPrice());
			}
		}
		if(flag==0)
		{
			System.out.println("Product Id Does Not Exist.");
			System.out.println("================================================");
		}
	}
	
	
	
	public void UpdateData()
	{
		System.out.println("Enter Product Id to Update Data:");
		int pId=sc.nextInt();
		int flag=0,index=0;
		Product p1=null;
		for(Product p:list)
		{
			if(p.getpId()==pId)
			{
				flag=1;
				index=list.indexOf(p);
				p1=p;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("===============================================================");
			System.out.println("Enter Product Name:");
			String pName=sc.next();
			System.out.println("Enter Product Price:");
			double pPrice=sc.nextDouble();
			
			p1.setpName(pName);
			p1.setpPrice(pPrice);
			
			list.set(index, p1);
			System.out.println("=============================================================");
			System.out.println("Product Details Updated...");
		}
		else
		{
			System.out.println("Id Does not exist...");
			System.out.println("=============================================================");
		}
		
		
	}
		public void DeleteDataById()
		{
			System.out.println("Enter Product Id to Update Data:");
			int pId=sc.nextInt();
			int flag=0,index=0;
			Product p1=null;
			for(Product p:list)
			{
				if(p.getpId()==pId)
				{
					flag=1;
					index=list.indexOf(p1);
					p1=p;
					break;
				}
			}
			System.out.println("===============================================");
			if(flag==0)
			{
				System.out.println("Product Id Does Not Exist..");
			}
			else
			{
				list.remove(p1);
				System.out.println("Product Record deleted successfully");
			}
			System.out.println("=================================================");
			
		}
		
		public void DeleteAllData()
		{
			System.out.println("===========================================================");
			if(list.size()>0)
			{
				list.clear();
				System.out.println("All Record Deleted Successfully..");
			}
			else
			{
				System.out.println("No Record Found...");
			}
			System.out.println("===========================================================");
		}
	
}
