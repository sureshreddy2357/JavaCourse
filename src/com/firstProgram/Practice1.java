package com.firstProgram;

public class Practice1 {

	public static void main(String[] args) {

		int pre = 6350;
		int cur = 9800;
		int bill = cur - pre;

		if (bill < 100) {
			int unitprice = 1;
			int powerbill = bill * 1;
			System.out.println(powerbill);

		} else if (bill > 100 & bill < 200) {

			int unitprice = 2;

			int powerbill = bill * 2;
			System.out.println(powerbill);

		}else {
			
			
			
		}

	}

}
