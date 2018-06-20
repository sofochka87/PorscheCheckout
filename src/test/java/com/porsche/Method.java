package com.porsche;

public class Method {

	public static void countSum(String price1, String... prices) {
		int i = Integer.parseInt(price1.replaceAll("[^0-9]", ""));
		int sum = 0;
		for (String price : prices) {
			int each = Integer.parseInt(price.replaceAll("[^0-9]", ""));
			sum += each;
		}
		if (i == sum) {
			System.out.println("VERIFIED");
		} else {
			System.out.println("NOT VERIFIED");
		}
	}
}
