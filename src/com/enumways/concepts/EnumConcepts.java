package com.enumways.concepts;

public class EnumConcepts {

	enum DAYS {
		SUNDAY, MONDAY, TUESDAY
	}

	public static void main(String[] args) {

		System.out.println(DAYS.values());

		for (DAYS n : DAYS.values()) {
		System.out.println(n);

		}
	}

}
