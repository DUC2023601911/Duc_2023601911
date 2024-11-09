package chuong2;

import java.util.Scanner;

public class TimSinhVien {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập vào số lượng sinh viên: ");
	        int n = scanner.nextInt();
	        int[] diem = new int[n];

	        System.out.println("Nhập điểm của từng sinh viên:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Điểm của sinh viên " + (i + 1) + ": ");
	            diem[i] = scanner.nextInt();
	        }

	        System.out.print("Nhập vào điểm cần tìm: ");
	        int diemCanTim = scanner.nextInt();
	        boolean found = false;

	        System.out.println("Sinh viên có điểm bằng " + diemCanTim + " là:");
	        for (int i = 0; i < n; i++) {
	            if (diem[i] == diemCanTim) {
	                System.out.println("Sinh viên " + (i + 1) + " có điểm: " + diem[i]);
	                found = true;
	            }
	        }

	        if (!found) {
	            System.out.println("Không có sinh viên nào có điểm bằng " + diemCanTim);
	        }
}
}