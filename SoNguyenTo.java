package chuong2;

import java.util.Scanner;

public class SoNguyenTo {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập vào một số nguyên: ");
	        int n = scanner.nextInt();

	        if (isPrime(n)) {
	            System.out.println(n + " là số nguyên tố.");
	        } else {
	            System.out.println(n + " không phải là số nguyên tố.");
	        }
	    }

	    public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
}
