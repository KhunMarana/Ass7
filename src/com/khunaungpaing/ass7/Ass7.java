package com.khunaungpaing.ass7;

public class Ass7 {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			int num = 1;
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 0; k <= i * 2; k++) {
				System.out.print(num);
				num++;
			}

			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			int num = 1;
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = 8; k >= i*2; k--) {
				System.out.print(num);
				num++;
			}

			System.out.println();
		}
	}
}
