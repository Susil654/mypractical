package com.firstjdbc.javaofc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
        System.out.println( "Hello World!" );
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","s125");
        if(con.isClosed())
        {
        	System.out.println("The connection is close");
        }
        else
        {
        	System.out.println("The connection is established");
	        }
            String q="insert into books(bid,bname,bprice) values (?,?,?)"; //insert statement
	        PreparedStatement pstmt=con.prepareCall(q);
	        
	        Scanner sc=new Scanner(System.in);   //taking input from user
	        System.out.println("Enter your id"); 
	        int id=sc.nextInt();
	        System.out.println("Enter your name");
	        String name=sc.next();
	        System.out.println("Enter your price");
	        int price=sc.nextInt();
	        
	        pstmt.setInt(1, id);
	        pstmt.setString(2, name);
	        pstmt.setInt(3, price);
	        
	        pstmt.executeUpdate();  //execute the query
	        System.out.println("The data is inserted successfully");
	        
	        con.close();  //closing connection    
	   
   }
   catch(Exception e)
	{
		System.out.println(e);
	}
    }

public void update1() 
{
	System.out.println("Update your data into table");
	try
	{
    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","s125");
    if(con.isClosed())
    {
    	System.out.println("The connection is close");
    }
    else
    {
    	System.out.println("The connection is established");
        }
      String q="update books set bname=?,bprice=? where bid=?"; //update  statement
        PreparedStatement pstmt=con.prepareCall(q);
        
        Scanner sc=new Scanner(System.in);   //taking input from user
        System.out.println("Enter your name for change");
        String name=sc.next();
        System.out.println("Enter your price for change");
        int price=sc.nextInt();
        System.out.println("Enter id for change details");
        int id=sc.nextInt();
        
        pstmt.setString(1, name); //setting the values in the query
        pstmt.setInt(2, price);
        pstmt.setInt(3, id);
        
        pstmt.executeUpdate();  //execute the prepared statement
        System.out.println("The data is updated successfully");
        
        con.close();  //closing connection
}
    catch(Exception e)
	{
		System.out.println(e);
	}
}


public void delete1()
{
	System.out.println("Delete your data from table");
	try
	{
	
	    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","s125");
	    if(con.isClosed())
	    {
	    	System.out.println("The connection is close");
	    }
	    else
	    {
	    	System.out.println("The connection is established");
	        }                                                                     
             String q="delete from books  where bid=?"; //delete  statement
              PreparedStatement pstmt=con.prepareCall(q);

              Scanner sc=new Scanner(System.in);   //taking input from user
              System.out.println("Enter the ID you want to delete");
              int id=sc.nextInt();
              pstmt.setInt(1,id); //setting the values n the query
              pstmt.executeUpdate(); //execute the preparestatement
              System.out.println("The data is deleted successfully");
              
              con.close();   //closing the connection
}
catch(Exception e)
	{
		System.out.println(e);
	}
}
public void display1()
{
	System.out.println("Display your data from table");
	try {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","s125");
        if(con.isClosed())
        {
        	System.out.println("The connection is close");
        }
        else
        {
        	System.out.println("The connection is established");
	        }                                                             
        String q="select bid,bname,bprice from books"; //display  statement
        PreparedStatement pstmt=con.prepareCall(q);
        ResultSet rset=pstmt.executeQuery();
        
        while(rset.next())
        {
        	int id=rset.getInt(1);
        	String name=rset.getString(2);
        	String price=rset.getString(3);
        	System.out.println("ID: "+id+"  "+"Name: "+name+" ");
             System.out.println("The data is displayed successfully");
}
        	
    	}
        catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
}


   