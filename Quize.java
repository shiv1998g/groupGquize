package com.quizecom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Quize {
	static PreparedStatement pr = null;
	static Scanner sc = new Scanner(System.in);
	static Connection connection = Getdbconne.getconnection();
	static int id;

	public static void main(String[] args) {
		try {
			System.out.println("***************************************************W-E-L-C-O-M-E-T-O-Q-U-I-S-E-C-O-M-P-I-T-A-T-I-O-N****************************************************************************");			
			System.out.println("\n");
			int d = Getdbconne.insert();//to make db conne
			System.out.print("Login [y/n]:" + " ");	id = d;
			while (true) {
				if (sc.next().toLowerCase().equals("y"))System.out.println(); {
					System.out.println("------------------------------------------.....................Quize Started..............------------------------------------------------------------------------"									+ "\n" + "\n");
					int count = Output.output();
					Getdbconne.update(count, id);//to upload marks on db
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.print("\t"+"Are you Want to show Result of All student press[y/n]"									+ " ");
					if (sc.next().toLowerCase().equals("y")) {
						Result.result();}} //to get student result
				System.out.print("\t"+" Are you Want to show Particular Student  Records press[y/n]"+ " ");
				if (sc.next().toLowerCase().equals("y")) {
					Result.result1();
					System.out.println("=======================================================================================================================================================================");
					System.out.println(							"                                                               T.H.A.N.K.I.N.I.N.G.F.O.R.V.S.I.T.I.N.G");
				} else {break;}}
		     } catch (Exception e){e.printStackTrace();
		     } finally {	if (sc != null)	sc.close();
		   }
		}
	}
