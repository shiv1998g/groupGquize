package com.quizecom;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.Connection;
public class Getdbconne {		
		static PreparedStatement pr = null;
		static Scanner sc = new Scanner(System.in);
		static Connection connection = Getdbconne.getconnection();
		static int s;
	    public static Connection getconnection() {   	
	    	try {
	    	Class.forName("com.mysql.jdbc.Driver");
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quize?characterEncoding=utf8", "root", "root");
	    	 }catch(Exception e) {	 e.printStackTrace(); }
	      return connection;}    
	    public static void update(int mark,int id) {	
			try {			
				pr = connection.prepareStatement("update studentinfo  set mark=?   where id=?");
				pr.setInt(1, mark);
				pr.setInt(2, id);
			 pr.executeUpdate();			
			} catch (Exception e) {
				e.printStackTrace();}    }		
				public void insert1(int id, String name) {			
					try {				
						pr = connection.prepareStatement("insert into studentinfo(id,name) values(?,?)");
						pr.setInt(1, id);
						pr.setString(2, name);
						pr.executeUpdate();
					} catch (Exception e) {	e.printStackTrace();}}
				public static int insert() {			
					while (true) {
						System.out.print("ENTER  Id:");
						int id = sc.nextInt();
						s = id;System.out.println();
						System.out.print("ENTER NAME:");
						sc.nextLine();
						String name = sc.nextLine();System.out.println();
						new Getdbconne().insert1(id, name);
						break;}	return s;
				}
			}





