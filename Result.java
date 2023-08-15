package com.quizecom;tyhg

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
  shivkumar 15/08/2023
public class Result {try to commit changes on shivkumar repo on 
	static PreparedStatement pr = null;
	static Scanner sc = new Scanner(System.in);
	static Connection connection = Getdbconne.getconnection();

	public static void result1() {
		System.out.println();
		System.out.print("       Press Your Id" + " ");		
		try {
			PreparedStatement p = connection.prepareStatement("select * from studentinfo  where id=?");
			p.setInt(1, sc.nextInt());
			ResultSet r = p.executeQuery();System.out.println();
			System.out.println("Student Name" + "\t" + "\t" + "Id" + "\t" + "Marks");
			while (r.next()) {
				System.out.println(r.getString(2) + "\t" + "\t" + r.getInt(1) + "\t" + r.getInt(3));
			}
		} catch (SQLException e) {e.printStackTrace();}
		try {if (pr != null)	pr.close();
			if (connection != null)	connection.close();
		} catch (SQLException e) {	e.printStackTrace();}}

	public static void result() {
		try {
			PreparedStatement p = connection.prepareStatement("select * from studentinfo  order by  mark");
			ResultSet r = p.executeQuery();
			System.out.println();
			System.out.println("Student Name" + "\t" + "\t" + "Id" + "\t" + "Marks");
			while (r.next()) {
				System.out.println(r.getString(2) + "\t" + "\t" + r.getInt(1) + "\t" + r.getInt(3));
				if (r.next() == false) {
					System.out.println(							"-----------------------------------------------------------------------------------------------------------------------------------------");
					break;
				} else {r.previous();}}
		} catch (SQLException e) {e.printStackTrace();
		}}}
