package com.quizecom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Random {
	
	public static List<Integer> random() {
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			a.add(i);}
		Collections.shuffle(a);
		return a;}
   public static void main(String[] args) {
	   List<Integer> list=random();	
	   System.out.println(list);
}}
