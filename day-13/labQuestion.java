   // scanner class

// Read the class notes and develop the programs.
// Program 01:
// -----------
// Write a Program on OOPs to define Product class properties and behaviour.

// properties :
// productId : int
// productName : String
// productPrice : double

// Initialize these properties with the help of Methods using Scanner class not by using Object reference.

// behavior:
// setProductData() : public void
// getProductInfo() : public void

// Sol: 
// BLC 
// _____
// package com.ankush.labday13oopselc_blc;

// import java.util.Scanner;

// public class Product 
// {
//    int productId;
//    String productName;
//    double productPrice;
   
   
//    public void setProductData()
//    {
// 	   Scanner sc= new Scanner(System.in);
// 	   System.out.print("Enter a product id number :");
// 	   productId = sc.nextInt();
// 	   System.out.print("Enter a product name :");
// 	    productName = sc.next();
// 	   System.out.print("Enter a product price :");
// 	   productPrice = sc.nextDouble();
	   
//    }
   
//    public void getProductInfo()
//    {
// 	   System.out.println("Product id is : "+productId);
// 	   System.out.println("Product name is : "+productName);
// 	   System.out.println("Product price is : "+productPrice);
//    }
   
   
   
   
   
   
// }
// ____________________________________________________________________________


// ELC
// _____
// package com.ankush.labday13oopselc_blc;

// public class Productdetials 
// {

// 	public static void main(String[] args) 
// 	{
// 		Product product=new Product();
		
// 		product.setProductData();
		
// 		product.getProductInfo();

// 	}

// }



// =============================================================================================================================================================================================================================================

// Program 02:
// -----------
// Write a Program on OOPs to define Employee class properties and behaviour.

// properties :
// employeeId : int
// employeeName : String
// employeeSalary : double

// Initialize these properties with the help of Methods using Scanner class not by using Object reference.

// behavior:
// setEmployeeData() : public void
// getEmployeeData() : public void


// Sol: 

// BLC
// ______
// package com.ankush.labday13oopselc_blc;

// import java.util.Scanner;

// public class Employee 
// {
//     int employeeId;
//     String employeeName;
//     double employeeSalary;
    
    
//     public void setEmployeeData()
//     {
//     	Scanner sc=new Scanner(System.in);
//     	System.out.print("Enter a employee id number :");
//     	 employeeId = sc.nextInt();
//     	System.out.print("Enter a employee name :");
//     	employeeName = sc.next();
//     	System.out.print("Enter a employee salary :");
//     	employeeSalary=sc.nextDouble();
    	
//     }
    
    
//     public void getEmployeeData()
//     {
//     	System.out.println("Employee id is :"+employeeId);
//     	System.out.println("Employee name is :"+employeeName);
//     	System.out.println("Employee salary is :"+employeeSalary);
//     }
    
    
    
    
    
    
    
    
    
// }
// _________________________________________________________________________________


// ELC
// _______
// package com.ankush.labday13oopselc_blc;

// public class EmployeeDemo {

// 	public static void main(String[] args) 
// 	{
// 		Employee emp= new Employee();
		
// 		emp.setEmployeeData();
// 		emp.getEmployeeData();

// 	}

// }


// =============================================================================================================================================================================================================================================


// Note : Create two more programs based on your imagination


// BLC
// ______
// package com.ankush.labday13oopselc_blc;

// import java.util.Scanner;

// public class Tv 
// {
//   String tvBrand;
//   int tvInch;
//   double tvPrice;
   
//   public void setTvdata()
//   {
// 	  Scanner sc= new Scanner(System.in);
// 	   System.out.print("Enter Tv Brand name :");
// 	   tvBrand = sc.next();
// 	   System.out.print("Enter  a Tv Size :");
// 	    tvInch = sc.nextInt();
// 	   System.out.print("Enter a Tv price :");
// 	   tvPrice = sc.nextDouble();
	   
	   
//   }
  
//   public void getTvData()
//   {
// 	  System.out.println("Tv brand is :"+tvBrand);
// 	  System.out.println("Tv Size is :"+tvInch);
// 	  System.out.println("Tv Price is :"+tvPrice);
//   }
  
// }
// ___________________________________________________________________

// ELC
// ____
// package com.ankush.labday13oopselc_blc;

// public class TvDemo {

// 	public static void main(String[] args) 
// 	{
// 		Tv t=new Tv();
		
// 		t.setTvdata();
// 		t.getTvData();
// 	}

// }



// BLC
// ____
// package com.ankush.labday13oopselc_blc;

// import java.util.*;

// public class Mobile 
// {
// 	  String mobileBrand;
// 	  int mobileRam;
// 	  int mobileStorage;
// 	  double mobilePrice;
	  
// 	  public void setMobiledata()
// 	  {
// 		   Scanner sc= new Scanner(System.in);
// 		   System.out.print("Enter Brand name :");
// 		   mobileBrand = sc.next();
// 		   System.out.print("Enter  a RAM size :");
// 		   mobileRam = sc.nextInt();
// 		   System.out.print("Enter  a storage :");
// 		   mobileStorage = sc.nextInt();
// 		   System.out.print("Enter a price :");
// 		   mobilePrice = sc.nextDouble();
// 	  }
		   
// 		   public void getMobileData()
// 		   {
// 			      System.out.println("Mobile  brand is :"+mobileBrand);
// 				  System.out.println("Mobile RAM Size is :"+mobileRam);
// 				  System.out.println("Mobile Storage is :"+mobileStorage);
// 				  System.out.println("Mobile Price is :"+mobilePrice);
// 		   }
// 	 }


// ELC
// ______
// package com.ankush.labday13oopselc_blc;

// public class MobileDemo {

// 	public static void main(String[] args) 
// 	{
// 		Mobile m = new Mobile();
// 		m.setMobiledata();
// 		m.getMobileData();

// 	}

// }
// ____
