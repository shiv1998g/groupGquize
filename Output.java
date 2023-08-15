package com.quizecom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;
//15/08/2023 make changes try
public class Output {
	static PreparedStatement pr = null;
	static Scanner sc = new Scanner(System.in);
	static Connection connection = Getdbconne.getconnection();
	static int m = 0;
	static int count = 0;
	static int limit = 10;
	public static int  output() {
		try {
			pr = connection.prepareStatement("select * from quco where Q=?");
			List<Integer> list =Random.random();
			int y = 0;
			for (Integer e1 : list) {y = e1;
				m++;
				pr.setInt(1, y);
				ResultSet rs = pr.executeQuery();
				while (rs.next()) {
					System.out.println("             " + m + "]" + rs.getString("questions") + "\n"+"\n" 
							+ "             " + "A)" + rs.getString("op1") + "\n" +"\n"+ "             " + "B)"
							+ rs.getString("op2") + "\n"+"\n" + "             " + "C)" + rs.getString("op3") + "\n"+"\n"
							 + "             " + "D)" + rs.getString("op4") + "\n");
					System.out.print("            " + "        SELECT YOUR ANS"+" ");
					String h = sc.next();
					String m = rs.getString("ans");
					if (h.toLowerCase().equals(m)) {
						count++;System.out.println();
						System.out.println("                    Correct  Ans");
					} else {System.out.println();
						System.out.println("                     *" + "Wrong Ans");
					}
			//	System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
				}
				System.out.println();
				if (limit != m) {
					System.out.print("             Next Question Pls Pres [y] End Quize Press [N]"+" ");
					String str = "y";
					if (str.equals(sc.next().toLowerCase())) {
					System.out.println();
				System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
					} else {end();break;}
				} else {end();break;}
			}
		} catch (Exception e) {	e.printStackTrace();}
         return count;}
	private static void end() {
		System.out.println(
				"=========================================================================quize ended=========================================================================");
		System.out.println(
				"==============================================================================================================================================================="
						+ "\n");
		System.out.print("          Are You Want to Show Result[y/n]"+" ");
		if ("y".equals(sc.next().toLowerCase())) {
			System.out.println("                                               Your Obtained Score Is" + "=" + count
					+ " " + "out of 10"+"\n");
			if (count == 8 || count == 9 || count == 10) {
				System.out.println(
						"                                                        Your Obtained Grade Is" + "=" + "A");
			} else if (count == 7 || count == 6) {
				System.out.println(
						"                                                        Your Obtaied Grade Is" + "=" + "B");
			} else {
				System.out.println("                                                You Fail" + " "
						+ "Your Obtained  Grade Is" + "=" + "D" + "\n");			}		} else {		}	}
}
