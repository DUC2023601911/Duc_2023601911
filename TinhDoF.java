package chuong2;

import java.util.Scanner;

public class TinhDoF {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập vào nhiệt độ C: ");
	        double celsius = scanner.nextDouble();

	        double fahrenheit = celsius * 1.8 + 32;
	        System.out.println("Nhiệt độ F tương ứng là: " + fahrenheit);
	    }
}
